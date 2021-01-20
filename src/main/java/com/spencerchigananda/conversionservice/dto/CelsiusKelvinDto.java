package com.spencerchigananda.conversionservice.dto;

import java.math.BigDecimal;

public class CelsiusKelvinDto {

    private BigDecimal celsius;
    private BigDecimal kelvin;

    public CelsiusKelvinDto() {
    }

    public CelsiusKelvinDto(BigDecimal celsius, BigDecimal kelvin) {
        this.celsius = celsius;
        this.kelvin = kelvin;
    }

    public BigDecimal getCelsius() {
        return celsius;
    }

    public void setCelsius(BigDecimal celsius) {
        this.celsius = celsius;
    }

    public BigDecimal getKelvin() {
        return kelvin;
    }

    public void setKelvin(BigDecimal kelvin) {
        this.kelvin = kelvin;
    }
}
