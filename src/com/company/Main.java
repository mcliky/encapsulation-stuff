package com.company;

public class Main {

    public static void main(String[] args) {
        Units units = new Units();
        units.createList();
        units.printList();
        Soldier soldier = new Soldier();
        Tank tank = new Tank();
        soldier.move();
        tank.move();
        String str = "dog has man";
        System.out.println(stringReverse(str));

    }


    public static String stringReverse(String str) {
        String[] str2 = str.split("\\s+");
        for (int i = 0; i < str2.length; i++) {
            str2[i] = str2[i].substring(0, 1).toUpperCase() + str2[i].substring(1);
        }
        StringBuilder str3 = new StringBuilder("");
        for (int i = str2.length - 1; i >= 0; i--) {
            str3.append(str2[i]).append(" ");

        }
        str = str3.toString().trim();

        return str;

    }


}
