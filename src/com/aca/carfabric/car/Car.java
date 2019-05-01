package com.aca.carfabric.car;

import com.aca.carfabric.properties.*;
import com.aca.carfabric.properties.map.Maps;


public class Car {

    protected Integer price;
    protected Engine motor;
    protected Exterior exterior;
    protected Interior interior;
    protected Wheels wheel;
    protected TypeOfSedan type;

    public Integer getPrice() {
        return price;
    }

    public void chooseType(TypeOfSedan a) {
        type = a;
        price += Maps.sedanMap.get(a);

    }

    public void chooseMotor(Engine A) {
        if (type.equals(TypeOfSedan.ELECTRIC)) {
            motor = Engine.ELECTRICAL;
            price += Maps.sedanMap.get(TypeOfSedan.ELECTRIC);
        }
        motor = A;
        price += Maps.engineMap.get(A);

    }


    public void chooseWheels(Wheels B) {
        wheel = B;
        price += Maps.wheelsMap.get(B);


    }


    public void chooseInterior(Interior C) {
        interior = C;
        price += Maps.interiorMap.get(C);

    }


    public void chooseExterior(Exterior D) {
        exterior = D;
        price += Maps.exteriorMap.get(D);

    }
}
