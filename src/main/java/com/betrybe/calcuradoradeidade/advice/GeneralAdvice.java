package com.betrybe.calcuradoradeidade.advice;

import com.betrybe.calcuradoradeidade.exceptions.FutureDate;
import com.betrybe.calcuradoradeidade.exceptions.InvalidFormat;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * The type General advice.
 */
@ControllerAdvice
public class GeneralAdvice {

  /**
   * Handle future date response entity.
   *
   * @param exception the exception
   * @return the response entity
   */
  @ExceptionHandler
  public ResponseEntity<Map<String, String>> handleFutureDate(FutureDate exception) {
    Map<String, String> error = Map.of("error", exception.getMessage());
    return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(error);
  }

  /**
   * Handle invalid date response entity.
   *
   * @param exception the exception
   * @return the response entity
   */
  @ExceptionHandler
  public ResponseEntity<Map<String, String>> handleInvalidDate(InvalidFormat exception) {
    Map<String, String> error = Map.of("error", exception.getMessage());
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
  }
}
