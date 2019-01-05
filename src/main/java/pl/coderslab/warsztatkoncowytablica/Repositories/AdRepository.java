package pl.coderslab.warsztatkoncowytablica.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.warsztatkoncowytablica.Entities.Ad;

public interface AdRepository extends JpaRepository<Ad, Long> {

    Ad findAdById(Long id);
}
