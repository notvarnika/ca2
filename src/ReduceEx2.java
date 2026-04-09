import java.util.*;
import java.util.stream.*;

class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ReduceEx2 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

        // 11. Product of squares using reduce()
        System.out.println("// Product of squares");
        int productSquares = nums.stream()
                .map(n -> n * n)
                .reduce(1, (a, b) -> a * b);
        System.out.println(productSquares);

        // 12. Merge multiple lists into one
        System.out.println("// Merge lists");
        List<Integer> list1 = Arrays.asList(1, 2);
        List<Integer> list2 = Arrays.asList(3, 4);
        List<Integer> list3 = Arrays.asList(5, 6);
        List<Integer> merged = Stream.of(list1, list2, list3)
                .reduce(new ArrayList<>(), (a, b) -> { a.addAll(b); return a; });
        System.out.println(merged);

        // 13. Factorial using reduce()
        System.out.println("// Factorial of 5");
        int factorial = IntStream.rangeClosed(1, 5)
                .reduce(1, (a, b) -> a * b);
        System.out.println(factorial);

        // 14. Oldest person using reduce()
        System.out.println("// Oldest person");
        List<Person> people = Arrays.asList(
                new Person("A", 25),
                new Person("B", 40),
                new Person("C", 35)
        );
        Person oldest = people.stream()
                .reduce((p1, p2) -> p1.age > p2.age ? p1 : p2)
                .get();
        System.out.println(oldest.name + " (" + oldest.age + ")");

        // 15. Join integers into string
        System.out.println("// Join integers");
        String joined = nums.stream()
                .map(String::valueOf)
                .reduce((a, b) -> a + " -> " + b)
                .get();
        System.out.println(joined);

        // 16. Second largest number
        System.out.println("// Second largest");
        int secondLargest = nums.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        System.out.println(secondLargest);

        // 17. Sum of squares
        System.out.println("// Sum of squares");
        int sumSquares = nums.stream()
                .map(n -> n * n)
                .reduce(0, (a, b) -> a + b);
        System.out.println(sumSquares);

        // 18. Combine maps with value addition
        System.out.println("// Combine maps");
        Map<String, Integer> m1 = Map.of("a", 1, "b", 2);
        Map<String, Integer> m2 = Map.of("a", 3, "c", 4);
        Map<String, Integer> combined = Stream.of(m1, m2)
                .reduce(new HashMap<>(), (a, b) -> {
                    b.forEach((k, v) -> a.merge(k, v, Integer::sum));
                    return a;
                });
        System.out.println(combined);

        // 19. Custom reduce implementation
        System.out.println("// Custom reduce (sum)");
        int customSum = customReduce(nums, 0, (a, b) -> a + b);
        System.out.println(customSum);

        // 20. Join strings with commas (no trailing comma)
        System.out.println("// Join strings");
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        String csv = words.stream()
                .reduce((a, b) -> a + "," + b)
                .get();
        System.out.println(csv);
    }

    // Custom reduce method
    public static <T> T customReduce(List<T> list, T identity, java.util.function.BinaryOperator<T> accumulator) {
        T result = identity;
        for (T element : list) {
            result = accumulator.apply(result, element);
        }
        return result;
    }
}
