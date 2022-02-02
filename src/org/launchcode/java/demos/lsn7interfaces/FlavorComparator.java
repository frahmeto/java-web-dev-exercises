package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {

    @Override
    public int compare(Flavor flavor1, Flavor flavor2) {
        //return 0;
        //return  flavor1.getName().compareTo(flavor2.getName());// first step
        return flavor2.getAllergens().size() - flavor1.getAllergens().size();

    }
}
