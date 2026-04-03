import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReduceEx2 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(12,45,6,7,8,0,3));
        Integer res = a.stream().reduce(1, (x, y) -> x * (y * y));
        System.out.println(res);
/*
        List<Integer> li1 = Arrays.asList(1,2,3);
        List<Integer> li2 = Arrays.asList(3,4,5);
        List <Integer> li3 = Arrays.asList(8,56,9);
        List<Integer> res1 =*/

    }
}
