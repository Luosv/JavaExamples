package javaCollection;

import java.util.Collection;
import java.util.HashMap;

/**
 * HashMap遍历
 * Created by luosv on 2016/10/26 0026.
 */
public class CollectionIterator {

    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("1", "1st");
        hashMap.put("2", "2nd");
        hashMap.put("3", "3rd");

        Collection collection = hashMap.values();

        // while
//        Iterator iterator = collection.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        // foreach better!
        for (Object col : collection) {
            System.out.println(col);
        }

    }

}
