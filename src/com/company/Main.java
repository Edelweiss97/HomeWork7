package com.company;

public class Main {

    public static void main(String[] args) {
    Warrior warrior = new Warrior();
    Magic magic = new Magic();
    Medic medic = new Medic();

    HavingSuperAbility[] havingSuperAbilities = {warrior,magic,medic};
        for (int i = 0; i < havingSuperAbilities.length; i++) {
            havingSuperAbilities[i].applySuperAbility();
        }
    }
}
