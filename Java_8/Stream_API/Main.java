package Java_8.Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args)
    {
        //Filter
        List<Integer> num = Arrays.asList(2,324,34,3,43,5,434,43,43,43,545);

        List<Integer> evenNum = num.stream().filter(i-> i%2 == 0).toList();

        //Maximum
        int maximum = num.stream().max((n1,n2)-> n1.compareTo(n2)).get();
        System.out.println(maximum);

        //Minimum
        int minimum = num.stream().min((n1,n2)-> n1.compareTo(n2)).get();
        System.out.println(minimum);

        //Map in Stream
        List<String> str = Arrays.asList("aman","neha","shruti");
        List<String> upperCaseStr = str.stream().map(String::toUpperCase).toList();

        //Count in Stream
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        long count = numbers.stream().count();
        System.out.println(count);

        //sort in Stream
        List<Integer> sortedNum = numbers.stream().sorted().toList();
        System.out.println(sortedNum);
    }
}
