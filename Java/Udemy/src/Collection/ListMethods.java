package Collection;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        for (int i = 0; i <+100 ; i=i+10) {
            list.add(i);
        }
        System.out.println(list);
        list.add(2,100);
        System.out.println("addin 100 at index 2:" +list);
        list.set(2,300);
        System.out.println("set method will replace index 2: "+ list);
        List <Integer> secondList= new ArrayList<>();
        secondList.add(400);
        secondList.add(500);
        secondList.add(600);
        list.addAll(5,secondList);  /* addAll method will add all the Element from one list to another */
        System.out.println(list);

        if(list.contains(400)){
            System.out.println("value is present");/* Contains methods gives the information about element present or not */
        }
        else{
            System.out.println("Value is not present in list");
        }

        for(int i=0; i<list.size(); i++) { /* size method will tell the size of list and get method gives value of element*/
            System.out.println(list.get(i));

        }
        list.remove(3); /*remove() method delete element by index*/
        System.out.println(list);
    }

}
