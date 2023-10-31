package CollectionFramework.Set;

import org.omg.PortableInterceptor.INACTIVE;
import sun.reflect.generics.tree.Tree;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPractice {

    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<String>();

        hashSet.add("Pune");
        hashSet.add("Nashik");
        hashSet.add("mumbai");
        hashSet.add("pimpri");
        hashSet.add("Pune");
        System.out.println(hashSet);


        for (String str : hashSet) {
            System.out.println(str);
        }
        System.out.println("--------------------------------------------");
        System.out.println(hashSet.contains("Pune"));
        System.out.println("---------------------------------");
        hashSet.remove("pimpri");
        System.out.println(hashSet);
        System.out.println("---------------------------------");
        System.out.println("size is " + hashSet.size());


    }
}
