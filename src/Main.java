public class Main
{
    public static void main(String[] args)
    {
        int intOperandA = 1;
        int intOperandB = 3;
        int intSum = 10;
        int intProduct = 15;
        int intDifference = 29;
        int intModulo = 22;

        double doubleOperandA = 3.50;
        double doubleOperandB = 8.1;
        double doubleSum = 10.2;
        double doubleProduct = 2.62;
        double doubleDifference = 5.55;
        double doubleQuotient = 7.7;

        int kidsInMyFamily = 4;
        boolean isRaining = false;
        double gasPricePerGallon = 3.20;
        int favoriteNumber = 14;
        double shoeSize = 11;
        String myBirthMonth = "September";
        String myFullName = "Parker Wind";

        intSum = intOperandA+intOperandB;
        System.out.println("The sum of ints " + intOperandA + " and " + intOperandB + " is " + intSum);

        intProduct = intOperandA*intOperandB;
        System.out.println("The product of ints " + intOperandA + " and " + intOperandB + " is " + intProduct);

        intSum = intOperandA-intOperandB;
        System.out.println("The difference of ints " + intOperandA + " and " + intOperandB + " is " + intDifference);

        intModulo = intOperandA/intOperandB;
        System.out.println("The modulo of ints " + intOperandA + " and " + intOperandB + " is " + intModulo);

        doubleSum = doubleOperandA+doubleOperandB;
        System.out.println("The sum of doubles " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);

        doubleProduct = doubleOperandA*doubleOperandB;
        System.out.println("The product of doubles " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);

        doubleDifference = doubleOperandA-doubleOperandB;
        System.out.println("The difference of doubles " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);

        doubleQuotient = doubleOperandA/doubleOperandB;
        System.out.println("The quotient of doubles " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);


    }

}