package com.example.Spelljammer.Encounters;

import com.example.Spelljammer.Dice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Wildspace {
    Attitude attitude = new Attitude();
    Dice dice = new Dice();
    @GetMapping("/wildspace/")
    public String showEncounter() {
        int encounter = generateEncounter();
        if (encounter >= 1 && encounter <= 3) {
            return dice.d4() + " chwinga astronaut(s), each mounted on 1 space guppy" + "<br>" +
                    "Initial Attitude: " + attitude.getAttitude(dice.d6()+4);
        } else if(encounter == 4) {
            boolean asleep = dice.d100() <= 30;
            return "1 cosmic horror" + "<br>" +
                    "Asleep: " + asleep + "<br>" +
                    "Initial Attitude: " + attitude.getAttitude(dice.d6());
        } else if(encounter == 5) {
            return "1 esthetic piloted by 1 reigar" + "<br>" +
                    "Initial Attitude: " + attitude.getAttitude(dice.d12());
        }
        return "encounter";
    }
    public int generateEncounter() {
        return 4;
        //return dice.d100();
    }
}