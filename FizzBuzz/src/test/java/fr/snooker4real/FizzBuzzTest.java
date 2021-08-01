package fr.snooker4real;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz;
    @BeforeEach
    public void setUp(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void shouldReturn1IfNumberIs1(){
        assertEquals("1", new FizzBuzz().generate(1, 1));
    }
    @Test
    public void shouldReturn2IfNumberIs2(){
        assertEquals("2",new FizzBuzz().generate(2, 2));
    }
    @Test
    public void shouldReturnFizzIfNumberIs3(){
        assertEquals("Fizz",new FizzBuzz().generate(3, 3));
    }

    @Test
    public void shouldReturnFizzIfNumberIs6(){
        assertEquals("Fizz", new FizzBuzz().generate(6,6));
    }
    @Test
    public void shouldReturnFizzIfNumberIs9(){
        assertEquals("Fizz", new FizzBuzz().generate(9,9));
    }
    @Test
    public void shouldReturnBuzzIfNumberIs5(){
        assertEquals("Buzz", new FizzBuzz().generate(5,5));
    }
    @Test
    public void shouldReturnBuzzIfNumberIs10(){
        assertEquals("Buzz", new FizzBuzz().generate(10,10));
    }
    @Test
    public void shouldReturnFizzBuzzIfNumberIs15(){
        assertEquals("FizzBuzz", new FizzBuzz().generate(15,15));
    }
    @Test
    public void shouldReturnFizzBuzzIfNumberIs30(){
        assertEquals("FizzBuzz", new FizzBuzz().generate(30,30));
    }
    @Test
    public void shouldReturn12iPassedNumberAre1and2(){
        assertEquals("12", new FizzBuzz().generate(1,2));
    }

}
