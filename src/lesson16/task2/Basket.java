package lesson16.task2;

import java.util.Map;

public class Basket {
    private Map<Good, Integer> goodMap;

    public Basket(Map<Good, Integer> goodMap) {
        this.goodMap = goodMap;
    }

    public void addGoods(Good goods, int n) {
        goodMap.put(goods, n);
    }

    public void clearAll() {
        goodMap.clear();
    }

    public void removeOneGoods(Good goods) {
        if (goodMap.containsKey(goods)) {
            goodMap.remove(goods);
        }
    }

}
