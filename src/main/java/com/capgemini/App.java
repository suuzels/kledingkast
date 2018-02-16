package com.capgemini;

import java.util.ArrayList;

/**
 * Lion, witch, wardrobe
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        IWardrobe dombas = new Wardrobe(false, EState.CLOSED, 0);

        Clothing jeans = new Clothing("jeans");
        Clothing shirt = new Clothing("shirt");
        Clothing socks = new Clothing("socks");

        // List of items in wardrobe.
        ArrayList<Clothing> wardrobeItems = new ArrayList<Clothing>();
        wardrobeItems.add(jeans);
        wardrobeItems.add(jeans);
        wardrobeItems.add(shirt);
        wardrobeItems.add(shirt);
        wardrobeItems.add(shirt);
        wardrobeItems.add(socks);
        wardrobeItems.add(socks);
        wardrobeItems.add(socks);
        wardrobeItems.add(socks);
        wardrobeItems.add(socks);
        wardrobeItems.add(socks);
        wardrobeItems.add(socks);

        // Methodes from Wardrobe.
        dombas.kickWardrobe();

    }
}
