package io.javabrains.movie_catalog_service.controller;


import io.javabrains.movie_catalog_service.entity.CatalogItems;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static java.util.Collection.*;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {

    @GetMapping("/{userId}")
    public List<CatalogItems> getCatalogItems(@PathVariable("userId") String userId){
        return Collections.singletonList(
                new CatalogItems("Transformers", "Test", 4)
        );
    }
}
