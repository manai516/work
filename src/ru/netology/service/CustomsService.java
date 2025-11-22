package ru.netology.service;

public class CustomsService {
    public static int calculateCustoms(int price, int weight) {
        int customsFee = (price/100) + (weight * 100);
        return customsFee;
    }
}