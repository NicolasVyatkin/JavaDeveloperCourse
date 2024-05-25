package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculationService {

    private final CalculationRepository calculationRepository;

    @Autowired
    public CalculationService(CalculationRepository calculationRepository) {
        this.calculationRepository = calculationRepository;
    }

    public CalculationResponse calculate(String type, int x, int y) {
        int result;
        if (type.equalsIgnoreCase("sum")) {
            result = x + y;
        } else if (type.equalsIgnoreCase("mult")) {
            result = x * y;
        } else {
            throw new IllegalArgumentException("Unknown operation type: " + type);
        }
        Calculation calculation = new Calculation(type, x, y, result);
        calculationRepository.save(calculation);
        return new CalculationResponse(result);
    }
}