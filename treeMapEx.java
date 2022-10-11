/*Demonstrate the working of a Tree Map with a suitable example and explain when Tree map will be useful. */

import java.util.*;

public class treeMapEx {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
        tm.put(1, "One");
        tm.put(2, "Two");
        tm.put(3, "Three");
        tm.put(4, "Four");
        tm.put(5, "Five");
        tm.put(6, "Six");
        tm.put(7, "Seven");
        tm.put(8, "Eight");
        tm.put(9, "Nine");
        tm.put(10, "Ten");
        System.out.println(tm);
        System.out.println(tm.firstKey());
        System.out.println(tm.lastKey());
        System.out.println(tm.headMap(5));
        System.out.println(tm.tailMap(5));
        System.out.println(tm.subMap(3, 7));
    }
}

// why are tree maps used?
// Tree maps are used when we want to sort the keys in a map in ascending order.
// Tree maps are also used when we want to search for a key in a map in log(n) time.
// Tree maps are also used when we want to search for a range of keys in a map in log(n) time.

