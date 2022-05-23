package com.springboot.ex.SpringBootEx.email.usingclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GetPropertiesUsingGetResource {

//    GetPropertiesUsingGetResource gp = new GetPropertiesUsingGetResource();
//    gp.readFile("src/main/resources/Application.properties");

    public void readFile(String fileName){
        File file = new File(getClass().getResource(fileName).getPath());

        try {
            Scanner scanner =  new Scanner(file);
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException();
        }
    }
}
