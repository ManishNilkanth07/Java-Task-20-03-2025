package Java_8.Lamda_expression;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;

public class Main {
    public static void main(String[] args)
    {
        //Lamda with string
        Function<String ,String> reverse = str -> new StringBuilder(str).reverse().toString();
        System.out.println(reverse.apply("codeD"));

        //Lamda with comparator
        List<Integer> num = Arrays.asList(2,32,43,34,34,232,3);
        num.sort(Comparator.comparingInt(n -> n));
        System.out.println(num);

    }
}
