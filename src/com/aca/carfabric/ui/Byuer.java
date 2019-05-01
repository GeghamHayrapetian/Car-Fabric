package com.aca.carfabric.ui;

import java.util.Scanner;

public class Byuer {
    String name;
    Scanner in=new Scanner(System.in);
    public Byuer(String name)
    {
        this.name=name;
    }
    public String toChoose()
    {
         String choice=in.nextLine().toUpperCase();
        return choice;
    }
}
