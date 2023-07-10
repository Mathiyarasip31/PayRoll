class SalariedEmployee
{
    String name;
    double salary;
    void calculatePay(double salary,int days)
    {
        salary=salary*days;
        System.out.println("Salaried employee "+salary);
    }
    double hourlyRate;
    double hoursWorked;
    void calculatePay(double hourlyRate,double hoursWorked)
    {
        double salary=hourlyRate*hoursWorked;
        System.out.println("Hourly worker "+salary);
    }
}
class PayRoll {
    public static void main(String[] args) {
            SalariedEmployee salariedEmployee=new SalariedEmployee();
            salariedEmployee.calculatePay(3000,30);
            salariedEmployee.calculatePay(60.00,45);

    }
}
