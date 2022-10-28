package ru.agentche.store;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Aleksey Anikeev aka AgentChe
 * Date of creation: 28.10.2022
 */
public class Store {
    /**
     * Часть логики перенесена во вновь созданный класс, для возможности обновления в будущем
     */
    private static Store store = null;
    private HashMap<String, Integer> products = new HashMap<>();

    private Store() {
        productsListFilling();
    }
    private void productsListFilling() {
        products.put("Хлеб", 56);
        products.put("Масло", 153);
        products.put("Колбаса", 211);
        products.put("Пирожок", 45);
    }

    public void showOnDisplay() {
        System.out.println("В МАГАЗИНЕ В НАЛИЧИИ");
        for (
                Map.Entry<String, Integer> productAndPrice : products.entrySet()) {
            System.out.println(productAndPrice.getKey() + " за " + productAndPrice.getValue() + " руб./шт.");
        }
    }

    public HashMap<String, Integer> getProducts() {
        return products;
    }

    public static Store getInstance() {
        return store == null ? store = new Store() : store;
    }
}
