package com.spencerchigananda.conversionservice.services;

import java.math.BigDecimal;

public interface ConversionService {
    BigDecimal kelvinToCelsius(BigDecimal kelvin);
    BigDecimal celsiusToKelvin(BigDecimal celsius);
    BigDecimal milesToKilometres(BigDecimal miles);
    BigDecimal kilometresToMiles(BigDecimal kilometres);
}
