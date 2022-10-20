package com.example.Spelljammer.Encounters;

import com.example.Spelljammer.Dice;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Wildspace {
    Dice dice = new Dice();
    @GetMapping("/wildspace/")
    public int generateEncounter() {

        return dice.d100();
    }
}
