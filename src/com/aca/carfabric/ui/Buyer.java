package com.aca.carfabric.ui;

import java.util.Scanner;

public class Buyer {
    String name;
    Scanner in = new Scanner(System.in);

    public Buyer(String name) {
        this.name = name;
    }

    public String toChoose() {
        String choice = in.nextLine().toUpperCase();
        return choice;
    }

    public String toString() {
        return name;

    }
}
