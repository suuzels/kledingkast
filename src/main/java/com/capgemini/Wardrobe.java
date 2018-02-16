package com.capgemini;

import java.util.ArrayList;

public class Wardrobe implements IWardrobe {

    public Wardrobe(boolean isBroken, EState stateOfDoor, int amountOfClothes) {
        this.isBroken = isBroken;
        this.stateOfDoor = stateOfDoor;
        this.amountOfClothes = amountOfClothes;
    }

    private boolean isBroken;

    private EState stateOfDoor;

    private int amountOfClothes;

    private int yourPower = 1;


    public void openWardrobe() {
        if (stateOfDoor == EState.CLOSED) {
            stateOfDoor = EState.OPEN;
            System.out.println("You have opened the door.");
            System.out.println("----------");
        } else {
            System.out.println("Close the door first before opening.");
            System.out.println("----------");
        }

    }

    public void closeWardrobe() {
        if (stateOfDoor == EState.OPEN) {
            stateOfDoor = EState.CLOSED;
            System.out.println("You have closed the door.");
            System.out.println("----------");
        } else {
            System.out.println("Open the door first before closing.");
            System.out.println("----------");
        }

    }

    public void checkAmountOfClothes(ArrayList<Clothing> wardrobeItems) {
        for (Clothing item : wardrobeItems) {
            amountOfClothes++;
        }
        System.out.println("There are " + amountOfClothes + " pieces of clothing in your wardrobe.");
        System.out.println("----------");

    }

    // Main methode
    public void kickWardrobe() {
        System.out.println("You kicked the door really hard.");
        System.out.println("----------");
        double oneFromTen = Math.floor((Math.random() * 10) + 1);
        if (oneFromTen >= 1 && oneFromTen <= 3) {
            System.out.println("Woops, you broke it!");
            System.out.println("----------");
            isBroken = true;
            repairDoor();
            kickWardrobe();
        } else if (oneFromTen == 4 || oneFromTen == 5) {
            System.out.println("The maid found you.");
            System.out.println("You'll get a 10 seconds timeout.");
            System.out.println("----------");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            kickWardrobe();
        } else {
            System.out.println("The door opened. Let's hide inside.");
            System.out.println("----------");
            hideInWardrobe();
        }

    }

    // Repareert de kast.
    public void repairDoor() {
        isBroken = false;
        System.out.println("You have repaired the door.");
        System.out.println("----------");
    }

    public void hideInWardrobe() {
        System.out.println("You hid in the wardrobe.");
        System.out.println("----------");
        double oneFromTen = Math.floor((Math.random() * 10) + 1);
        if (oneFromTen == 1) {
            System.out.println("You went through a portal to Narnia1!1!1!!");
            System.out.println("----------");
            goToNarnia();
        } else {
            System.out.println("Nothing happened. BORING! Let's get out of here.");
            System.out.println("----------");
            comingOut();
        }
    }

    public void comingOut() {
        System.out.println("Congratulations, it's your coming out day!");
        System.out.println("----------");
        System.out.println("Let's kick the wardrobe again.");
        System.out.println("----------");
        kickWardrobe();
    }


    // This method should be started in 10% of the cases in which you hide in the wardrobe.
    public void goToNarnia() {
        System.out.println("You arrived in Narnia.");
        System.out.println("----------");
        System.out.println("You will go to the witch.");
        System.out.println("----------");
        fightTheWitch();

    }

    // Vechten tegen de heks.
    public void fightTheWitch() {
        System.out.println("You will now fight the witch.");
        System.out.println("----------");
        int oneFromHundred = (int) Math.floor((Math.random() * 100) + 1);
        if (oneFromHundred <= this.yourPower) {
            System.out.println("Your power is: " + this.yourPower);
            System.out.println("You have defeated the witch! Now you may talk to Aslan.");
            System.out.println("----------");
            talkToAslan();
        } else {
            System.out.println("The witch defeated you. You will return to Londen.");
            System.out.println("----------");
            this.yourPower++;
            System.out.println("Your power is now: " + this.yourPower);
            System.out.println("----------");
            kickWardrobe();
        }
    }

