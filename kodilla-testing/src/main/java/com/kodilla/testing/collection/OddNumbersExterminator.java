package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer>  exterminate(List<Integer> numbers) {
        List<Integer> result = new ArrayList<Integer>();

        if(numbers.size() !=0) {
            for(Integer number : numbers) {
                if(number % 2 ==0) {
                    result.add(number);
                }
            }
        }

        return result;
    }
}
