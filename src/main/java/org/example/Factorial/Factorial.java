package org.example.Factorial;

public class Factorial {

    public static int calculateFactorial(int n) throws IllegalAccessException {
   if (n<0){
       throw new IllegalAccessException("it is Negative Number");
   }else if (n==0){
       return 1;
   }


   return n * calculateFactorial(n-1);
    }
}
