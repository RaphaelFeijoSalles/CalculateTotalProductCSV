package application;

import entities.Product;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;


class PullProducts {

    public static void main(String[] args) {

        String strPath = "C:\\Users\\laerc\\Documents\\program\\cursoJavaNelioAlves\\ExercicioWriteCSV\\in.csv";

        int qLines = 0;

        try(BufferedReader br = new BufferedReader(new FileReader(strPath))){

            while(br.readLine() != null){
                qLines++;
            }
        }
        catch (Exception e){
            e.getStackTrace();
        }


        try(BufferedReader br = new BufferedReader(new FileReader(strPath))){

            Product[] products = new Product[qLines];

            String line = br.readLine();

            for(int i = 0; i < products.length ; i++){
                String[] productValues = line.split(",");

                products[i] = new Product(productValues[0],
                        Double.parseDouble(productValues[1]),
                        Integer.parseInt(productValues[2]));

                line = br.readLine();
            }


            for(Product p : products){
                System.out.println(p);
            }

        }
        catch (IOException e){
            e.getStackTrace();
        }


    }
}
