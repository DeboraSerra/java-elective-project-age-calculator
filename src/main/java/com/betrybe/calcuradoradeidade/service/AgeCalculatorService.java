package com.betrybe.calcuradoradeidade.service;

import com.betrybe.calcuradoradeidade.exceptions.FutureDate;
import com.betrybe.calcuradoradeidade.exceptions.InvalidFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.regex.Pattern;
import org.springframework.stereotype.Service;

/**
 * Aqui nessa classe devem ser implementados os métodos para atender aos requisitos do exercício,
 * sinta-se à vontade para criar métodos privados para te auxiliar nas validações.
 */
@Service
public class AgeCalculatorService {

  /**
   * Calculate age int.
   *
   * @param date the date
   * @return the int
   * @throws FutureDate    the future date
   * @throws InvalidFormat the invalid format
   */
  public int calculateAge(String date) throws FutureDate, InvalidFormat {
    Pattern charRegex = Pattern.compile("[a-z]", Pattern.CASE_INSENSITIVE);
    Pattern expectedRegex = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");
    if (charRegex.matcher(date).find()) {
      throw new InvalidFormat("Date should be in numeric format.");
    }
    if (!expectedRegex.matcher(date).find()) {
      throw new InvalidFormat("Invalid date format. Expected aa-mm-dd.");
    }
    LocalDate then = LocalDate.parse(date);

    Period diff = Period.between(then, LocalDate.now());
    if (diff.getYears() < 0) {
      throw new FutureDate();
    }
    return diff.getYears();
  }

  /**
   * Calculate age with default int.
   *
   * @param date       the date
   * @param defaultAge the default age
   * @return the int
   */
  public int calculateAgeWithDefault(String date, int defaultAge) {
    Pattern charRegex = Pattern.compile("[a-z]", Pattern.CASE_INSENSITIVE);
    Pattern expectedRegex = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");
    if (charRegex.matcher(date).find()) {
      return defaultAge;
    }
    if (!expectedRegex.matcher(date).find()) {
      return defaultAge;
    }
    LocalDate then = LocalDate.parse(date);

    Period diff = Period.between(then, LocalDate.now());
    if (diff.getYears() < 0) {
      return defaultAge;
    }
    return diff.getYears();
  }
}
