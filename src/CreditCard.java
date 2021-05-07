import java.util.*;

public class CreditCard {
    public static int getCheckDigit(String creditCardno) {
        return Character.getNumericValue(creditCardno.charAt(creditCardno.length()-1));
    }

    public static int getCheckSum(String creditCardno) {
        int d;
        int cs = 0;
        for (int i=0;i<15;i++) {
            d = Character.getNumericValue(creditCardno.charAt(i));
            if (i%2 == 0) {
                d *= 2;
                if (d>=10) {
                    d = d-10 + 1;
                }
            } cs += d;
        } return cs;
    }

    public static boolean checkCreditCard(String creditCardno) {
        return (10-(getCheckSum(creditCardno)%10))%10 == getCheckDigit(creditCardno);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter credit card number: ");
        String ccn = s.nextLine();
        System.out.println("Check Digit: " + getCheckDigit(ccn) + "\n" +
                "Checksum: " + getCheckSum(ccn));
        if (checkCreditCard(ccn)) {
            System.out.println("This is a valid card");
        } else {
            System.out.println("This is not a valid card");
        }
    }
}
