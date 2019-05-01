package com.aca.carfabric.properties.map;

import com.aca.carfabric.properties.*;

import java.util.HashMap;
import java.util.Map;

public final class Maps {
    public static Map<Engine, Integer> engineMap = Map.of(Engine.PETROL, 2000, Engine.DIESEL, 3000, Engine.ELECTRICAL, 4000, Engine.HYBRID, 5000);
    public static Map<Wheels, Integer> wheelsMap = Map.of(Wheels.FOURXFOUR, 4000, Wheels.BACKWHEEL, 2000, Wheels.FRONTWHEEL, 2000);
    public static Map<Exterior, Integer> exteriorMap = Map.of(Exterior.EXPENSIVE, 5000, Exterior.AVERAGE, 4000, Exterior.CHEAP, 3000);
    public static Map<Interior, Integer> interiorMap = Map.of(Interior.LEATHER, 3000, Interior.MIXTURE, 2000, Interior.TISSUE, 1000);
    public static Map<TypeOfSedan, Integer> sedanMap = Map.of(TypeOfSedan.ELECTRIC, 6000, TypeOfSedan.BUISNESS, 1500, TypeOfSedan.SPORTCAR, 1500);
}
