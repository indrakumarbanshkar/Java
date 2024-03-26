package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(30);
        Iterator<Integer> itr =  list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            itr.remove();  /* remove all element rom list */
        }
        System.out.println(list);
    }
}
