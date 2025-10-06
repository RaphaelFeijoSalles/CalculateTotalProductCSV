package services;

import entities.Product;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class PullProductsService {
    private Scanner sc;
    private String strPathIn;

    private ArrayList<Product> list = new ArrayList<>();

    public PullProductsService(Scanner sc) {
        this.sc = sc;
    }


    public ArrayList<Product> getList() {
        return list;
    }

    public String getStrPathIn() {
        return strPathIn;
    }

    public void stringPathIn(){
        System.out.print("Insert the path of your input archive: ");
        this.strPathIn =  sc.nextLine();
    }


    public ArrayList<Product> extractProducts() {

        try (BufferedReader br = new BufferedReader(new FileReader(strPathIn))) {

            String line = br.readLine();
            String[] productValues;

            while(line != null){
                productValues = line.split(",");

                list.add(new Product((productValues[0]),
                        Double.parseDouble(productValues[1]),
                        Integer.parseInt(productValues[2])));

                line = br.readLine();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }
}
