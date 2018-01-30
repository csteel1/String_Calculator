package edu.ithaca.steel;

public class StringCalculatorImpl implements StringCalculator{
    @Override
    public int add(String numbers) {
        if(numbers.isEmpty())return 0;
        // split the string into array
        String[] numList = numbers.split("\\s*,\\s*");
        int sum = 0;
        for(int j = 0; j < numList.length; j++) {
            // splits string into char array and iteratively checks for non-integers
            char[] strSearch = numList[j].toCharArray();
            for (int i = 0; i < strSearch.length; i++) {
                // if current character not a digit and pattern does not suggest a negative digit
                if ((!Character.isDigit(strSearch[i])) && !((i == 0) && (strSearch[i] == '-') && (strSearch.length > 1))) {
                    System.out.println("Parameters must be integer values");
                    return 0;
                }
            }
            // increment sum by values that pass the test
            sum += Integer.parseInt(numList[j]);
        }
        return sum;
    }
}
