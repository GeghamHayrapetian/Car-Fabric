package com.aca.carfabric.ui;
import com.aca.carfabric.car.*;
import com.aca.carfabric.properties.TypesOfCar;

public class Seller {

    public Integer sellCar(Byuer byuer)
    {
        System.out.println("Hi Mr. "+byuer+ " what type of car do u want to byu ? ");
        Catalog.showTypes();
        Car car;
        String s=byuer.toChoose();
        switch (TypesOfCar.valueOf(s))
        {
            case CROSSOVER:
                car=new Crossover();
                break;
            case HATCHBACK:
                 car=new Hatchback();
                break;
            case MOTORCYCLE :
                 car=new Motorcycle();
                break;
            case SEDAN:
                car=new Sedan();
                System.out.println("Choose the sedan type");
                Catalog.showTypesOfSedan();
                s=byuer.toChoose()

                break;
            case TRACTOR:
               car=new Tractor();
                break;
            case TRUCK:
                car=new Truck();
        }


    }

}
