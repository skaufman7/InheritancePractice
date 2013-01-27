/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myconcrete;

/**
 *
 * @author Steve
 */
public class HourlyEmployee extends Employee {

    private double hoursWorked;
    private double hourlyRate;
    private double totalPay;
    
    public HourlyEmployee() {
        
        hoursWorked =0;
        hourlyRate =0;     
        totalPay = 0;
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
    
    public void calcTotalPay(){
        setTotalPay(hoursWorked*hourlyRate);
    }

    public double getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(double totalPay) {
        this.totalPay = totalPay;
    }
            
    
    
    
    
}
