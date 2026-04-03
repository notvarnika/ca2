import java.util.ArrayList;
import java.util.Arrays;

public class StreamEx1 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);a.add(3);a.add(4);a.add(5);a.add(6);a.add(7);a.add(8);
        a.add(102);a.add(105);a.add(100);a.add(19);a.add(18);a.add(16);a.add(15);a.add(12);
        a.stream().filter(n->n%3==0 && n%5!=0).forEach(System.out::println);

        ArrayList<String> s = new ArrayList<>();
        s.add("VARN");
        s.add("SOMILN");
        s.add("JIYAN");
        s.add("surajmal");
        s.add("pie");
        s.stream().filter(n->n.endsWith("N")).forEach(System.out::println);

        ArrayList<Integer> salary = new ArrayList<>();
        salary.add(1000000);
        salary.add(50000);
        salary.add(510000);
        salary.add(10);
        salary.stream().filter(n->n>50000).forEach(System.out::println);

        ArrayList<String> d = new ArrayList<>();
        d.add("dede");
        d.add("jojeo");
        d.add("koko");
        d.add("vaeda");
        d.stream().filter(n-> n.contains("e")).forEach(System.out::println);

        ArrayList<Integer> p = new ArrayList<>();
        p.add(2);
        p.add(3);
        p.add(4);
        p.add(9);
        p.add(10);
        p.add(11);
        p.add(17);
        p.stream().filter(n->isPrime(n)).forEach(System.out::println);


        ArrayList <Integer> o = new ArrayList<>(Arrays.asList(12,34,56,2,3,4,5,19));
        o.stream()
                .filter(k -> k * k > 500)
                .forEach(System.out::println);


        ArrayList<String> emails = new ArrayList<>(Arrays.asList(
                "varnika@gmail.com",
                "somiln@yahoo",
                "jiyan123@outlook.com",
                "invalidEmail",
                "surajmal@domain"
        ));

        emails.stream()
                .filter(e -> e.contains("@") && e.contains("."))
                .forEach(System.out::println);


    }
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;

    }
}
