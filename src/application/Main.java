package application;

import entities.Product;
import entities.ProductCalc;
import services.CreateArchiveService;
import services.ProductCalculateService;
import services.PullProductsService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PullProductsService pps = new PullProductsService(sc);

        pps.stringPathIn();

        ArrayList<Product> products= pps.extractProducts();

        ProductCalculateService pcs = new ProductCalculateService(products);

        ArrayList<ProductCalc> calculatedProducts = pcs.productCalculation();

        CreateArchiveService cas = new CreateArchiveService(calculatedProducts, sc);

        cas.stringPathOut();

        cas.createArc();
    }

}
