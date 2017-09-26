package lesson16.task2.dao;

import lesson16.task2.entity.Catalog;

import java.util.List;

public interface CatalogDao {

    void add(Catalog catalog);

    List<Catalog> getAll();

    Catalog getById(int id);

    Catalog upDate(Catalog catalog);

    Catalog remove(Catalog catalog);

}
