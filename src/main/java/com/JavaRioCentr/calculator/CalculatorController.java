package com.JavaRioCentr.calculator;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "calculator")

public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String welcome() {
        return calculatorService.welcome();
    }

    @GetMapping(path = "plus")
    public String plus(
            @RequestParam(value = "num1", required = false) Integer num1,
            @RequestParam(value = "num2", required = false) Integer num2) {
        return calculatorService.plus(num1, num2);
    }
    @GetMapping(path = "minus")
    public String minus(
            @RequestParam(value = "num1", required = false) Integer num1,
            @RequestParam(value = "num2", required = false) Integer num2) {
        return calculatorService.minus(num1, num2);
    }
    @GetMapping(path = "multiply")
    public String multiply(
            @RequestParam(value = "num1", required = false) Integer num1,
            @RequestParam(value = "num2", required = false) Integer num2) {
        return calculatorService.multiply(num1, num2);
    }
    @GetMapping(path = "divide")
    public String divide(
            @RequestParam(value = "num1", required = false) Double num1,
            @RequestParam(value = "num2", required = false) Double num2) {
        return calculatorService.divide(num1, num2);
    }


}
