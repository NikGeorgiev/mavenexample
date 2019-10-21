package com.spartaglobal.collectionexamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExampleLists {
    private List<String> hobbies = new ArrayList<String>();

    public ExampleLists() {

        workingWithOurList();

    }
    private void workingWithOurList(){
        hobbies.add("football");
        hobbies.add("cooking");
        hobbies.add("swimming");
    }
    public void printList(){
        System.out.println("we're using the Iterator...");
        for (Iterator<String> iterator = hobbies.iterator(); iterator.hasNext();){
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
