package ru.agentche.store;

/**
 * @author Aleksey Anikeev aka AgentChe
 * Date of creation: 28.10.2022
 */

public class Purchase {
    // часть логики перенесена в отдельный класс Basket (так как не совпадали по смыслу)
    protected String title;
    protected int count;

    // убрана перегрузка конструктора, за отсутствием необходимости
    public Purchase(String title, int count) {
        this.title = title;
        this.count = count;
    }
}
