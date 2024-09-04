package com.betrybe.calcuradoradeidade.controller;

import com.betrybe.calcuradoradeidade.dto.DateDto;
import java.time.LocalDate;
import java.time.Period;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/calculateAge")
public class AgeCalcutorController  implements AgeCalculatorControllerInterface {

  @Override
  @GetMapping
  public ResponseEntity<DateDto> calculateAge(@RequestParam(required = true) String date, @RequestParam(required = false) String orDefaultAge) {
    LocalDate then = LocalDate.parse(date);
    Period diff = Period.between(then, LocalDate.now());
    return ResponseEntity.status(HttpStatus.OK).body(new DateDto(diff.getYears()));
  }
}
