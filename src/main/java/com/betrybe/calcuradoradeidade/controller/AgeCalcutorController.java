package com.betrybe.calcuradoradeidade.controller;

import com.betrybe.calcuradoradeidade.dto.DateDto;
import com.betrybe.calcuradoradeidade.exceptions.FutureDate;
import com.betrybe.calcuradoradeidade.exceptions.InvalidFormat;
import com.betrybe.calcuradoradeidade.service.AgeCalculatorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/calculateAge")
public class AgeCalcutorController implements AgeCalculatorControllerInterface {

  private final AgeCalculatorService service;

  public AgeCalcutorController(AgeCalculatorService service) {
    this.service = service;
  }

  @Override
  @GetMapping
  public ResponseEntity<DateDto> calculateAge(@RequestParam(required = true) String date,
      @RequestParam(required = false) String orDefaultAge)
      throws FutureDate, InvalidFormat {
    int diff = service.calculateAge(date);
    return ResponseEntity.status(HttpStatus.OK).body(new DateDto(diff));
  }
}
