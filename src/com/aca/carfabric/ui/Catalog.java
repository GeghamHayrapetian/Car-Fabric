package com.aca.carfabric.ui;

import com.aca.carfabric.properties.*;

public class Catalog {
    public static void showTypes() {

        for (TypesOfCar t : TypesOfCar.values()
        ) {
            System.out.println(t);
        }
    }

    public static void showEngine() {

        for (Engine t : Engine.values()
        ) {
            System.out.println(t);
        }
    }

    public static void showExterior() {

        for (Exterior t : Exterior.values()
        ) {
            System.out.println(t);
        }
    }

    public static void showInterior() {

        for (Interior t : Interior.values()
        ) {
            System.out.println(t);
        }
    }

    public static void showTypesOfSedan() {

        for (TypeOfSedan t : TypeOfSedan.values()
        ) {
            System.out.println(t);
        }
    }

    public static void showWheels() {

        for (Wheels t : Wheels.values()
        ) {
            System.out.println(t);
        }
    }

}
