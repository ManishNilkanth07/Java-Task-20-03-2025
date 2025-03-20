package Java_8.Functional_Interface;

import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
interface Adder
{
    int add(int a,int b);
}

public class Main {

    public static void main(String[] args)
    {
        Adder sum = (a, b) -> a+b;

        System.out.println(sum.add(34,34));

        //Predicate
        Predicate<String> stringPredicate = str-> str.startsWith("M");
        System.out.println(stringPredicate.test("Manish"));

        //Supplier
        Supplier<Integer> randomNumber = () -> new Random().nextInt(100);
        System.out.println(randomNumber.get());


    }
}
