import java.util.*;
import java.util.stream.*;

public class StreamPractice {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 12, 15, 18, 20, 21, 55, 60, 12, 18);

        // 1. Print only the first 5 even numbers from the list
        System.out.println("// First 5 even numbers");
        nums.stream()
                .filter(n -> n % 2 == 0)
                .limit(5)
                .forEach(System.out::println);

        // 2. Skip last 2 elements using stream
        System.out.println("// Skip last 2 elements");
        nums.stream()
                .limit(nums.size() - 2)
                .forEach(System.out::println);

        // 3. Count how many numbers are greater than 50
        System.out.println("// Count numbers > 50");
        long countGreater50 = nums.stream()
                .filter(n -> n > 50)
                .count();
        System.out.println(countGreater50);

        // 4. Count distinct elements from the list
        System.out.println("// Count distinct elements");
        long distinctCount = nums.stream()
                .distinct()
                .count();
        System.out.println(distinctCount);

        // 5. Skip first 2 numbers, then take next 3 and print
        System.out.println("// Skip first 2, take next 3");
        nums.stream()
                .skip(2)
                .limit(3)
                .forEach(System.out::println);

        // 6. Count distinct values after skipping first 3
        System.out.println("// Distinct count after skipping first 3");
        long distinctAfterSkip = nums.stream()
                .skip(3)
                .distinct()
                .count();
        System.out.println(distinctAfterSkip);
    }
}
