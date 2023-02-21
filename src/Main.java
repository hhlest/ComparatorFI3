
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(62,2000,306,55,12));
        System.out.println("initial list: " + list);

        Function<Integer, Integer> f = a -> (int) a.toString().toCharArray()[0] + (int) a.toString().toCharArray()[1];
        Comparator<Integer> comp1 = (a,b)-> f.apply(a) - f.apply(b);
        list.sort(comp1);
        System.out.println("transformed list: " + list);
    }
}