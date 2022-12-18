package example1andClassEmployee;
//1. Создадим class Employee c указанными полями, геттеры и сеттеры, конструктор с параметрами и по умолчанию
//2. Переопределим метод toString
//3. Создадим метод DisplayDetails, который возвращает значения полей класса
//4. Создадим метод, принимающий в кач аргумента экземпляр Employee и возвращающий строку с использ методов get...
//5. Создайте три экземпляра класса Employee и поиграйте с методами
//1.
public class Employee {
    private String employeeName;
    private String employeeAddress;
    private int annualSalary;

    public Employee(String employeeName, String employeeAddress, int annualSalary) {
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.annualSalary = annualSalary;
    }

    public Employee() {
        super();
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public int getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(int annualSalary) {
        this.annualSalary = annualSalary;
    }

//2.
    @Override
    public String toString() {
        return String.format("employeeName: %s, employeeAddress: %s, salary: %d",
                this.employeeName,this.employeeAddress,this.annualSalary);
    }

//3.
    public String DisplayDetails(){
        return this.employeeName+" "+this.employeeAddress+" "+this.annualSalary;
    }
//4.
    public String askMeeting(Employee e){
        return "Дорогой "+e.getEmployeeName()+" буду рад встрече по адресу "+e.getEmployeeAddress();
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Val","Lenin Street11",20000);
        System.out.println(employee1.DisplayDetails());
        System.out.println(employee1.askMeeting(employee1));
//5.
        Employee o1 = new Employee("Val","Svetlaya 15",15000);
        Employee o2 = new Employee("Artyom","Big Street 26",27000);
        Employee o3 = new Employee("Gleb","Queen Street 45", 65000);
        System.out.println(o1.annualSalary+o2.annualSalary+o3.annualSalary);
        System.out.println(o3.askMeeting(o3));

    }
}
