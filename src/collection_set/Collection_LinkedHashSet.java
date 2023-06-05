package collection_set;

import java.util.LinkedHashSet;

public class Collection_LinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();

        lhs.add("IF2C");
        lhs.add("IF2B");
        lhs.add("IF21");;
        lhs.add("IF2A");

        System.out.println(lhs);
    }
}
