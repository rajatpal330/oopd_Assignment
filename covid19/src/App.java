import java.util.Scanner;
class Vaccine{
    int boost;
    int durability;
    void inject(){

    }
    void effect(){

    }
}
class Virus{
    int life;
    void attack(){

    }
}
 class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the portal");
        System.out.println("Please select a your option:"); 
        System.out.println("1. New User");
        System.out.println("2. Existing Patient");
        System.out.println("3. Exit");
        int n=sc.nextInt();sc.nextLine();
        if(n==1){
            System.out.println("Enter username"); 
            String username=sc.nextLine();
            System.out.println("Enter Aadhar number");
            String aadhar_no=sc.nextLine();
            System.out.println(username+" "+aadhar_no);
            System.out.println("choose youe vaccine");
            System.out.println("1. covishield\n 2. covaxin\n 3.pfizer\n 4.sputnik");
        }
        sc.close();
    }
}
