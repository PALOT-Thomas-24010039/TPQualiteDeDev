package test;

import main.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class testFizzBuzz {

    @Test
    public void testFizz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.getResult(3));
    }

    @Test
    public void testBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.getResult(5));
    }

    @Test
    public void testFizzBuzz15(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz", fizzBuzz.getResult(15));
    }

    @Test
    public void testBuzzBuzz1(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.getResult(1));
    }


}
