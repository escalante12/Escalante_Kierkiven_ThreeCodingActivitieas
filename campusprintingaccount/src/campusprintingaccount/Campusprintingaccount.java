/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package campusprintingaccount;

/**
 *
 * @author Escalante_CPE113
 */
public class Campusprintingaccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   CampusPrintingAccount1 mia = new CampusPrintingAccount1("Mia", 10);
      CampusPrintingAccount1 luis = new CampusPrintingAccount1 ("Luis", -4);
        System.out.println("Mia: " + mia.getCredits() + ", Luis: " + luis.getCredits());

        boolean result1 = mia.printPages(4);
        System.out.println(result1 + "; Mia: " + mia.getCredits());

        boolean result2 = mia.printPages(7);
        System.out.println(result2 + "; Mia: " + mia.getCredits());

        boolean result3 = mia.addCredits(-3);
        System.out.println(result3 + "; Mia: " + mia.getCredits());

        boolean result4 = mia.addCredits(4);
        System.out.println(result4 + "; Mia: " + mia.getCredits() + ", Luis: " + luis.getCredits());
    }
}