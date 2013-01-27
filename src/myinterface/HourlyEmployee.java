/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myinterface;

/**
 *
 * @author Steve
 */
public class HourlyEmployee implements Employee {

    private double hoursWorked;
    private double hourlyRate;
    private double grossPay;
    private double fedTax;
    private double netPay;
    private String empName;
    
    public HourlyEmployee() {
        
        hoursWorked =0;
        hourlyRate =0;     
        grossPay = 0;
        fedTax = 0;
        netPay = 0;
        empName = null; 
   
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    
    public void calcGrossPay(){
        setGrossPay(hoursWorked*hourlyRate);
        
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
