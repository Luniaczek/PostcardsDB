package pl.luni.postcardsDB.controlers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.luni.postcardsDB.models.Country;
import pl.luni.postcardsDB.repositories.CountryRepository;

import java.util.List;

@RestController
public class CountryControler {
    private final CountryRepository repository;

    public CountryControler(CountryRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/countries")
    List<Country> list (){
        return repository.findAll();
    }
}
