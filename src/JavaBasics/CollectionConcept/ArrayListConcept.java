package JavaBasics.CollectionConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListConcept {

    public static void main(String[] args) {

        ArrayList<Integer> ar = new ArrayList<Integer>();

        ar.add(10);
        ar.add(20);

        System.out.println(ar.size());

        ar.add(30);
        ar.add(40);

        System.out.println(ar.size());

        System.out.println(ar.get(3));

        for(int i=0; i <ar.size(); i++)
        {
            System.out.println(ar.get(i));
        }

        //traverse using iterator

        Iterator<Integer> it  = ar.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

        Employee e1 = new Employee(2323,34,"kishore");
        Employee e2 = new Employee(423,24,"Munesh");
        Employee e3 = new Employee(232433,54,"Vishal");

        ArrayList<Employee> ar1 = new ArrayList<Employee>();
        ar1.add(e1);
        ar1.add(e2);
        ar1.add(e3);

        Iterator<Employee> it1 = ar1.iterator();
        while (it1.hasNext())
        {
            Employee emp = it1.next();
            System.out.println(emp.id);
            System.out.println(emp.age);
            System.out.println(emp.name);
        }


    }
}
