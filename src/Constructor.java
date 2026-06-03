public class Constructor {
    static class Employee{
        private int ID;
        private String name;

        public  Employee(){
            int ID = 15;
            String name = "Vinayak Sharma";
        }

        public  Employee(String name){
            int ID = 15;
            String n = name ;
        }

        public  Employee(String name , int ID){
            int id = ID;
            String n = name;
        }

        public void setName(String n){
            ID = 2;
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
        Employee emp = new Employee("Vinayak Sharma",20);
        // emp.setName("Vinayak Sharma");
        //emp.setId(2922);
        System.out.println("The Id of Employee is: " + emp.getId());
        System.out.println("The name of the employee is: " + emp.getName());
        // System.out.println(emp);
    }
}
