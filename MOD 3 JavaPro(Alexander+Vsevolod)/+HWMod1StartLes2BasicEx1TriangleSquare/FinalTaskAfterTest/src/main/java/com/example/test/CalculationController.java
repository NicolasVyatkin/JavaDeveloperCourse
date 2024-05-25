package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculationController {

    private CalculationService calculationService;

    @Autowired
    public CalculationController(CalculationService calculationService) {
        this.calculationService = calculationService;
    }

    @GetMapping(value = "/calc", produces = "application/json")
    public CalculationResponse calculate(@RequestParam String type,
                                         @RequestParam int x,
                                         @RequestParam int y) {
        return calculationService.calculate(type, x, y);
    }
}

