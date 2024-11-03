//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static double convertUSD(double amount) {
        return amount * 3.25;
    }

    public static double convertUDStoKWD(double amount) {
        return amount / 3.25;
    }

    public static double convertEURtoKWD(double amount) {
        return amount * 3;
    }

    public static void main(String[] args) {
        double amountKWD = 86;
        double amountEUR = 105;

        double amountUSD = convertUSD(amountKWD);


        System.out.println(amountKWD + " KWD = " + amountUSD + " USD");
        System.out.println(convertUDStoKWD(amountUSD) + " KWD = " + amountUSD + " USD");
        System.out.println(amountEUR + " EUR = " + convertEURtoKWD(amountEUR) + " KWD");


    }
}