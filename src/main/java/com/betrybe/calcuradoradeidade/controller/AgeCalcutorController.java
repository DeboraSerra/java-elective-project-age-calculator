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

/**
 * The type Age calcutor controller.
 */
@RestController
@RequestMapping(value = "/calculateAge")
public class AgeCalcutorController implements AgeCalculatorControllerInterface {

  private final AgeCalculatorService service;

  /**
   * Instantiates a new Age calcutor controller.
   *
   * @param service the service
   */
  public AgeCalcutorController(AgeCalculatorService service) {
    this.service = service;
  }

  @Override
  @GetMapping
  public ResponseEntity<DateDto> calculateAge(@RequestParam(required = true) String date,
      @RequestParam(required = false, defaultValue = "") String orDefaultAge)
      throws FutureDate, InvalidFormat {
    int diff = !orDefaultAge.isBlank() ? service.calculateAgeWithDefault(date,
        Integer.parseInt(orDefaultAge))
        : service.calculateAge(date);
    return ResponseEntity.status(HttpStatus.OK).body(new DateDto(diff));
  }
}
