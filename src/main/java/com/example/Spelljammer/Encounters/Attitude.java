package com.example.Spelljammer.Encounters;

public class Attitude {
    public String getAttitude(int roll) {
        if (roll<4) return "Hostile";
        if (roll<8) return "Indifferent";
        return "Friendly";
    }
}
