package com.aca.carfabric;

import com.aca.carfabric.ui.Byuer;
import com.aca.carfabric.ui.Seller;

public class CarShop {
    public static void main(String[] args) {

        Byuer byuer=new Byuer("ABd");
        Seller seller=new Seller();
        seller.sellCar(byuer);
    }
}
