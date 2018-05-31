package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.lambda.reference.FunctionalCalculator;

import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class StreamMain {
    public static void main(String[] args) {
        Processor processor = new Processor();
        processor.execute(() -> System.out.println("This is an example text."));
        System.out.println();

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
        System.out.println();
        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println();
        System.out.println("Making texts more beautiful");
        poemBeautifier.beautify("Joanna", "wonderful", " K",
                (textToBeautify, beautifulAdjective, addingLetter)->beautifulAdjective + " " +
                        toUpperCase(textToBeautify) + " K");
        poemBeautifier.beautify("Warsaw", "huge", " C",
                (textToBeautify, beautifulAdjective, addingLetter) -> beautifulAdjective+ " " +
                       toUpperCase(textToBeautify)+ " is a very big city " + addingLetter);
        poemBeautifier.beautify("Kodilla", "interesting", "ABC",
                (textToBeautify, beautifulAdjective, addingLetter) ->
                        textToBeautify + addingLetter + " is very "+ beautifulAdjective);
        poemBeautifier.beautify("Summer", "hot", "a",
                (textToBeautify, beautifulAdjective, addingLetter) -> textToBeautify + " is "+ beautifulAdjective);

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
