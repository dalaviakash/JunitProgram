package org.example.Fibonacci;


import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {
    @Test
    public void testFibonacci(){

        int exceptedResult[]={0,1,1,2,3,5};
        for (int i=0;i<exceptedResult.length;i++) {
            int result = Fibonacci.calculateFibonacci(i);
            System.out.println(result);
            assertEquals(exceptedResult[i],result);
        }
    }
}
