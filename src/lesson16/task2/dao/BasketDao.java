package lesson16.task2.dao;

import lesson16.task2.entity.Basket;

import java.util.List;

public interface BasketDao {
    //create
    void add(Basket basket);

    //read
     List<Basket> getAll();

     Basket getById(int id);

    //update
     void upDate(Basket basket);

    //remove
     Basket remove(Basket basket);

}
