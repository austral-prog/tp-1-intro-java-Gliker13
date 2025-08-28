package com.template;
import java.util.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
        for (int i = input.length() - 1; i >= 0; i--) {
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
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    // 10. Convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        // TODO: Implement this method 	
        return (celsius * 9/5) + 32;
    }

    // 11. Sum of Elements in a List
    public int sumList(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    // 12. Find the Largest Element in a List
    public int findMax(List<Integer> list) {
        // TODO: Implement this method
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }
        int max = list.get(0);
        for (int num : list) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // 13. Filter Even Numbers from a List
    public List<Integer> filterEvenNumbers(List<Integer> list) {
        List<Integer> evens = new ArrayList<>();
        for (int num : list) {
            if (num % 2 == 0) {
                evens.add(num);
            }
        }
        return evens;
    }

    // 14. Concatenate Two Lists
    public List<String> concatenateLists(List<String> list1, List<String> list2) {
        List<String> result = new ArrayList<>(list1);
        result.addAll(list2);
        return result;
    }

    // 15. Check if List Contains Element
    public boolean listContains(List<String> list, String element) {
        return list.contains(element);
    }

    // 16. Convert Strings to Uppercase
    public List<String> toUpperCase(List<String> list) {
        List<String> upper = new ArrayList<>();
        for (String s : list) {
            upper.add(s.toUpperCase());
        }
        return upper;
    }

    // 17. Remove Duplicates from a List
    public List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }

    // 18. Convert List to Set for Unique Elements
    public Set<Integer> listToSet(List<Integer> list) {
        return new HashSet<>(list);
    }

    // 19. Check if Map Contains Key
    public boolean mapContainsKey(Map<String, String> map, String key) {
        return map.containsKey(key);
    }

    // 20. Check if Map Contains Value
    public boolean mapContainsValue(Map<String, String> map, String value) {
        return map.containsValue(value);
    }

    // 21. Iterate Over a Map
    public List<String> iterateMap(Map<String, String> map) {
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            result.add(entry.getKey() + " -> " + entry.getValue());
        }
        return result;
    }
}
