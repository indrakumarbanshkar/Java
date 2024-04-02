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

        }
        
    }
}
