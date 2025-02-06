package br.com.mramos.controllers;

import br.com.mramos.UnsupportedMathOperationaException;
import br.com.mramos.converters.NumberConverter;
import br.com.mramos.math.SimpleMath;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;


@RestController
public class MathController {

    private final AtomicLong counter = new AtomicLong();
    private SimpleMath math = new SimpleMath();


    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
            throw new UnsupportedMathOperationaException("Please set a numeric value!!");

        }
        return math.sum(NumberConverter.convertToDouble(numberOne) ,NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/subtrair/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double subtrair(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
            throw new UnsupportedMathOperationaException("Please set a numeric value!!");

        }
        return math.subtrair( NumberConverter.convertToDouble(numberOne) , NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/multiplicar/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double multiplicar(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
            throw new UnsupportedMathOperationaException("Please set a numeric value!!");

        }
        return math.multiplicar( NumberConverter.convertToDouble(numberOne) , NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/dividir/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double dividir(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
            throw new UnsupportedMathOperationaException("Please set a numeric value!!");
        } else if (Integer.valueOf(numberTwo) <= 0) {
            throw new UnsupportedMathOperationaException("Divisor deve ser maior que zero!");

        }
        return math.dividir( NumberConverter.convertToDouble(numberOne) , NumberConverter.convertToDouble(numberTwo));
    }
    @RequestMapping(value = "/media/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double media(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
            throw new UnsupportedMathOperationaException("Please set a numeric value!!");

        }
        return math.media( NumberConverter.convertToDouble(numberOne) , NumberConverter.convertToDouble(numberTwo));
    }
    @RequestMapping(value = "/quadrado/{numberOne}", method = RequestMethod.GET)
    public Double quadrado(@PathVariable(value = "numberOne") String numberOne) throws Exception {
        if (!NumberConverter.isNumeric(numberOne)){
            throw new UnsupportedMathOperationaException("Please set a numeric value!!");

        }

        return math.quadrado(NumberConverter.convertToDouble(numberOne));
    }


}
