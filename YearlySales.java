/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.yearlysales;

/**
 *
 * @author Harvard Keyz
 */
public class YearlySales {

    public void displayYearlySales(String[] places, String[] consoles, double[][] prices) {

        System.out.println("----------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("----------------------------");

        for (int i = 0; i < places.length; i++) {
            System.out.println("\n" + places[i] + ":");
            double placeTotal = 0;

            for (int j = 0; j < consoles.length; j++) {
                System.out.println(" " + consoles[j] + ": R" + prices[i][j]);
                placeTotal = placeTotal + prices[i][j];
            }
            System.out.println("Total for " + places[i] + ": R" + placeTotal);
        }
    }

    // Main MUST be inside the class
    public static void main(String[] args) {
        String[] places = {"Cape Town", "Port Elizabeth", "Pretoria"};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};
        double[][] prices = {
            {1000, 2000, 3000}, // Cape Town
            {2000, 3000, 4000}, // Port Elizabeth
            {1500, 1100, 1200} // Pretoria
        };

        YearlySales report = new YearlySales();
        report.displayYearlySales(places, consoles, prices); // <-- same name as method above
    }
}