package com.betrybe.calcuradoradeidade.exceptions;

public class FutureDate extends Exception {
  public FutureDate () {
    super("This is a future date.");
  }
}
