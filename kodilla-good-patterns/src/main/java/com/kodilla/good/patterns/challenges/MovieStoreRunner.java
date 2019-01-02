package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class MovieStoreRunner {
    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        Map<String, List<String>> moviesMap =movieStore.getMovies();

        Optional<String> title = moviesMap.entrySet().stream().
                flatMap(entry -> entry.getValue().stream())
                .reduce((previousTitile, currentTitile) -> {
                    previousTitile = previousTitile + "!" + currentTitile;
                    return previousTitile;
                });

        if(title.isPresent()) {
            System.out.println(title.get());
        }


    }
}
