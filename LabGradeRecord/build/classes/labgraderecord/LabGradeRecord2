/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labgraderecord;

/**
 *
 * @author Escalante_CPE113
 */
public class LabGradeRecord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LabGradeRecord2 ana = new LabGradeRecord2("Ana", 80, 90);
        System.out.println(ana.getFinalGrade() + "; " + (ana.isPassing() ? "passing" : "not passing"));

        LabGradeRecord2 ben = new LabGradeRecord2("Ben", 101, 85);
        System.out.println(ben.getFinalGrade() + "; " + (ben.isPassing() ? "passing" : "not passing"));

        boolean step3 = ana.updateScores(95, 101);
        System.out.println(step3 + "; grade stays " + ana.getFinalGrade());

        boolean step4 = ana.updateScores(74, 75);
        System.out.println(step4 + "; " + ana.getFinalGrade() + "; " + (ana.isPassing() ? "passing" : "not passing"));

        boolean step5 = ana.updateScores(75, 75);
        System.out.println(step5 + "; " + ana.getFinalGrade() + "; " + (ana.isPassing() ? "passing" : "not passing"));

        System.out.println("Still " + ben.getFinalGrade() + "; " + (ben.isPassing() ? "passing" : "not passing"));
    }
}
//kung mag assign ka first score before the checking the second score,a valid Quizsroce kay
//iparis nimo sa invalaid na Labsroce would overwrite the student old quiz score and leave the object
//in a partially update Validating both inputs up front ensures the update is atomic—either both valid scores are saved together or neither field changes.