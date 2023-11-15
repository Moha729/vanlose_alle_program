package com.mo.vanlose_alle_program.home;

import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;

@Component
public class CsvReader {

    public ArrayList<String> readRules(String file){
        ArrayList<String> rules = new ArrayList<>();
        String line = "";

        try (BufferedReader br = new BufferedReader(new FileReader(file))){

        while ((line = br.readLine()) != null){
            rules.add(line);
        }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return rules;
    }

/*
    public void readFile(){

        String csvFile = "output.csv";
        String line = "";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null){
                String[] values = line.split(",");

                for (String value : values){
                    System.out.println(value + " ");
                }
                System.out.println();
            }
            br.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
*/
}
