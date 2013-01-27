/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myconcrete;

/**
 *
 * @author Steve
 */
public class Practice {
    
       public static void main(String[] args) {
           
           // create some test data
           
           HourlyEmployee jim = new HourlyEmployee();
           SalariedEmployee stan = new SalariedEmployee();
           SalaryPlusBonusEmployee jane = new SalaryPlusBonusEmployee();
           
           jim.setEmpName("Jim George");
           jim.setHourlyRate(23.24);
           jim.setHoursWorked(80);
           jim.calcGrossPay();
           jim.calcFedTax();
           jim.calcNetPay();
           
           stan.setEmpName("Stan James");
           stan.setSalary(82000);
           stan.calcSalaryRate();
           stan.calcFedTax();
           stan.calcNetPay();
           
           jane.setEmpName("Jane Stevens");
           jane.setSalary(104500);
           jane.setBonusAmt(300);
           jane.calcSalaryRate();
           jane.calcFedTax();
           jane.calcNetPay();
           
           jim.printSatement();
           System.out.println("");
           stan.printSatement();
           System.out.println("");
           jane.printSatement();
           
           
       }
    
    
}
