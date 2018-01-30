package edu.ithaca.steel;

public class StringCalculatorImpl implements StringCalculator{
    @Override
    public int add(String numbers) {
        if(numbers.isEmpty())return 0;


        // splits string into char array and iteratively checks for non-integers
        char[] strSearch = numbers.toCharArray();
        for(int i = 0; i < strSearch.length; i++){
            // if current character not a digit and pattern does not suggest a negative digit
            if((!Character.isDigit(strSearch[i])) && !((i==0)&&(strSearch[i]=='-')&&(strSearch.length>1))){
                System.out.println("Parameters must be integer values");
                return 0;
            }
        }


        int myVal = Integer.parseInt(numbers);

        return myVal;
    }
}
