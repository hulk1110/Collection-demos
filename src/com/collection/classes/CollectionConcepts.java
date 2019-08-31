package com.collection.classes;

import com.collection.utitlities.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionConcepts {
    public static void main(String[] args) {
        Product door = new Product("door", 55);
        Product window = new Product("window", 35);
        Product floorPanel = new Product("floorPanel", 15);

        Collection<Product> products = new ArrayList<>();
        products.add(door);
        products.add(floorPanel);
        products.add(window);
        System.out.println(products);

        final Iterator<Product> productIterator = products.iterator();
        while (productIterator.hasNext()) {
            Product product = productIterator.next();
            System.out.println(product);
        }

        //in java 5 foreach came

        for (Product product : products) {
            System.out.println(product);
        }


        //lets try printing products whose weight is more than 20
//        final Iterator<Product> productRemoveIterator = products.iterator();
//        while (productRemoveIterator.hasNext()) {
//            Product product = productRemoveIterator.next();
//            if (product.getWeight() > 20) {
//                System.out.println(product);
//            } else {
//                productRemoveIterator.remove();
//            }
//        }
//        System.out.println(products);

        // this can't be achieved using forEach


        System.out.println(products.size());
        System.out.println(products.isEmpty());
        System.out.println(products.contains(window));
        System.out.println(products.contains(door));

//        Collection<Product> otherProducts = new ArrayList<>();
//        otherProducts.add(window);
//        otherProducts.add(door);
//        products.removeAll(otherProducts);
//        System.out.println(products);


//lets try removing item using forEach
//        for (Product product:products)
//        {
//            if(product.getWeight()>20){
//                products.remove(product);
//            }else{
//                System.out.println(product);
//            }
//
//        }


    }
}
