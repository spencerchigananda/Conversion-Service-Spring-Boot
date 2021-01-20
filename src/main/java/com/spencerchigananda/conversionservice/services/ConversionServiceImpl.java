package com.spencerchigananda.conversionservice.services;

import com.spencerchigananda.conversionservice.utils.Constants;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class ConversionServiceImpl implements ConversionService{


    @Override
    public BigDecimal kelvinToCelsius(BigDecimal kelvin) {
        // C = K - 273.15
        return kelvin.subtract(Constants.ABSOLUTE_ZERO_CONSTANT);
    }

    @Override
    public BigDecimal celsiusToKelvin(BigDecimal celsius) {
        // K = C + 273.15
        return celsius.add(Constants.ABSOLUTE_ZERO_CONSTANT);
    }

    @Override
    public BigDecimal milesToKilometres(BigDecimal miles) {
        // Km = Miles * 1.609
        return miles.multiply(Constants.MILES_TO_KM_CONSTANT);
    }

    @Override
    public BigDecimal kilometresToMiles(BigDecimal kilometres) {
        // Miles = Km / 1.609
        return kilometres.divide(Constants.MILES_TO_KM_CONSTANT, 3, RoundingMode.HALF_EVEN);
    }
}
