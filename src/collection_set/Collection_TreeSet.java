package collection_set;

import java.util.TreeSet;

public class Collection_TreeSet {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("IF21");
        ts.add("IF2C");
        ts.add("IF2B");
        ts.add("IF2A");
        ts.add("IF22");

        System.out.println("Objek pada TreeSet = " + ts);
        ts.remove("IF22");
        System.out.println("Setelah remove IF22 = "+ts);
        System.out.println("Cari IF2A = " + ts.contains("IF2A"));
        System.out.println("isEmpty = " + ts.isEmpty());
        System.out.println("Size = " + ts.size());
        ts.removeAll(ts);
        System.out.println("Objek pada TreeSet = " + ts);
    }
}
