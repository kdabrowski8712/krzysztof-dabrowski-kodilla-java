package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public String beautify(String input , PoemDecorator decorator) {
        return decorator.decorate(input);
    }
}
