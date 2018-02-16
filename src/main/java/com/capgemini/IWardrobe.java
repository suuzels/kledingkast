package com.capgemini;

import java.util.ArrayList;

public interface IWardrobe {

    void openWardrobe();

    void closeWardrobe();

    void checkAmountOfClothes(ArrayList<Clothing> clothingArrayList);

    void kickWardrobe();

    void hideInWardrobe();

    void comingOut();
}
