package com.example.opilane.menukuningad;

import java.util.ArrayList;
import java.util.List;

public class kings {
    private List<king> list=new ArrayList();
    public kings(){
        for (String [] arr : data)
            list.add(new king(arr[0], Integer.parseInt(arr[1]),Integer.parseInt(arr[2])));

    }
    public java.util.List<king> getKings(){
        return list;
    }
    private static final String [] [] data = {
            {"Henry VII", "1509", "1547","test2"},
            {"Edward", "1547", "1553","test2"},
            {"Mary I", "1553", "1558","test3"},
            {"Elisabeth I", "1558", "1603","test4"},
            {"James I", "1603", "1625","test5"},
            {"Charles I", "1625", "1649","test6"}
    };
    public kings() {
        for (String[] arr : data)
            list.add(new king(arr[0], Integer.parseInt(arr[1]), Integer.parseInt(arr[2]), arr[3]));
    }

    public List<king> getkings() {
        return list;
    }
}
}
