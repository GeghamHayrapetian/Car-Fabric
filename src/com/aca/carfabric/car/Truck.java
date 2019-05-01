package com.aca.carfabric.car;

import com.aca.carfabric.properties.Engine;
import com.aca.carfabric.properties.Exterior;
import com.aca.carfabric.properties.Interior;
import com.aca.carfabric.properties.Wheels;
import com.aca.carfabric.properties.map.Maps;

public class Truck extends Car {
    Integer price = 5000;

    @Override
    public Integer getPrice() {
        return price;
    }

    public void chooseMotor(Engine A) {
        motor = A;
        price += Maps.engineMap.get(A);
    }

    @Override
    public void chooseWheels(Wheels B) {
        wheel = B;
        price += Maps.wheelsMap.get(B);


    }

    @Override
    public void chooseInterior(Interior C) {
        interior = C;
        price += Maps.interiorMap.get(C);

    }

    @Override
    public void chooseExterior(Exterior D) {
        exterior = D;
        price += Maps.exteriorMap.get(D);

    }
}
