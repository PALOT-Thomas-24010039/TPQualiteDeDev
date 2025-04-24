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
    public void testBuzzBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("2", fizzBuzz.getResult(2));
    }

    @Test
    public void testFizzBuzz9(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.getResult(9));
    }

    @Test
    public void testBuzzBuzz10(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.getResult(10));
    }

    @Test
    public void testFizzBuzz0(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz", fizzBuzz.getResult(0));
    }

}
