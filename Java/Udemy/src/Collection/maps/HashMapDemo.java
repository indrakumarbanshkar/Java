
/*It contains key-pair values.
It can not have duplicate keys.
It may have one null key and multiple null values.
It is non-synchronized.
It does not provide a way to maintain the order of elements.
The default capacity of the Java HashMap class is 16 with a load factor of 0.75.
 */

package Collection.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("John",70);
        map.put("Tom", 40);
        map.put("Harry", 30);
        map.put("4", 15);
        map.put("You", 35);
        Set<String> keySet = map.keySet();
        System.out.println("Keys:"+keySet);
        Collection<Integer> values = map.values();
        System.out.println("values:"+values);
        for (String key:keySet
             ) {
            System.out.println("key :" + key +" , " +" values : "+ map.get(key));
        }
        // Print size and content of the Map
        System.out.println("Size of map is:- "
                + map.size());
        // Printing elements in object of Map
        System.out.println(map);
        // Checking if a key is present and if
        // present, print value by passing
        // random element
        if (map.containsKey("Harry")) {

            // Mapping
            int a = map.get("Harry");

            // Printing value for the corresponding key
            System.out.println("value for key"
                    + " \"vishal\" is:- " + a);

            // Displaying the HashMap
            System.out.println("Initial Mappings are: " + map);

            // Clearing the hash map using clear() method, clear() method in Java is used to clear and remove all of the elements or mappings from a specified HashMap

           // map.clear();

            // Displaying the final HashMap
            System.out.println("Finally the maps look like this: " + map);

            // Print and display the HashMap
            System.out.println("Initial Mappings are: "
                    + map);
//The java.util.HashMap.clone() method is present inside java.util package which typically is used to return a shallow copy of the mentioned hash map. It just creates a copy of the map.
            // Print and display the cloned HashMap
            // using clone() method
            System.out.println("The cloned map look like this: "
                    + ((HashMap<String, Integer>) map).clone());


            System.out.println("Initial Mappings are: " + map);
//The java.util.HashMap.containsKey() method is used to check whether a particular key is being mapped into the HashMap or not. It takes the key element as a parameter and returns True if that element is mapped in the map.
            // Checking for the key_element 'John'
            System.out.println("Is the key 'John' present? " +
                    map.containsKey("John"));

            // Checking for the key_element '5'
            System.out.println("Is the key '40' present? " +
                    map.containsKey(40));

            //The java.util.HashMap.containsValue() method is used to check whether a particular value is being mapped by a single or more than one key in the HashMap. It takes the Value as a parameter and returns True if that value is mapped by any of the key in the map.
            System.out.println("Is the value '40' present? " +
                    map.containsValue(40));

            // Checking for the Value 'World'
            System.out.println("Is the value 'World' present? " +
                    map.containsValue("World"));

            //The java.util.HashMap.entrySet() method in Java is used to create a set out of the same elements contained in the hash map. It basically returns a set view of the hash map or we can create a new set and store the map elements into them.

            // Displaying the HashMap
            System.out.println("Initial Mappings are: " + map);

            // Using entrySet() to get the set view
            System.out.println("The set is: " + map.entrySet());

            //get() method of HashMap class is used to retrieve or fetch the value mapped by a particular key mentioned in the parameter. It returns NULL when the map contains no such mapping for the key

            // Displaying the HashMap
            System.out.println("Initial Mappings are: " + map);

            // Getting the value of 25
            System.out.println("The Value is: " + map.get("Harry"));

            // Getting the value of 10
            System.out.println("The Value is: " + map.get(40));

            /*put() method of HashMap is used to insert a mapping into a map.
             This means we can insert a specific key and the value it is mapping to into a particular map.
             If an existing key is passed then the previous value gets replaced by the new value.
             If a new pair is passed, then the pair gets inserted as a whole. */

            //Program 1: When passing an existing key.

                    // Displaying the HashMap
            System.out.println("Initial Mappings are: " + map);

            // Inserting existing key along with new value
            Integer returned_value = (Integer)map.put( "Harry",32);

            // Verifying the returned value
            System.out.println("Returned value is: " + returned_value);

            // Displaying the new map
            System.out.println("New map is: " + map);


            //Program 2: When passing a new key.

            // Displaying the HashMap
            System.out.println("Initial Mappings are: " + map);

            // Inserting existing key along with new value
            Integer returned_value2 = (Integer) map.put("All", 60);

            // Verifying the returned value
            System.out.println("Returned value is: " + returned_value2);

            // Displaying the new map
            System.out.println("New map is: " + map);


            //putAll() is an inbuilt method of HashMap class that is used for the copy operation.
            // The method copies all of the elements i.e., the mappings, from one map into another.
            //Exception: The method throws NullPointerException if the map we want to copy from is NULL.

            /*Program 1: Mapping String Values to Integer Keys.*/
            System.out.println("Initial Mappings are: " + map);

            // Creating a new hash map and copying
            HashMap<String, Integer> new_hash_map = new HashMap<>();
            new_hash_map.put("Man",123);
            new_hash_map.putAll(map);
            // Displaying the final HashMap
            System.out.println("The new map looks like this: " + new_hash_map);

            //remove() is an inbuilt method of HashMap class and is used to remove the mapping of any particular key from the map.
            // It basically removes the values for any particular key in the Map.

            // Displaying the HashMap
            System.out.println("Initial Mappings are: " + map);

            // Removing the existing key mapping
            Integer returned_value3 = (Integer)map.remove("Harry");

            // Verifying the returned value
            System.out.println("Returned value is: "+ returned_value3);

            // Displaying the new map
            System.out.println("New map is: "+ map);
        }
        
    }
}
