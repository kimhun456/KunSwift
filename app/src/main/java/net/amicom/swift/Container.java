package net.amicom.swift;

import java.util.ArrayList;

/**
 * Created by amicom on 2015. 5. 23..
 */
public class Container {

    int MAXSIZE = 300 * (1024 * 1024); // 300mbyte

    private String name;
    private int size;
    private ArrayList<Obj> objectList;
    private int currentSize;

    public Container() {
        //currentSize= getCurrentSize(objectList);
    }

    public Container(String name, int size, ArrayList<Obj> objectList) {
        this.name = name;
        this.objectList = objectList;
        this.size = size;
        this.currentSize = getCurrentSize(objectList);
    }


    private int getCurrentSize(ArrayList<Obj> objectList) {
        int result = 0;
        for (Obj obj : objectList) {
            result += obj.getBytes();
        }
        return result;
    }


}
