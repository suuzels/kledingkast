package com.capgemini;

import java.util.ArrayList;

public class Clothing {

    public Clothing(String typeOfGarment) {
        this.typeOfGarment = typeOfGarment;
    }

    private String typeOfGarment;

    private boolean isDirty;

    ArrayList<Clothing> laundryBag = new ArrayList<Clothing>();

    public void throwInLaundryBag(Clothing clothing){
        laundryBag.add(clothing);
    }

    public void washClothes(ArrayList<Clothing> laundryBag){
        System.out.println("Your clothes are being washed.");
        for (Clothing clothes : laundryBag){
            isDirty = true;
        }
        for (Clothing clothes : laundryBag){
            laundryBag.remove(clothes);
        }
        System.out.println("All the clothes from the laundry bag are now clean again.");
        
    }
}
