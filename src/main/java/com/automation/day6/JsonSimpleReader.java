package com.automation.day6;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;

public class JsonSimpleReader {
    public static void main(String[] args) {
//        JSONParser parser = new JSONParser();
//        try {
//            Object obj = parser.parse(new FileReader("C:\\Selenium\\JavaSelenium_Aug25\\src\\main\\java\\day6\\login.json"));
//            JSONObject jsonObject = (JSONObject) obj;
//
//            Object name =  jsonObject.get("userId");
//            Object age =  jsonObject.get("password");
//
//            System.out.println("userId: " + name);
//            System.out.println("password: " + age);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }



        JSONParser parser = new JSONParser();
        try {
            // Step 1: Parse the file as a JSONArray
            // The top-level element is an array, not a single object.
            Object obj = parser.parse(new FileReader("C:\\Selenium\\JavaSelenium_Aug25\\src\\main\\java\\day6\\login.json"));
            JSONArray jsonArray = (JSONArray) obj;

            // Step 2: Iterate through each element of the array
            System.out.println("Reading data from the JSON array:");
            System.out.println("------------------------------------");

            for (Object element : jsonArray) {
                // Step 3: Cast each element to a JSONObject
                JSONObject jsonObject = (JSONObject) element;

                // Step 4: Extract the userId and password from the current JSONObject
                String userId = (String) jsonObject.get("userId");
                String password = (String) jsonObject.get("password");

                System.out.println("userId: " + userId);
                System.out.println("password: " + password);
                System.out.println("------------------------------------");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }
