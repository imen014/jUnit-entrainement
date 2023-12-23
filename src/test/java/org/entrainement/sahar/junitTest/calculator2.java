package org.entrainement.sahar.junitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class calculator2 {

    @Test
    public void addingTwoPositiveNumbers() {

	// Arrange
	int a = 5;
	int b = 1;

	Calculator calculator2 = new Calculator();

	// Act
	int result = calculator2.add(a, b);

	// Assert
	assertEquals(5, result);
    }

}
