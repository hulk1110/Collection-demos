package com.collection.classes;

import com.collection.utitlities.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Shipment implements Iterable {

    public static final int PRODUCT_NOT_PRESENT = -1;
    private static final int LIGHT_VAN_MAX_WEIGHT = 20;
    private final List<Product> products = new ArrayList<>();
    private List<Product> lightVanproducts = null;
    private List<Product> heavyVanproducts = null;

    public void add(Product product) {
        products.add(product);

    }

    public void replace(Product productOld, Product productNew) {
        final int index = products.indexOf(productOld);
        if (index != PRODUCT_NOT_PRESENT) {
            products.set(index, productNew);
        }
    }


    public void prepare() {
        //sort our list of products by weight


        products.sort(Product.BY_WEIGHT);
        //find index of product that need heavy van

        int splitPoint = findSplitPoint();
        //assign view of product list for heavy and light vans
        lightVanproducts = products.subList(0, splitPoint);
        heavyVanproducts = products.subList(splitPoint, products.size());

    }

    private int findSplitPoint() {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getWeight() > LIGHT_VAN_MAX_WEIGHT) {
                return i;
            }
        }
        return 0;
    }

    public List<Product> getHeavyVanProducts() {
        return heavyVanproducts;
    }

    public List<Product> getLightVanProducts() {
        return lightVanproducts;
    }


    @Override
    public Iterator iterator() {
        return products.iterator();
    }
}
