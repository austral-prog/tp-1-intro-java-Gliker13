package com.template;
import java.util.Arrays;

public class App {

    // 1. Sum of Two Integers
    public int sum(int a, int b) {
        // TODO: Implement this method
        return a + b;
    }

    // 2. Check Even or Odd
    public boolean isEven(int number) {
        // TODO: Implement this method
        if ((number % 2) == 0){
            return true;
        }
        return false;
    }

    // 3. Maximum of Two Numbers
    public int max(int a, int b) {
        // TODO: Implement this method
        if(a > b) {
            return a;
        }
        return b;
        
    }

    // 4. Factorial of a Number
    public int factorial(int n) {
        // TODO: Implement this method
        int result = 1;
        for (int i = 1;i <= n; i++){
            result = result * i;
        }
        return result;
    }

    // 5. Count Characters in a String
    public int countChars(String input) {
        // TODO: Implement this method
        return input.length();
    }

    // 6. Reverse a String
    public String reverse(String input) {
        // TODO: Implement this method
        String buffer = "";
        for (int i = input.length(); i >= 0;i--){
            buffer += input.charAt(i);
        }
        return buffer;
    }

    // 7. Check Prime Number
    public boolean isPrime(int number) {
        // TODO: Implement this method
        if (number <= 1){
               return false;
        }
        // Check from 2 to n-1
        for (int i = 2; i < number; i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

    // 8. Find the Smallest Element in an Array
    public int findMin(int[] array) {
        // TODO: Implement this method
        Arrays.sort(array);
        return array[0];
    }

    // 9. Sum of Elements in an Array
    public int arraySum(int[] array) {
        // TODO: Implement this method
        int sum = 0;
        for (int i = 0;i <= array.length;i++){
            sum += array[i];
        }
        return sum;
    }

    // 10. Convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        // TODO: Implement this method 	
        return (celsius * 9/5) + 32;
    }
}
