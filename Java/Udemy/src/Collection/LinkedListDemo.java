package Collection;

import java.util.LinkedList;

public class LinkedListDemo {
    private static long start;

    public static void main(String[] args) {
        Object objects [] = new Object[1000];
        for (int i = 0; i < objects.length; i++) {
            objects[i]= new Object();
        }
        LinkedList<Object> list = new LinkedList<>();
        for (Object object:objects) {
            long start = System.currentTimeMillis();
            System.out.println(start);
            list.add(object);
        }
        long end = System.currentTimeMillis();
        System.out.println(end);
        System.out.println(end - start);
        }
    }
    

