package com.advent.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SolutionPart1 {

    public static void main(String[] args) throws IOException {


        //Path path = Paths.get("src/test/resources/fileTest.txt");

        BufferedReader reader = Files.newBufferedReader(Paths.get("resources/demo1"));
        //  String line = reader.readLine();
        //System.out.println("First Line is >>"+line);
        String line;
        int count = 0;
        int sum = 0;
        int max = 0;
        while ((line = reader.readLine()) != null) {
            System.out.println("First Line is >>" + line);
            count++;
            // line = reader.readLine();
            if (

                    !line.equals("")) {


                sum = sum + Integer.parseInt(line);
                System.out.println("Sum is" + sum);

            } else {
                max = Math.max(max, sum);
                System.out.println("Sum is :" + sum);
                System.out.println("Max is :" + max);
                sum = 0;
            }

            // System.out.println("Each Line is"+line +"<<");
            //System.out.println(count);
        }
        System.out.println("MADDD " + max);

    }
}
