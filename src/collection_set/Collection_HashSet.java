package collection_set;

import java.util.HashSet;

public class Collection_HashSet {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();

        hs.add("IF21");
        hs.add("IF2C");
        hs.add("IF2B");
        hs.add("IF2A");
        hs.add("IF4A");

        System.out.println("Kelas IF = "+hs);
        hs.remove("IF2A");
        System.out.println("Kelas IF setelah remove IF2A = " + hs);
        System.out.println("isEmpty = " + hs.isEmpty());
        System.out.println("Size = " + hs.size());
        System.out.println("Apakah IF21 ada di hanset = " + hs.contains("IF21"));
        hs.removeAll(hs);
        System.out.println("Kelas IF = " + hs);

    }
}
