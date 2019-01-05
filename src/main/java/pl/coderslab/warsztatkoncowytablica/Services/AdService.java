package pl.coderslab.warsztatkoncowytablica.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.warsztatkoncowytablica.DTO.AdDto;
import pl.coderslab.warsztatkoncowytablica.Entities.Ad;
import pl.coderslab.warsztatkoncowytablica.Repositories.AdRepository;

import java.util.Collection;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class AdService implements BaseService<AdDto, Long> {

  private final AdRepository adRepository;

  @Autowired
  public AdService(AdRepository adRepository) {
    this.adRepository = adRepository;
  }

  @Override
  public AdDto save(AdDto dto) {
    Ad ad = new Ad();
    ad.setTitle(dto.getTitle());
    ad.setDescription(dto.getDescription());
    adRepository.save(ad);
    return ad.toDto();
  }

  @Override
  public AdDto update(AdDto dto) {
    Ad ad = adRepository.findAdById(dto.getId());
    ad.setTitle(dto.getTitle());
    ad.setDescription(dto.getDescription());
    adRepository.save(ad);
    return null;
  }

  @Override
  public AdDto find(Long id) {
    Ad ad = adRepository.findAdById(id);
    if (Objects.nonNull(ad)) {
      return ad.toDto();
    }
    return null;
  }

  @Override
  public Boolean remove(Long id) {
    Ad ad = adRepository.findAdById(id);
    adRepository.delete(ad);
    return true;
  }

  @Override
  public Collection<AdDto> getAll() {
    return adRepository
        .findAll()
        .stream()
        .filter(Objects::nonNull)
        .map(Ad::toDto)
        .collect(Collectors.toList());
  }
}
