package com.pluralsight;

import java.io.*;
import java.util.Scanner;

public class DealershipFileManager {

    public void getDealership(){
        //return delaership onject
        Dealership dealership;

        //buffered reader
        try (BufferedReader br = new BufferedReader(new FileReader("inventory.csv"))) {
            String line;
            line = br.readLine();
            String[] dealershipArray = line.split("\\|");

            //also need to parse out list parts
            String name = line.split(",")[0];
            String address = line.split(",")[1];
            String phone = line.split(",")[2];

            //dealership object
            dealership = new Dealership(name,address, phone);




            while ((line = br.readLine()) != null) {

                System.out.println(line);
            }
        } catch (
                IOException e) {
            System.out.println("Error reading file.");
        }
        //loadfrom csv;
        //readfromcsv;
        // create dealership object
        // populate inventory(list of vehicles)

    }
    public void saveDealership(){
        // method will overwrite file with current dealership info and inventory
    }

    public class ReadFile {
        public static void main(String[] args) {
            File inventoryFile = new File("inventory.csv");

            // try-with-resources: Scanner will be closed automatically
            try (Scanner myReader = new Scanner(inventoryFile)) {
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    System.out.println(data);
                }
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }


            try (
                    BufferedWriter bw = new BufferedWriter(new FileWriter("inventory.csv"))) {
                bw.write("First line");
                bw.newLine();  // add line break
                bw.write("Second line");
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("Error writing file.");
            }
        }
    }
}