    // This method can only be started when the white which is defeated.
    public void talkToAslan() {
        System.out.println("What's up Aslan!");
        System.out.println("\n" +
                "                                                ,w.\n" +
                "                                              ,YWMMw  ,M  ,\n" +
                "                         _.---.._   __..---._.'MMMMMw,wMWmW,\n" +
                "                    _.-\"\"        \"\"\"           YP\"WMMMMMMMMMb,\n" +
                "                 .-' __.'                   .'     MMMMW^WMMMM;\n" +
                "     _,        .'.-'\"; `,       /`     .--\"\"      :MMM[==MWMW^;\n" +
                "  ,mM^\"     ,-'.'   /   ;      ;      /   ,       MMMMb_wMW\"  @\\\n" +
                " ,MM:.    .'.-'   .'     ;     `\\    ;     `,     MMMMMMMW `\"=./`-,\n" +
                " WMMm__,-'.'     /      _.\\      F\"\"\"-+,,   ;_,_.dMMMMMMMM[,_ / `=_}\n" +
                " \"^MP__.-'    ,-' _.--\"\"   `-,   ;       \\  ; ;MMMMMMMMMMW^``; __|\n" +
                "            /   .'            ; ;         )  )`{  \\ `\"^W^`,   \\  :\n" +
                "           /  .'             /  (       .'  /     Ww._     `.  `\"\n" +
                "          /  Y,              `,  `-,=,_{   ;      MMMP`\"\"-,  `-._.-,\n" +
                " fsc     (--, )                `,_ / `) \\/\"\")      ^\"      `-, -;\"\\:\n" +
                "          `\"\"\"                    `\"\"\"   `\"'                  `---\" ");
        System.out.println("----------");
        System.out.println("░░█▀░░░░░░░░░░░▀▀███████░░░░ \n" +
                "░░█▌░░░░░░░░░░░░░░░▀██████░░░ \n" +
                "░█▌░░░░░░░░░░░░░░░░███████▌░░ \n" +
                "░█░░░░░░░░░░░░░░░░░████████░░ \n" +
                "▐▌░░░░░░░░░░░░░░░░░▀██████▌░░ \n" +
                "░▌▄███▌░░░░▀████▄░░░░▀████▌░░ \n" +
                "▐▀▀▄█▄░▌░░░▄██▄▄▄▀░░░░████▄▄░ \n" +
                "▐░▀░░═▐░░░░░░══░░▀░░░░▐▀░▄▀▌▌ \n" +
                "▐░░░░░▌░░░░░░░░░░░░░░░▀░▀░░▌▌ \n" +
                "▐░░░▄▀░░░▀░▌░░░░░░░░░░░░▌█░▌▌ \n" +
                "░▌░░▀▀▄▄▀▀▄▌▌░░░░░░░░░░▐░▀▐▐░ \n" +
                "░▌░░▌░▄▄▄▄░░░▌░░░░░░░░▐░░▀▐░░ \n" +
                "░█░▐▄██████▄░▐░░░░░░░░█▀▄▄▀░░ \n" +
                "░▐░▌▌░░░░░░▀▀▄▐░░░░░░█▌░░░░░░ \n" +
                "░░█░░▄▀▀▀▀▄░▄═╝▄░░░▄▀░▌░░░░░░ \n" +
                "░░░▌▐░░░░░░▌░▀▀░░▄▀░░▐░░░░░░░ \n" +
                "░░░▀▄░░░░░░░░░▄▀▀░░░░█░░░░░░░ \n" +
                "░░░▄█▄▄▄▄▄▄▄▀▀░░░░░░░▌▌░░░░░░ \n" +
                "░░▄▀▌▀▌░░░░░░░░░░░░░▄▀▀▄░░░░░ \n" +
                "▄▀░░▌░▀▄░░░░░░░░░░▄▀░░▌░▀▄░░░ \n" +
                "░░░░▌█▄▄▀▄░░░░░░▄▀░░░░▌░░░▌▄▄ \n" +
                "░░░▄▐██████▄▄░▄▀░░▄▄▄▄▌░░░░▄░ \n" +
                "░░▄▌████████▄▄▄███████▌░░░░░▄ \n" +
                "░▄▀░██████████████████▌▀▄░░░░ \n" +
                "▀░░░█████▀▀░░░▀███████░░░▀▄░░ \n" +
                "░░░░▐█▀░░░▐░░░░░▀████▌░░░░▀▄░ \n" +
                "░░░░░░▌░░░▐░░░░▐░░▀▀█░░░░░░░▀ \n" +
                "░░░░░░▐░░░░▌░░░▐░░░░░▌░░░░░░░ \n" +
                "░╔╗║░╔═╗░═╦═░░░░░╔╗░░╔═╗░╦═╗░ \n" +
                "░║║║░║░║░░║░░░░░░╠╩╗░╠═╣░║░║░ \n" +
                "░║╚╝░╚═╝░░║░░░░░░╚═╝░║░║░╩═╝░ ");
        System.out.println("----------");


    }
}
