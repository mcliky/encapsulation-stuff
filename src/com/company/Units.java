package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Units {
    private final List<Object> unitList = new ArrayList<>();


    public final void createList() {
        Soldier soldier = new Soldier();
        Tank tank = new Tank();
        Tower tower = new Tower();
        Fence fence = new Fence();
        unitList.add(soldier);
        unitList.add(tank);
        unitList.add(tower);
        unitList.add(fence);

    }

    public final void printList() {
        System.out.println(unitList.toString());
    }
}
