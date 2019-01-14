package com.kodilla.spring.calculator;

import com.kodilla.spring.forum.ForumUser;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testAddition(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");

        Calculator calc = (Calculator)context.getBean("calculator");


        //When
        double result = calc.add(2,3);

        //Then
        Assert.assertEquals(5,result,0.001);
    }

    @Test
    public void testDivision(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");

        Calculator calc = (Calculator)context.getBean("calculator");


        //When
        double result = calc.div(20,2);

        //Then
        Assert.assertEquals(10,result,0.001);
    }

    @Test
    public void testSubtraction(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");

        Calculator calc = (Calculator)context.getBean("calculator");


        //When
        double result = calc.sub(7,5);

        //Then
        Assert.assertEquals(2,result,0.001);
    }

    @Test
    public void testMultiplication(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");

        Calculator calc = (Calculator)context.getBean("calculator");


        //When
        double result = calc.mul(20,3);

        //Then
        Assert.assertEquals(60,result,0.001);
    }

}
