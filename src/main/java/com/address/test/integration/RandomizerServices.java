package com.address.test.integration;

import com.address.test.model.RandomizerModel;
import org.springframework.stereotype.Service;



@Service("RandomizerServices")
public class RandomizerServices {
    // “532 Union St., Apt 72, San Diego,
    //NY, 789302”
    public RandomizerModel getRandomizerModel(){
        RandomizerModel  randomizerModel = new RandomizerModel();
        randomizerModel.setHouse("532");
        randomizerModel.setStreet("Union St ,Apt 72");
        randomizerModel.setPostalCode("789302");
        randomizerModel.setCity("San Diego");
        randomizerModel.setCountry("US");
        randomizerModel.setState("NY");
        randomizerModel.setCountryCode("374");

        return randomizerModel;



    }
}
