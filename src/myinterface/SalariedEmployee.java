/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myinterface;

/**
 *
 * @author Steve
 */
public class SalariedEmployee implements Employee{

    private double salary;
    private double salaryRate;
    private double grossPay;
    private double fedTax;
    private double netPay;
    private String empName;
    
    public SalariedEmployee() {
        salary = 0;
        salaryRate = 0;
        grossPay = 0;
        fedTax = 0;
        netPay = 0;
        empName = null;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalaryRate() {
        return salaryRate;
    }

    public void setSalaryRate(double salaryRate) {
        this.salaryRate = salaryRate;
    }
    
    public void calcSalaryRate(){
        //salary is calculated assuming 2 pay periods per month
        
        setSalaryRate(salary/24);
        setGrossPay(salaryRate);
    }

    
    
    @Override
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public void setGrossPay(double grossPay) {
        this.grossPay = grossPay;
    }

    @Override
    public void calcFedTax() {
        fedTax = grossPay * .23;
    }

    @Override
    public void calcNetPay() {
        netPay = grossPay - fedTax;
    }

  public void printSatement(){
        System.out.println(empName);
        System.out.println("Gross Pay: "+grossPay);
        System.out.println("Fed Taxes: "+fedTax);
        System.out.println("Net Pay: "+ netPay);
  }
            
    
    
    
    
}
