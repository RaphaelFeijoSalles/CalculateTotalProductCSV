package services;

import entities.Product;
import entities.ProductCalc;

import java.util.ArrayList;

public class ProductCalculateService {
    private ArrayList<Product> products;

    private ArrayList<ProductCalc> productCalcs = new ArrayList<>();

    public ProductCalculateService(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public ArrayList<ProductCalc> productCalculation(){
        for(Product p : products){
            productCalcs.add(new ProductCalc(p.getName(), (p.getValue() * p.getQuantity())));
        }
        return productCalcs;
    }

}
