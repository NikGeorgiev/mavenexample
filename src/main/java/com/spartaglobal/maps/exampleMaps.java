package com.spartaglobal.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class exampleMaps {
    private Map<Integer, String> studentsInClass = new HashMap<>();

    public exampleMaps(){
        studentsInClass.put(1,"Ed");
        studentsInClass.put(2, "Nik");
        studentsInClass.put(3, "Fab");
    }
    public String returnValue(int keyNum){
        return studentsInClass.get(keyNum);
    }

    public void loopThroughMap(){
        Collection<String> values = studentsInClass.values();

        for (String data: values){
            System.out.println(data);
        }
        studentsInClass.keySet();
        
    }
}
