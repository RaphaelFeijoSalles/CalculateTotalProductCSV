package services;

import entities.Product;
import entities.ProductCalc;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CreateArchiveService {
    private ArrayList<ProductCalc> products;
    private String strPathOut;
    private Scanner sc;

    public CreateArchiveService(){}

    public CreateArchiveService(ArrayList<ProductCalc> products, Scanner sc) {
        this.products = products;
        this.sc = sc;
    }

    public ArrayList<ProductCalc> getProducts() {
        return products;
    }


    public void stringPathOut(){
        System.out.print("Insert the path of your output archive: ");
        this.strPathOut =  sc.nextLine();
    }


    public void createArc(){

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(strPathOut))){
            for(ProductCalc p : products){
                bw.write(p.toString());
                bw.newLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

}
