public class Getters_Setters {
    static class Employee{
        private int ID;
        private String name;

        public void setName(String n){
            name = n;
        }
        public void setId(int m){
            ID =m;
        }
        public String getName(){
            return name;
        }
        public int getId(){
            return ID;
        }
    }
    public static void main(String[] args){
        Employee emp = new Employee();
        emp.setName("Vinayak Sharma");
        emp.setId(2922);
        System.out.println("The Id of Employee is: " + emp.getId());
        System.out.println("The name of the employee is: " + emp.getName());
    }
}
