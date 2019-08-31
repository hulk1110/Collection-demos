package com.collection.classes;

import com.collection.utitlities.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Shipment implements Iterable {

    private static final int LIGHT_VAN_MAX_WEIGHT =20;
    public static final int PRODUCT_NOT_PRESENT =-1;
    private final List<Product> products = new ArrayList<>();

    public void add(Product product){
        products.add(product);

    }

    public void replace(Product productOld,Product productNew){
    final int index=products.indexOf(productOld);
    if(index!=PRODUCT_NOT_PRESENT){
    products.set(index,productNew);
    }
    }






    @Override
    public Iterator iterator() {
        return null;
    }
}
