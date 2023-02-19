package pl.luni.postcardsDB.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.luni.postcardsDB.models.Postcard;

public interface PostcardRepository extends JpaRepository<Postcard, Long> {
}
