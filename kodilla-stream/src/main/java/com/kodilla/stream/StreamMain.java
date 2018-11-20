package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.immutable.Book;
import com.kodilla.stream.immutable.BookDirectory;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;
import com.kodilla.stream.world.Continent;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamMain {
    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - Stream");

       /* Processor processor = new Processor();
        Executor executorSaySomething = () -> System.out.println("Test");
        processor.execute(executorSaySomething);
        processor.execute( () -> System.out.println("Test 2") );


        System.out.println("Calculating with lambda");
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        expressionExecutor.executeExpression(10,5,(a,b) -> a+b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating with references");

        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println("Poeam beautfier lambda excercies ");

        PoemBeautifier beautifier= new PoemBeautifier();

        System.out.println(beautifier.beautify("text1",(input -> "ABC" + input + "ABC")));
        System.out.println(beautifier.beautify("text2",(input -> input.toUpperCase())));
        System.out.println(beautifier.beautify("text3",(input -> input + "," + input + "," + input)));
        System.out.println(beautifier.beautify("text2",(input) -> input.substring(0,1).toUpperCase() + " " + input));


        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);*/

        /*People.getList().stream()
                .forEach(System.out::println);

        System.out.println();
        System.out.println();

        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);

        System.out.println();
        System.out.println();

        BookDirectory theBookDirectory = new BookDirectory();
        List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toList());

        System.out.println();
        System.out.println();

        System.out.println("# elements: " + theResultListOfBooks.size());
        theResultListOfBooks.stream()
                .forEach(System.out::println);

        System.out.println();
        System.out.println();

        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

        System.out.println();
        System.out.println();


        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);

        Forum myForum = new Forum();

*/
//        Forum myForum = new Forum();
//
//        Map<Integer, ForumUser> filteredUsers =  myForum.getUserList().stream()
//                .filter(user -> user.getSex() == 'M')
//                .filter(user -> (Period.between(user.getDateOfBirth(),LocalDate.now())).getYears() >=20 )
//                .filter(user -> user.getPostNumber() >=1)
//                .collect(Collectors.toMap(ForumUser::getId,user -> user));
//
//        System.out.println();
//        System.out.println("# elements: " + filteredUsers.size());
//        filteredUsers.entrySet().stream()
//                .map(entry -> entry.getKey() + ": " + entry.getValue())
//                .forEach(System.out::println);
//
//        Continent test = new Continent("Europe");
//        test.addCountry(new BigDecimal("1000000"),"test");
//
//        test.getCountries().stream()
//                .forEach(System.out::println);


        List<Integer> testInt = Arrays.asList(24,1,113);

        int max = IntStream.range(0,testInt.size())
                .map(n -> testInt.get(n))
                .max().getAsInt();

        System.out.println(max);


        }



    }

