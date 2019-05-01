package com.aca.carfabric.car;

import com.aca.carfabric.properties.*;
import com.aca.carfabric.properties.map.Maps;


public class Sedan extends Car {

    Integer price = 0;
    TypeOfSedan type;

    public Integer getPrice() {
        return price;
    }


    public void chooseMotor(Engine valueOf) {

        motor = valueOf;
        price += Maps.engineMap.get(valueOf);

    }


    public void chooseWheels(Wheels valueOf) {
        wheel = valueOf;
        price += Maps.wheelsMap.get(valueOf);


    }


    public void chooseInterior(Interior valueOf) {
        interior = valueOf;
        price += Maps.interiorMap.get(valueOf);

    }


    public void chooseExterior(Exterior valueOf) {
        exterior = valueOf;
        price += Maps.exteriorMap.get(valueOf);

    }

    public void chooseType(TypeOfSedan valueOf) {
        type = valueOf;
        price += Maps.sedanMap.get(valueOf);
    }


}
