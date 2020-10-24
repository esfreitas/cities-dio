package com.github.esfreitas.citiesapi;
import com.github.esfreitas.citiesapi.countries.Country;
import com.github.esfreitas.citiesapi.countries.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    private CountryRepository repository;

    public CountryResource(CountryRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Country> countries(){

        return repository.findAll();
    }
 }
