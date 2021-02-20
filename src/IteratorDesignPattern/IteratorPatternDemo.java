package IteratorDesignPattern;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class IteratorPatternDemo {

    public static void main(String [] args){

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("India");
        arrayList.add("US");
        arrayList.add("Japan");
        arrayList.add("UK");

        Iterator<String> iteratorList = arrayList.iterator();
        System.out.println("Iterator type for the data structure ArrayList :- " +iteratorList.toString());
        System.out.println();
        while(iteratorList.hasNext()){
            String countryName = iteratorList.next();
            System.out.println("Country Name :- "+countryName);
        }

        Set<String> hashSet = new HashSet<String>();
        hashSet.add("India");
        hashSet.add("US");
        hashSet.add("Japan");
        hashSet.add("UK");

        Iterator<String> iteratorSet = hashSet.iterator();
        System.out.println("Iterator type for the data structure HashSet :- "+iteratorSet);
        System.out.println();
        while(iteratorSet.hasNext()){
               String countryName = iteratorSet.next();
               System.out.println("Country Name :- "+countryName);
        }
    }
}
