package com.spencerchigananda.conversionservice.api;

import com.spencerchigananda.conversionservice.dto.ApiResponse;
import com.spencerchigananda.conversionservice.dto.CelsiusKelvinDto;
import com.spencerchigananda.conversionservice.dto.MilesKilometresDto;
import com.spencerchigananda.conversionservice.services.ConversionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@CrossOrigin
@RequestMapping(value = "/conversions", produces = MediaType.APPLICATION_JSON_VALUE)
@Api(value = "/conversions", produces = MediaType.APPLICATION_JSON_VALUE)
public class ConversionRestController {

    private final ConversionService conversionService;

    @Autowired
    public ConversionRestController(ConversionService conversionService) {
        this.conversionService = conversionService;
    }

    @GetMapping("/ktoc")
    @ApiOperation(value = "Convert Kelvin to Celsius. Takes Kelvin input as a request parameter", response = ApiResponse.class)
    public ApiResponse convertKelvinToCelsius(@RequestParam("input") BigDecimal input){
        return new ApiResponse(200, "SUCCESS", new CelsiusKelvinDto(conversionService.kelvinToCelsius(input), input));
    }

    @GetMapping("/ctok")
    @ApiOperation(value = "Convert Celsius to Kelvin. Takes Celsius input as a request parameter", response = ApiResponse.class)
    public ApiResponse convertCelsiusToKelvin(@RequestParam("input") BigDecimal input){
        return new ApiResponse(200, "SUCCESS", new CelsiusKelvinDto(input, conversionService.celsiusToKelvin(input)));
    }

    @GetMapping("/mtok")
    @ApiOperation(value = "Convert miles to kilometres. Takes miles input as a request parameter", response = ApiResponse.class)
    public ApiResponse convertMilesToKilometres(@RequestParam("input") BigDecimal input){
        return new ApiResponse(200, "SUCCESS", new MilesKilometresDto(input, conversionService.milesToKilometres(input)));
    }

    @GetMapping("/ktom")
    @ApiOperation(value = "Convert kilometres to miles. Takes kilometres input as a request parameter", response = ApiResponse.class)
    public ApiResponse convertKilometresToMiles(@RequestParam("input") BigDecimal input){
        return new ApiResponse(200, "SUCCESS", new MilesKilometresDto(conversionService.kilometresToMiles(input), input));
    }
}
