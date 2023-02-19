package pl.luni.postcardsDB.controlers;

import org.springframework.web.bind.annotation.*;
import pl.luni.postcardsDB.models.Country;
import pl.luni.postcardsDB.models.Postcard;
import pl.luni.postcardsDB.repositories.PostcardRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("postcards")
public class PostcardControler {

    private final PostcardRepository repository;

    public PostcardControler(PostcardRepository repository) {
        this.repository = repository;
    }

    @GetMapping("")
    public List<Postcard> list (){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Postcard> getPostcard(@PathVariable Long id) {
        return repository.findById(id);
    }

    @PostMapping("")
    public Postcard createPostcard(Postcard newPostcard){
        return repository.save(newPostcard);
    }


}
