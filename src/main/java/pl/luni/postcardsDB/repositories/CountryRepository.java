package pl.luni.postcardsDB.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.luni.postcardsDB.models.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
