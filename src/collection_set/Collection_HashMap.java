package collection_set;

import java.util.HashMap;

public class Collection_HashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(25, "Informatika");
        hm.put(24, "Sistem Informasi");
        hm.put(23, "Teknik Elektro");

        System.out.println("Data HashMap = " + hm);
        hm.remove(23);
        System.out.println("data setelah di remove " + hm);
        System.out.println(hm.containsKey(25));
        System.out.println(hm.containsValue("Informatika"));
    }
}
