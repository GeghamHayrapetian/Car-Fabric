package com.aca.carfabric.ui;

import com.aca.carfabric.Car.*;
import com.aca.carfabric.properties.*;

public class Seller {

    public Integer sellCar(Byuer byuer) {
        System.out.println("Hi Mr. " + byuer + " what type of Car do u want to byu ? ");
        Catalog.showTypes();
        String s = byuer.toChoose();
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
            String type = byuer.toChoose();
            ((Sedan) car).chooseType(TypeOfSedan.valueOf(type));
        }
        if (s.equals("TRACTOR")) {
            car = new Tractor();
        }
        System.out.println("Choose type of Engine");
        Catalog.showEngine();
        String eng = byuer.toChoose();
        car.chooseMotor(Engine.valueOf(eng));
        System.out.println("Choose type of Exterior");
        Catalog.showExterior();
        String ext = byuer.toChoose();
        car.chooseExterior(Exterior.valueOf(ext));
        System.out.println("Choose type of Interior");
        Catalog.showInterior();
        String inter = byuer.toChoose();
        car.chooseInterior(Interior.valueOf(inter));
        System.out.println("Choose type of Wheels");
        Catalog.showWheels();
        String whe = byuer.toChoose();
        car.chooseWheels(Wheels.valueOf(whe));
        return car.getPrice();

    }

}
