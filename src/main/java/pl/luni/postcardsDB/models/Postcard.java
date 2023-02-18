package pl.luni.postcardsDB.models;

import jakarta.persistence.*;

@Entity
public class Postcard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    private Country countryOfOrigin;

}
