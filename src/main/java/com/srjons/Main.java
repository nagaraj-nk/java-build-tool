package com.srjons;

import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "Raj");

        System.out.println("jsonObject = " + jsonObject);
    }
}