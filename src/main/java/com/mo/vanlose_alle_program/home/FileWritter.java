package com.mo.vanlose_alle_program.home;

import org.springframework.stereotype.Component;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

@Component
public class FileWritter {

    public void createNewFile(){

        String csvFile = "output.csv";

        try(FileWriter writer = new FileWriter(csvFile)) {
            writer.append("Name");
            writer.append(",");
            writer.append("Age");
            writer.append(",");
            writer.append("Country");
            writer.append("\n");

            writer.append("John Doe");
            writer.append(",");
            writer.append("30");
            writer.append(",");
            writer.append("USA");
            writer.append("\n");

            writer.append("Jane Smith");
            writer.append(",");
            writer.append("25");
            writer.append(",");
            writer.append("UK");
            writer.append("\n");
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
