/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myabstract;

/**
 *
 * @author Steve
 */
public class SalaryPlusBonusEmployee extends SalariedEmployee {
    
    private double bonusAmt;

    public SalaryPlusBonusEmployee() {
        bonusAmt = 0;
    }

    public double getBonusAmt() {
        return bonusAmt;
    }

    public void setBonusAmt(double bonusAmt) {
        this.bonusAmt = bonusAmt;
    }

    @Override
    public void calcSalaryRate(){
        //overrides the method in SalariedEmployee to allow the addidtion of 
        //bonus pay
        
        setSalaryRate(getSalary()/24);
        setGrossPay(getSalaryRate()+bonusAmt);
    }
    
    
    
    
}
