package com.polymorphism;

public class DBLogicTest {

    public static void main(String[] args) {

        MySQLdb mysql = new MySQLdb();
        Mongodb mongo = new Mongodb();

        // Abstract methods which are declared in DBLogic and implemented in MySQLdb are called here
        mysql.add();
        mysql.save();
        mysql.update();

        System.out.println("--------------------------");
        // Abstract methods which are declared in DBLogic and implemented in Mongodb are called here
        mongo.add();
        mongo.save();
        mongo.update();

    }
}
