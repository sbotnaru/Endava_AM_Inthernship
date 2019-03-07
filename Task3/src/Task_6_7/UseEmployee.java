package Task_6_7;

public class UseEmployee {
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.hours=8;
        System.out.println("Employee"+"\nTarif per hour: "+employee.getTariffPerHour()+"\nSalary: "+employee.getSalary());
        Manager manager=new Manager();
        manager.hours=8;
        System.out.println("Manager"+"\nTarif per hour: "+manager.getTariffPerHour()+"\nSalary: "+manager.getSalary());
    }
}
