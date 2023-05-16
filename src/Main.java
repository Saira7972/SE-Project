import java.util.Scanner;


//Main Class
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Print Name 1:\n Print Father Name 2: \n Print Data Of Birth3: \n Print Address 4:");
        int ClassNumber=sc.nextInt();
        switch(ClassNumber){
            case 1:
                Class1 class1 = new Class1();
                class1.display();
                break;
            case 2:
                Class2 class2 = new Class2();
                class2.display();
                break;
            case 3:
                Class3 class3 = new Class3();
                class3.display();
                break;
            case 4:
                Class4 class4 = new Class4();
                class4.display();
                break;
            default:
                System.out.println("Invalid class number.Please try again:");
        }
        sc.close();

    }
}
