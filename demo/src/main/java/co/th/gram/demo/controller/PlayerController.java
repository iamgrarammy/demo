package co.th.gram.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/player")
public class PlayerController {

    @PostMapping("/add")
    public String addItem(@RequestBody String item) {
        return "Item added: " + item;
    }

    @GetMapping("/search")
    public String searchItems(@RequestParam("query") String query) {
        return "Player : " + query;
    }

    @PutMapping("/update/{id}")
    public String updateItem(@PathVariable("id") int id, @RequestBody String item) {
        return "Item with ID " + id + " updated to: " + item;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteItem(@PathVariable("id") int id) {
        return "Item with ID " + id + " deleted.";
    }

}
