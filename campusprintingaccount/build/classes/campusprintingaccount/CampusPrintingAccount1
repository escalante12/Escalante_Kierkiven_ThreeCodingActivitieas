/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campusprintingaccount;

/**
 *
 * @author Escalante_CPE113
 */
public class CampusPrintingAccount1 {
    private String studentName;
    private int credits;

    public CampusPrintingAccount1 (String studentName, int credits) {
        this.studentName = studentName;
        if (credits < 0) {
            this.credits = 0;
        } else {
            this.credits = credits;
        }
    }

    public boolean addCredits(int amount) {
        if (amount > 0) {
            this.credits += amount;
            return true;
        }
        return false;
    }

    public boolean printPages(int pages) {
        if (pages > 0 && this.credits >= pages) {
            this.credits -= pages;
            return true;
        }
        return false;
    }

    public int getCredits() {
        return this.credits;
    }

    public String getStudentName() {
        return this.studentName;
    }
}

