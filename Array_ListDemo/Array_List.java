package Array_ListDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<String> chemistryElementList = new ArrayList<String>();
        chemistryElementList.add("Fluorine");
        chemistryElementList.add("Bromine");
        chemistryElementList.add("Chlorine");
        chemistryElementList.add("Hydrogen");
        chemistryElementList.add("Oxygen");

        System.out.println("Before Using Iterator");
        System.out.println(chemistryElementList);

        Collections.sort(chemistryElementList);
        Iterator itr = chemistryElementList.iterator();
        System.out.println("After Using Iterator");
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.println("After Removing Hydrogen");
        chemistryElementList.remove("Hydrogen");
        System.out.println(chemistryElementList);

    }
}
