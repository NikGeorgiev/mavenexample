package com.spartaglobal;

import com.spartaglobal.collectionexamples.ExampleDeQueues;
import com.spartaglobal.collectionexamples.ExampleLists;
import com.spartaglobal.collectionexamples.ExampleQueues;
import com.spartaglobal.maps.exampleMaps;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
//        ExampleSets exampleSets = new ExampleSets();
//        exampleSets.workingWithOurSet();
//        exampleSets.printSet();
//        ExampleLists exampleLists = new ExampleLists();
//        exampleLists.printList();
//        ExampleQueues exampleQueues = new ExampleQueues();
//        exampleQueues.queueRunner();
//        ExampleDeQueues exampleDeQueues = new ExampleDeQueues();
//        exampleDeQueues.workingWithOurDequeue();
        exampleMaps exampleMaps = new exampleMaps();
        System.out.println(exampleMaps.returnValue(2));
        exampleMaps.loopThroughMap();
    }
    }


