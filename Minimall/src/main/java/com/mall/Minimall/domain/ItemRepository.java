package com.mall.Minimall.domain;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class ItemRepository {

    private static final HashMap<Long, Item> store = new HashMap<>();
    private static Long sequence = 0L;

    public Item save(Item item) {

        item.setId(++sequence);
        store.put(item.getId(), item);
        return item;
    }

    public Item findById(Long id) {
        return store.get(id);
    }

    public List<Item> findAll() {
        return new ArrayList<>(store.values());
    }
}
