/*
 * 
 * 
 */
package myconcrete;

/**
 *
 * @author Steve
 */
public class Employee {

    private double grossPay;
    private double fedTax;
    private double netPay;
    private String empName;
    
    public Employee() {
        grossPay = 0;
        fedTax = 0;
        netPay = 0;
        empName = null;   
    }

    public double getGrossPay() {
        return grossPay;
    }

    public void setGrossPay(double grossPay) {
        this.grossPay = grossPay;
    }

    public double getFedTax() {
        return fedTax;
    }

    public void setFedTax(double fedTax) {
        this.fedTax = fedTax;
    }

    public double getNetPay() {
        return netPay;
    }

    public void setNetPay(double netPay) {
        this.netPay = netPay;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
    
    public void calcFedTax(){
        setFedTax(grossPay * .23);
    }
            
    public void calcNetPay(){
        setNetPay(grossPay-fedTax);
    }
    
    public void printSatement(){
        System.out.println(empName);
        System.out.println("Gross Pay: "+grossPay);
        System.out.println("Fed Taxes: "+fedTax);
        System.out.println("Net Pay: "+ netPay);
    
    
    }
    
    
    
    
    
}
