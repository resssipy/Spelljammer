package com.example.Spelljammer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Random;

@SpringBootApplication
public class Dice {
    Random random = new Random();
    public int d100() {
        return random.nextInt(100)+1;
    }
    public int d20() {
        return random.nextInt(20)+1;
    }
    public int d12() {
        return random.nextInt(12)+1;
    }
    public int d10() {
        return random.nextInt(10)+1;
    }
    public int d8() {
        return random.nextInt(8)+1;
    }
    public int d6() {
        return random.nextInt(6)+1;
    }
    public int d4() {
        return random.nextInt(4)+1;
    }
    public int d100(int diceCount) {
        int out = 0;
        for (int i = 0; i < diceCount; i++) out += random.nextInt(100) + 1;
        return out;
    }
    public int d20(int diceCount) {
        int out = 0;
        for (int i = 0; i < diceCount; i++) out += random.nextInt(20) + 1;
        return out;
    }
    public int d12(int diceCount) {
        int out = 0;
        for (int i = 0; i < diceCount; i++) out += random.nextInt(12) + 1;
        return out;
    }
    public int d10(int diceCount) {
        int out = 0;
        for (int i = 0; i < diceCount; i++) out += random.nextInt(10) + 1;
        return out;
    }
    public int d8(int diceCount) {
        int out = 0;
        for (int i = 0; i < diceCount; i++) out += random.nextInt(8) + 1;
        return out;
    }
    public int d6(int diceCount) {
        int out = 0;
        for (int i = 0; i < diceCount; i++) out += random.nextInt(6) + 1;
        return out;
    }
    public int d4(int diceCount) {
        int out = 0;
        for (int i = 0; i < diceCount; i++) out += random.nextInt(4) + 1;
        return out;
    }
}
