package com.aca.carfabric.ui;

import com.aca.carfabric.car.*;
import com.aca.carfabric.properties.*;

public class Seller {

    public static Integer sellCar(Buyer buyer) {
        System.out.println("Hi Mr. " + buyer + " what type of car do u want to byu ? ");
        Catalog.showTypes();
        String s = buyer.toChoose();
        Car car = null;
        if (s.equals("CROSSOVER")) {
            car = new Crossover();
        }
        if (s.equals("HATCHBACK")) {
            car = new Hatchback();
        }
        if (s.equals("MOTORCYCLE")) {
            car = new Motorcycle();
        }
        if (s.equals("SEDAN")) {
            car = new Sedan();
            System.out.println("Choose type of sedan ");
            Catalog.showTypesOfSedan();
            String type = buyer.toChoose();
            car.chooseType(TypeOfSedan.valueOf(type));
        }
        if (s.equals("TRACTOR")) {
            car = new Tractor();
        }
        if (s.equals("TRUCK")) {
            car = new Truck();
        }

        System.out.println("Choose type of Engine");
        Catalog.showEngine();
        String eng = buyer.toChoose();
        car.chooseMotor(Engine.valueOf(eng));
        System.out.println("Choose type of Exterior");
        Catalog.showExterior();
        String ext = buyer.toChoose();
        car.chooseExterior(Exterior.valueOf(ext));
        System.out.println("Choose type of Interior");
        Catalog.showInterior();
        String inter = buyer.toChoose();
        car.chooseInterior(Interior.valueOf(inter));
        System.out.println("Choose type of Wheels");
        Catalog.showWheels();
        String whe = buyer.toChoose();
        car.chooseWheels(Wheels.valueOf(whe));
        System.out.println("You must puy " + car.getPrice());
        return car.getPrice();

    }

}