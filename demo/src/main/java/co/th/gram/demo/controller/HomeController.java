package co.th.gram.demo.controller;


import co.th.gram.common.TestUntil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String index() {

        TestUntil testUntil = new TestUntil();
        String returnString = testUntil.addition("Hello");
        return returnString + " Greetings from Spring Boot!";
    }

}
