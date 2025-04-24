package test;

import main.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class testFizzBuzz {

    @Test
    public void TestFizzBuzz(){
        //fail("");
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.getResult(1));
    }
}
