package datastructure;

import java.util.*;

public class CollectionView {

        private static Object get;

        public static void main(String[] args) {
        /*
         Map is created and inserted some data.Retrieve the Collection view of values present in map
         */
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "NYC");
        map.put(2, "LA");
        map.put(3, "Denver");
        map.put(4, "Boston");
        map.put(5, "San Jose");
        map.put(6, "Seattle");

                Set<Integer> keys=map.keySet();
                for(Integer key:keys){
                        System.out.println(key + " "+"represents "+map.get(key));}

        }

    }


