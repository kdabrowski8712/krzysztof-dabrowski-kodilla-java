package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public final class World {
    private final Set<Continent> continents = new HashSet<>();

    public void addContinent(Continent c){
        continents.add(c);
    }

    public BigDecimal getPeopleQuantity(){
        //BigDecimal result = BigDecimal.ZERO;

        Set<Country> countres = continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .collect(Collectors.toSet());

        BigDecimal result = countres.stream()
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO,(sum,current) -> sum = sum.add(current));

        return result;
    }
}
