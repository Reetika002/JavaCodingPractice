package JavaBasics;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableTest {

}

class Drink implements Comparable {
    String name;

    public int compareTo(Object o) {

        return 0;
    }


    public static void main(String[] args) {
        Drink one = new Drink();
        Drink two = new Drink();
        one.name = "Coffee";
        two.name = "Tea";

        TreeSet<Drink> set = new TreeSet<>();
        set.add(one);
        set.add(two);

//        System.out.println(set);

        Iterator<Drink> itr = set.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next().name);
        }


    }
}
