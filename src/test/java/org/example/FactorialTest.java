package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FactorialTest {
    @Test
    public void FactorialShouldReturnExceptionInThisCase(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-1));
    }
    @Test
    public void FactorialShouldReturnCorrectFactorial(){
        Assertions.assertEquals(24,Factorial.factorial(4));
    }
}