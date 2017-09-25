package lesson16.task2.entity;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Basket implements Serializable {
    private Map<Good, Integer> goodMap;
    private int id;
    private int goodID;

    public Basket() {
        goodMap = new HashMap<>();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGoodID() {
        return goodID;
    }

    public void setGoodID(int goodID) {
        this.goodID = goodID;
    }

    public Basket(Map<Good, Integer> goodMap) {
        this.goodMap = goodMap;
    }

    public Map<Good, Integer> getGoodMap() {
        return goodMap;
    }

    public void setGoodMap(Map<Good, Integer> goodMap) {
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

    public void serialize(String fileName) {
        try (FileOutputStream fs = new FileOutputStream(fileName);
             ObjectOutputStream os = new ObjectOutputStream(fs)) {
            os.writeObject(this);
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    public void deserialize(String fileName) {
        try (FileInputStream fis = new FileInputStream(fileName);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            this.goodMap = ((Basket) ois.readObject()).getGoodMap();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Basket{" +
                "goodMap=" + goodMap +
                '}';
    }
}
