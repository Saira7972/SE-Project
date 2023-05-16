import java.util.Scanner;

//class 1
class Class1 {
    public void display(){
        Scanner myObj=new Scanner(System.in);
        String NAME;
        //Enter your name and press enter
        System.out.println("YOUR NAME:");
        NAME =myObj.nextLine();
        System.out.println("YOUR NAME is :" +NAME);

    }
}