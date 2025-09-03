import java.io.*;

class Interestcalculator {
    public static void main(String[] args) {
        // Use primitive float or static factory method valueOf() instead of deprecated constructor
        float principalAmount = 0.0f; 
        float rateOfInterest = 0.0f;
        int numberOfYears = 0;

        DataInputStream in = new DataInputStream(System.in);
        String tempString;

        try { // Add try-catch block to handle potential IOException and NumberFormatException
            System.out.println("Enter Principal Amount: ");
            System.out.flush();
            tempString = in.readLine();
            principalAmount = Float.parseFloat(tempString); // Use parseFloat() for string to float conversion

            System.out.println("Enter Rate of Interest: ");
            System.out.flush();
            tempString = in.readLine();
            rateOfInterest = Float.parseFloat(tempString); // Use parseFloat()

            System.out.println("Enter Number Of Years: ");
            System.out.flush();
            tempString = in.readLine();
            numberOfYears = Integer.parseInt(tempString);

            float interestTotal = principalAmount * rateOfInterest * numberOfYears;
            System.out.println("Total Interest: " + interestTotal);

        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format entered: " + e.getMessage());
        }
    }
}