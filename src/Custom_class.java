public class Custom_class {
    static class Employee{
        int id;
        String name;
        public void Details(){
            System.out.println("The Id of the employee is: " + id);
            System.out.println("The name of the employee is: " + name);
        }
        static int Sal(int salary){
            System.out.println("The salary of" + " is " + salary);
            return salary;
        }
    }


    public static void main(String[] args) {
    Employee Vinayak = new Employee();
    Employee Bhavesh = new Employee();
    Vinayak.id = 01;
    Vinayak.name ="Vinayak Sharma";

    Bhavesh.id = 02;
    Bhavesh.name = "Bhavesh Adwani";

    Vinayak.Details();
    Bhavesh.Details();
    Vinayak.Sal(5);
    Bhavesh.Sal(5);
    }
}
