package com.mo.vanlose_alle_program.home;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class HomeService {

    final CsvReader csvReader;
    final FileWritter fileWritter;

    public HomeService(CsvReader csvReader, FileWritter fileWritter) {
        this.csvReader = csvReader;
        this.fileWritter = fileWritter;
    }

    public ArrayList<String> readRules(){
        String csvFile = "rules.csv";
        return csvReader.readRules(csvFile);
    }

    public ArrayList<String> readCleaningRules(){
        String cvsFile = "cleaning.csv";
        return csvReader.readRules(cvsFile);
    }
    public void readTheFile(){
        csvReader.readFile();
    }

    public String makeNewFile(){
        fileWritter.createNewFile();
        return null;
    }

    public String readCSV(){



        return null;
    }
}
