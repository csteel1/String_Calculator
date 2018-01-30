package edu.ithaca.steel;

public interface StringCalculator {

    /**
     * Calculates the sum of the numbers contained within the string parameter and returns the result.
     * Values must be separated by commas
     *
     * @param numbers   a string of 0, 1, or 2 numbers
     * @return          the sum of the numbers passed as a parameter
     */
    public int add(String numbers);

}
