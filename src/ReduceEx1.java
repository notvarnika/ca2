import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class ReduceEx1 {
    public static void main(String[] args) {

        //sum of all EVEN element in the list
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        Integer res = a.stream().reduce(0,(sum,num)->{
            if(num%2==0){
                sum+=num;
            }
            return sum;
        });
        System.out.println(res);


        //product of all element in list
        Integer mul = a.stream().reduce(1,(c,b)->c*b);
        System.out.println(mul);


        //max in list
        Integer max = a.stream().reduce(Integer.MIN_VALUE,(x,y)->x>y?x:y);
        System.out.println(max);


        //min in list
        Integer min = a.stream().reduce(Integer.MAX_VALUE,(o,v)->o<v?o:v);
        System.out.println(min);


        //concat all string in a list
        ArrayList<String> s = new ArrayList<>(Arrays.asList("varnika","somil","fdjudjsu","rgyfwesued"));
        String con = s.stream().reduce("",(i,b)->i+b);
        System.out.println(con);

        //count even numbers
        Integer evenNum = a.stream().reduce(0,(count, num)->{
            if(num%2==0)count++;
            return count;
        });
        System.out.println(evenNum);

        //all element sum in a list
        Integer sumAll = a.stream().reduce(0, (w,b) -> w + b);
        System.out.println(sumAll);


        //longest string in list
        String longest = s.stream().reduce("", (w, b) -> w.length() >= b.length() ? w : b);
        System.out.println(longest);


        //highest number of vowel
        String maxVowelString = s.stream().reduce("", (w, b) -> {
            long vowelsA = w.chars().filter(ch -> "aeiouAEIOU".indexOf(ch) >= 0).count();
            long vowelsB = b.chars().filter(ch -> "aeiouAEIOU".indexOf(ch) >= 0).count();
            return vowelsA >= vowelsB ? w : b;
        });
        System.out.println(maxVowelString);

        // reverse a string
        String str = "varnika";
        String reversed = str.chars()
                .mapToObj(c -> String.valueOf((char)c))
                .reduce("", (rev, ch) -> ch + rev);

        System.out.println(reversed);



    }

}
