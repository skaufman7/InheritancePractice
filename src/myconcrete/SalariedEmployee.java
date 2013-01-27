/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myconcrete;

/**
 *
 * @author Steve
 */
public class SalariedEmployee extends Employee{

    private double salary;
    private double salaryRate;
        
    public SalariedEmployee() {
        salary = 0;
        salaryRate = 0;
        
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
    
    
    
    
    
}
