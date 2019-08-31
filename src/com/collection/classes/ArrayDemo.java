package com.collection.classes;

import com.collection.utitlities.Product;

import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {

        Product door = new Product("door", 55);
        Product window = new Product("window", 45);

        Product[] products= {door,window};

        System.out.println(products);

        //how to print then?
        System.out.println(Arrays.toString(products));

        //lets add a new item
         final Product floor = new Product("floor",15);
         // products[2]=floor;

        //now lets print the array

        System.out.println(Arrays.toString(products));

        //lets write logic to add items in array
        products=add(floor,products);
        System.out.println(Arrays.toString(products));

    }

    private static Product[] add(Product product, Product[] products) {
        int length = products.length;
        //lets copy items from first array to another and have new length one more than the original array
        Product[] newArr= Arrays.copyOf(products,length+1);
        newArr[length]=product;
        return newArr;
    }
}
