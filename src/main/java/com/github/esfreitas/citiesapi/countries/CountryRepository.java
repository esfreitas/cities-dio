package com.github.esfreitas.citiesapi.countries;

import com.github.esfreitas.citiesapi.countries.Country;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
