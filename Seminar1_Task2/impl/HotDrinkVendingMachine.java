package Seminar1_Task2.impl;

import java.util.List;

import Seminar1_Task2.Product;
import Seminar1_Task2.VendingMachine;

public class HotDrinkVendingMachine extends VendingMachine {

    @Override
    public void setProduct(Product product) {
        this.products.add(product);
    }

    @Override
    public void initProducts(List<Product> products) {
        this.products.addAll(products);
    }
}
