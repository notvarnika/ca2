import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class ReduceEx1 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        Integer res = a.stream().reduce(0,(sum,num)->{
            if(num%2==0){
                sum+=num;
            }
            return sum;
        });
        System.out.println(res);


        Integer mul = a.stream().reduce(1,(c,b)->c*b);
        System.out.println(mul);


        Integer max = a.stream().reduce(Integer.MIN_VALUE,(x,y)->x>y?x:y);
        System.out.println(max);


        Integer min = a.stream().reduce(Integer.MAX_VALUE,(o,v)->o<v?o:v);
        System.out.println(min);


        ArrayList<String> s = new ArrayList<>(Arrays.asList("varnika","somil","fdjudjsu","rgyfwesued"));
        String con = s.stream().reduce("",(i,b)->i+b);
        System.out.println(con);

        Integer evenNum = a.stream().reduce(0,(count, num)->{
            if(num%2==0)count++;
            return count;
        });
        System.out.println(evenNum);

        Integer sumAll = a.stream().reduce(0, (w,b) -> w + b);
        System.out.println(sumAll);



        String longest = s.stream().reduce("", (w, b) -> w.length() >= b.length() ? w : b);
        System.out.println(longest);


        String maxVowelString = s.stream().reduce("", (w, b) -> {
            long vowelsA = w.chars().filter(ch -> "aeiouAEIOU".indexOf(ch) >= 0).count();
            long vowelsB = b.chars().filter(ch -> "aeiouAEIOU".indexOf(ch) >= 0).count();
            return vowelsA >= vowelsB ? w : b;
        });
        System.out.println(maxVowelString);

        String str = "varnika";
        String reversed = str.chars()
                .mapToObj(c -> String.valueOf((char)c))
                .reduce("", (rev, ch) -> ch + rev);

        System.out.println(reversed);



    }

}
