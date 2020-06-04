package es.codeurjc.test.ejem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {

  @Test
  public void testSuma() {

    // Arrange / Given
    Calculadora calculadora = new Calculadora();

    // Act / When
    int res = calculadora.suma(1, 1);

    // Assert / Then
    assertEquals(2, res, 0);
  }
  
}