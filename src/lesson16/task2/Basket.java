package lesson16.task2;

import java.util.Map;

/**
 * Created by roman_v on 18.07.17.
 */
public class Basket {
    private Map<Goods,Integer> goodMap;

    public Basket(Map<Goods, Integer> goodMap) {
        this.goodMap = goodMap;
    }

    public void addGoods(Goods goods){
        goodMap.put(goods,1);
        if (goodMap.containsKey(goods)) {
            int count=goodMap.get(goods);
            count++;

        }
    }
    public void isEmpty(Goods goods){

    }
}
