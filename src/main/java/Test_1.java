import recursion.RecursionApplication;

import java.util.Arrays;

public class Test_1 {
    public static void main(String[] args) {
        RandomX list = new RandomX();
        list.add(1);
        list.add(2);
        System.out.println(Arrays.toString(list.getAll()));

        RecursionApplication recursionApplication = new RecursionApplication();
        recursionApplication.init(20);

        System.out.println("Factorial: " + recursionApplication.factorial(4));
    }
}
