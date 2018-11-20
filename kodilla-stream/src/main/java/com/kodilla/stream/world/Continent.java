package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public final class Continent {
    private final String name;
    private final Set<Country> countries = new HashSet<>();

    public Continent(String name) {
        this.name = name;
    }

    public void addCountry(BigDecimal quantity , String name) {
        countries.add(new Country(name,quantity));
    }

    public Set<Country> getCountries() {
        return countries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Continent continent = (Continent) o;

        if (!name.equals(continent.name)) return false;
        return countries.equals(continent.countries);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + countries.hashCode();
        return result;
    }
}
