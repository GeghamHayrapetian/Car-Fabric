package com.aca.carfabric.car;

import com.aca.carfabric.properties.*;
import com.aca.carfabric.properties.map.Maps;

public class Sedan extends Car {

    Integer price ;
    TypeOfSedan type;
    @Override
    public Integer getPrice() {
        return price;
    }
    public void chooseType(TypeOfSedan a)
    {
        type=a;
        price+=Maps.sedanMap.get(a);

    }
    public void chooseMotor(Engine A) {
        if(type.equals(TypeOfSedan.ELECTRIC))
        {
            motor=Engine.ELECTRICAL;
            price+= Maps.sedanMap.get(TypeOfSedan.ELECTRIC);
        }
        motor=A;
        price+= Maps.engineMap.get(A);

    }

    @Override
    public void chooseWheels(Wheels B) {
        wheel=B;
        price+=Maps.wheelsMap.get(B);


    }

    @Override
    public void chooseInterior(Interior C) {
        interior=C;
        price+=Maps.interiorMap.get(C);

    }

    @Override
    public void chooseExterior(Exterior D) {
        exterior=D;
        price+=Maps.exteriorMap.get(D);

    }
}
