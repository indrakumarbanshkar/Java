package Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
//Method	Description
//add(element)	This method is used to add a specific element to the set. The function adds the element only if the specified element is not already present in the set else the function returns False if the element is already present in the Set.
//addAll(collection)	This method is used to append all of the elements from the mentioned collection to the existing set. The elements are added randomly without following any specific order.
//clear()	This method is used to remove all the elements from the set but not delete the set. The reference for the set still exists.
//contains(element)	This method is used to check whether a specific element is present in the Set or not.
//containsAll(collection)	This method is used to check whether the set contains all the elements present in the given collection or not. This method returns true if the set contains all the elements and returns false if any of the elements are missing.
//hashCode()	This method is used to get the hashCode value for this instance of the Set. It returns an integer value which is the hashCode value for this instance of the Set.
//isEmpty()	This method is used to check whether the set is empty or not.
//iterator()	This method is used to return the iterator of the set. The elements from the set are returned in a random order.
//remove(element)	This method is used to remove the given element from the set. This method returns True if the specified element is present in the Set otherwise it returns False.
//removeAll(collection)	This method is used to remove all the elements from the collection which are present in the set. This method returns true if this set changed as a result of the call.
//retainAll(collection)	This method is used to retain all the elements from the set which are mentioned in the given collection. This method returns true if this set changed as a result of the call.
//size()	This method is used to get the size of the set. This returns an integer value which signifies the number of elements.
//toArray()	This method is used to form an array of the same elements as that of the Set.//
public class SetAllMethods {
    // Demonstrating Set using HashSet
    // Declaring object of type String
    public static void main(String[] args) {
        Set<String> hash_Set = new HashSet<String>();

        // Adding elements to the Set
        // using add() method
        hash_Set.add("Indra");
        hash_Set.add("kumar");
        hash_Set.add("verma");
        hash_Set.add("ji");
        hash_Set.add("tommy");
        // Printing elements of HashSet object
        System.out.println(hash_Set);


        // Creating an object of Set class
        // Declaring object of Integer type
        Set<Integer> a = new HashSet<Integer>();

        // Adding all elements to List
        a.addAll(Arrays.asList(
                new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));

        // Again declaring object of Set class
        // with reference to HashSet
        Set<Integer> b = new HashSet<Integer>();

        b.addAll(Arrays.asList(
                new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));
        // To find union
        Set<Integer> union = new HashSet<Integer>(a);
        System.out.println("union before adding"+ union);
        union.addAll(b);
        System.out.print("Union of the two Set");
        System.out.println(union);
        // To find intersection
        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.print("Intersection of the two Set");
        System.out.println(intersection);
        // To find the symmetric difference
        Set<Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b);
        System.out.print("Difference of the two Set");
        System.out.println(difference);

        /* retainAll methods */
        try {
            // Creating object of Set
            Set<Integer> arrset1 = new HashSet<Integer>();
            // Populating arrset1
            arrset1.add(1);
            arrset1.add(2);
            arrset1.add(3);
            arrset1.add(4);
            arrset1.add(5);
            // print arrset1
            System.out.println("Set before retainAll() operation : "
                    + arrset1);
            // Creating another object of  Set
            Set<Integer> arrset2 = new HashSet<Integer>();
            arrset2.add(1);
            arrset2.add(2);
            arrset2.add(3);

            // print arrset2
            System.out.println("Collection Elements to be retained : "
                    + arrset2);
            // Removing elements from arrset
            // specified in arrset2
            // using retainAll() method
            arrset1.retainAll(arrset2);
            // print arrset1
            System.out.println("Set after retainAll() operation : "
                    + arrset1);
        }
        catch (NullPointerException e) {
            System.out.println("Exception thrown : " + e);
        }

        /* toArray Methods */

        Set<Integer> abs_col = new HashSet<Integer>();

        // Use add() method to add
        // elements into the Set
        abs_col.add(10);
        abs_col.add(15);
        abs_col.add(30);
        abs_col.add(20);
        abs_col.add(5);
        abs_col.add(25);

        // Displaying the Set
        System.out.println("The Set: " + abs_col);

        // Creating the array and using toArray()
        Integer[] arr = abs_col.toArray(new Integer[0]);

        System.out.println("The array is:");
        for (int j = 0; j < arr.length; j++)
            System.out.println(arr[j]);

    }

}
