package ru.agentche.store;

import java.util.Scanner;

/**
 * @author Aleksey Anikeev aka AgentChe
 * Date of creation: 25.10.2022
 */


public class Main {

    public static void main(String[] args) {
        // часть кода перенесена в Store
        Store.getInstance().showOnDisplay();

        System.out.println("Введите два слова: название товара и количество. Или end");
        Scanner scanner = new Scanner(System.in);
        // убрано магическое число при создании массива
        Basket basket = new Basket(Store.getInstance().getProducts().size());
        while (true) {
            String line = scanner.nextLine();
            if ("end".equals(line)) {
                break;
            }
            String[] parts = line.split(" ");
            String product = parts[0];
            int count = Integer.parseInt(parts[1]);
            basket.addPurchase(product, count);
        }
        long sum = basket.sum(Store.getInstance().getProducts());
        System.out.println("ИТОГО: " + sum);
    }
}
