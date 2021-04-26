package com.address.test.controler;

import com.address.test.integration.RandomizerServices;
import com.address.test.model.RandomizerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(path = "/")
public class RandomizerControler {
    @Autowired
    com.address.test.integration.RandomizerServices randomizerServices;


    @RequestMapping(value = "randomizer/address" , method = RequestMethod.GET)
    public ResponseEntity<RandomizerModel> getRandomizerModel(){
        RandomizerModel result  = randomizerServices.getRandomizerModel();
        return ResponseEntity.ok(result);
    }
}
