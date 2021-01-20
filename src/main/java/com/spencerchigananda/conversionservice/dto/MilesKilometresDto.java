package com.spencerchigananda.conversionservice.dto;

import java.math.BigDecimal;

public class MilesKilometresDto {
    private BigDecimal miles;
    private BigDecimal kilometres;

    public MilesKilometresDto() {
    }

    public MilesKilometresDto(BigDecimal miles, BigDecimal kilometres) {
        this.miles = miles;
        this.kilometres = kilometres;
    }

    public BigDecimal getMiles() {
        return miles;
    }

    public void setMiles(BigDecimal miles) {
        this.miles = miles;
    }

    public BigDecimal getKilometres() {
        return kilometres;
    }

    public void setKilometres(BigDecimal kilometres) {
        this.kilometres = kilometres;
    }
}
