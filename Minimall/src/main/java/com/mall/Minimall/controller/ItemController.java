package com.mall.Minimall.controller;

import com.mall.Minimall.domain.Item;
import com.mall.Minimall.domain.ItemRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Slf4j
@Controller
@RequestMapping("/items")
@RequiredArgsConstructor
public class ItemController {

    private final ItemRepository itemRepository;

    @GetMapping
    public String items(Model model) {

        model.addAttribute("items", itemRepository.findAll());
        return "items";
    }

    @GetMapping("/{itemId}")
    public String item(@PathVariable long itemId, Model model) {

        Item item = itemRepository.findById(itemId);
        model.addAttribute("item", item);

        return "item";
    }

    @GetMapping("/add")
    public String addForm(){
        return "addForm";
    }

    @PostMapping("/add")
    public String addItem(@ModelAttribute Item item, RedirectAttributes redirectAttributes){

        Item savedItem = itemRepository.save(item);

        redirectAttributes.addAttribute("itemId", savedItem.getId());
        redirectAttributes.addAttribute("status", true);

        return "redirect:/items/{itemId}";
    }

    @ResponseBody
    @GetMapping("/{itemId}/edit")
    public void editForm(@PathVariable Long itemId){

        Item item = itemRepository.findById(itemId);
        log.info(item.getId() + " " + item.getItemName());
    }

    @ResponseBody
    @PostMapping("/{itemId}/edit")
    public void edit(@PathVariable Long itemId){

        Item item = itemRepository.findById(itemId);
        log.info(item.getId() + " " + item.getItemName());
    }
}
