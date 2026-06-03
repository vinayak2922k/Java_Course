class Phone{
    public void ShowTime(){
        System.out.println("Time is 8 AM");
    }
    public void Message(){
        System.out.println("Hi Vinayak Sharma Have a Good Day");
    }
}

class SmartPhone extends Phone{

    public void music(){
        System.out.println("Playing the music");
    }
    @Override
    public void Message(){
        System.out.println("Hi Vinayak Sharma Welcome to the Microsoft");
    }
}

public class Dynamic_Method_Dispatch {
    public static void main(String[] args){
        //Phone obj = new Phone();    //Allowed
        //SmartPhone obj1 = new SmartPhone();     //Allowed
        //obj.met1();   //Allowed

        Phone obj = new SmartPhone();   //Allowed
        //SmartPhone obj2 = new Phone();   //Not allowed shows the error ---> Phone can not be converted to SmartPhone
        obj.Message();
        //obj.music(); // shows the error cannot find symbol
        obj.ShowTime();
    }
}
