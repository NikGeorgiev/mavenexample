package com.spartaglobal.collectionexamples;

import java.util.Deque;
import java.util.LinkedList;

public class ExampleDeQueues {
    private Deque<String> carPark = new LinkedList<>();

    public ExampleDeQueues() {
        carPark.add("carl");
        carPark.add("car2");
        carPark.add("car3");

    }
    public void workingWithOurDequeue(){
        for (String car: carPark){
            System.out.println(car);
        }

        System.out.println(carPark.peekLast());
    }
}
