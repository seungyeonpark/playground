package com.mall.Minimall.controller;

import com.mall.Minimall.domain.Item;
import com.mall.Minimall.domain.ItemRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@RequestMapping("/items")
@RequiredArgsConstructor
public class ItemController {

    private final ItemRepository store;

    @ResponseBody
    @GetMapping
    public void items() {
        Item item1 = new Item("item1", 10000, 10);
        Item item2 = new Item("item2", 20000, 20);

        store.save(item1);
        store.save(item2);

        for (Item item : store.findAll()) {
            log.info(item.getId() + " " + item.getItemName());
        }
    }

    @ResponseBody
    @GetMapping("/{itemId}")
    public void item(@PathVariable long itemId) {

        Item item = store.findById(itemId);
        log.info(item.getId() + " " + item.getItemName());
    }

    @ResponseBody
    @GetMapping("/add")
    public void addForm(){
        log.info("call add-form");
    }

    @ResponseBody
    @PostMapping("/add")
    public void addItem(){
        log.info("call add-item");
    }

    @ResponseBody
    @GetMapping("/{itemId}/edit")
    public void editForm(@PathVariable Long itemId){

        Item item = store.findById(itemId);
        log.info(item.getId() + " " + item.getItemName());
    }

    @ResponseBody
    @PostMapping("/{itemId}/edit")
    public void edit(@PathVariable Long itemId){

        Item item = store.findById(itemId);
        log.info(item.getId() + " " + item.getItemName());
    }
}
