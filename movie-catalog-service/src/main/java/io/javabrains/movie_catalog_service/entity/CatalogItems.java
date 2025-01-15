package io.javabrains.movie_catalog_service.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;




public class CatalogItems {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id; // Use an ID field for database-generated value

    private String name;
    private String desc;
    private int rating;

    public CatalogItems(String name, String desc, int rating) {
        this.rating = rating;
        this.desc = desc;
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
