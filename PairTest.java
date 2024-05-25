import java.util.ArrayList;
import java.util.List;

public class PairTest {
    public static void main(String[] args) {
        List<Pair<String, Integer>> l1 = new ArrayList<>(12);
        l1.add(new Pair<>("Январь", 31));
        l1.add(new Pair<>("Февраль", 28));
        l1.add(new Pair<>("Март", 31));
        l1.add(new Pair<>("Апрель", 30));
        l1.add(new Pair<>("Май", 31));
        l1.add(new Pair<>("Июнь", 30));
        l1.add(new Pair<>("Июль", 31));
        l1.add(new Pair<>("Август", 31));
        l1.add(new Pair<>("Сентябрь", 30));
        l1.add(new Pair<>("Октябрь", 31));
        l1.add(new Pair<>("Ноябрь", 30));
        l1.add(new Pair<>("Декабрь", 31));
        System.out.println(l1);
        List<Pair<Integer, String>> l2 = new ArrayList<>(5);
        l2.add(new Pair<>(7, "Россия"));
        l2.add(new Pair<>(33, "Франция"));
        l2.add(new Pair<>(20, "Египет"));
        l2.add(new Pair<>(39, "Италия"));
        l2.add(new Pair<>(61, "Австралия"));
        System.out.println(l2);
    }
}
