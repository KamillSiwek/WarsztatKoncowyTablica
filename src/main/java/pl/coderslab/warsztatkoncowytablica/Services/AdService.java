package pl.coderslab.warsztatkoncowytablica.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.warsztatkoncowytablica.Entities.Ad;

import java.util.Collection;

@Service
public class AdService implements BaseService<AdDto, Long> {

    private final AdRepository adRepository;

    @Autowired
    public AdService(AdRepository adRepository){
        this.adRepository = adRepository;
    }


    @Override
    public AdDto save(AdDto dto) {
        Ad ad = new Ad();

        adRepository.save(ad);
        return ad.toDto();
    }

    @Override
    public AdDto update(AdDto dto) {
        return null;
    }

    @Override
    public AdDto find(Long id) {
        return null;
    }

    @Override
    public Boolean remove(Long id) {
        return null;
    }

    @Override
    public Collection<AdDto> getAll() {
        return null;
    }
}


