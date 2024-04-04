package org.example;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
       Person person = new Person("Oksana","Pshybyla");
       Gson gson = new Gson();

        System.out.println(gson.toJson(person));
    }
}