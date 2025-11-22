package ru.netology.service;

public class CustomsService {
    public static void calculateCustoms(int price, int weight) {
        int customsFee = (price/100) + (weight * 100);
        System.out.print("Таможенные пошлины составят: " + customsFee);

    }
}
