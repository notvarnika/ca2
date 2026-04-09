import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;

public class MapFilterEx1 {
    public static void main(String[] args) {

        //use map to multiply each number by 2 and print new lists
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(2,3,5,6,7,8,9,5,43,2,2,2223,56,32,2,56));
        ArrayList<Integer> res1 = a.stream().map(x->x*2).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(res1);

        //list of string to upper case
        ArrayList<String> s = new ArrayList<>(Arrays.asList("hrifue", "gfydfcued","gdhyedcbe","dgycvd"));
        ArrayList<String> res2 = s.stream().map(x->x.toUpperCase())
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(res2);

        //find length of string
        ArrayList<String> o = new ArrayList<>(Arrays.asList("varnika","saloni"," ","cdnjsddss"));
        ArrayList<Integer> res3 = o.stream().map(x->x.length())
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(res3);

        //capitalize first word of every string
        ArrayList<String> l = new ArrayList<>(Arrays.asList("fdfssd","fvdcs","scsxcdx"));
        ArrayList<String> res4 = l.stream()
                                    .map(x->x.substring(0,1).toUpperCase()
                                     +x.substring(1).toLowerCase())
                                     .collect(Collectors.toCollection(ArrayList::new));
                System.out.println(res4);



    }

}
