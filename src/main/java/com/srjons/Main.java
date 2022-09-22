package com.srjons;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
    static final String WORK_DIR = "E:\\Downloads\\test-gradle\\test-gradle";

    public static void main(String[] args) {
        try {
            Process process = Runtime.getRuntime().exec("/opt/scanner-app/bin/gradle/bin/gradle build", null, new File(args[0]));
            InputStream inputStream = process.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println("line = " + line);
            }
            bufferedReader.close();
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error: " + e.getMessage());
        }
    }
}