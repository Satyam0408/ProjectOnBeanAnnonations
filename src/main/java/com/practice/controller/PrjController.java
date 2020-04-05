package com.practice.controller;

import com.practice.entities.Addition;
import com.practice.entities.Subtraction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrjController {
    private Subtraction subtraction;
    private Addition addition;

    @Autowired
    public PrjController(Subtraction subtraction, Addition addition) {
        this.subtraction = subtraction;
        this.addition = addition;
    }

    @GetMapping("/operation")
    public ResponseEntity<String> getMeOperationTpe() {
        subtraction.setSubtractionID(1);
        addition.setAdditionId(1);
        subtraction.setAddition(addition);

        return new ResponseEntity<>(subtraction.performAction("subtraction"), HttpStatus.OK);
    }

    @GetMapping("/operation1")
    public ResponseEntity<String> getMeOperationType() {
        return new ResponseEntity<>(subtraction.getSubtractionID() + "||" + subtraction.getAddition().getAdditionId(), HttpStatus.OK);
    }


}
