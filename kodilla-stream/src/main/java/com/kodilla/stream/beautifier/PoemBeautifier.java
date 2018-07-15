package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String textToBeautify, String beautifulAdjective, String addingLetter, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(textToBeautify, beautifulAdjective, addingLetter);
        System.out.println("Result of making text more beautiful is: " + result);
    }
}
