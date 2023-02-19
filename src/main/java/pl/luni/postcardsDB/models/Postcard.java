package pl.luni.postcardsDB.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Postcard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private Date created;

    @ManyToOne
    private Country countryOfOrigin;

    @PrePersist
    void autogenerateCreated() {
        this.created = new Date();
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Country getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(Country countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public Date getCreated() {
        return created;
    }
}
