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
    
    
    public HourlyEmployee() {
        
        hoursWorked =0;
        hourlyRate =0;     
       
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

 
            
 
    
    
    
}
