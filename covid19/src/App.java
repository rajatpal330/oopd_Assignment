import java.util.Scanner;

class Vaccine{
    int boost;
    int durability;
   void inject(Virus vr){}
    int effect(){return 0;}
    void update(int boost,int durability){}
}
class Covishield extends Vaccine{
    Covishield(int boost,int durability){
        this.boost=boost;
        this.durability=durability;
    }
    void update(int boost,int durability){
        this.boost=boost;
        this.durability=durability;
    }
    void inject(Virus vr){
         vr.life-=10;
         System.out.println("Your vaccine is boosted and it reduces the life of the virus by 10");
    }
    int effect(){
        System.out.println("Virus’s action reduced by 10");
        return 10;}
 }
 class Covaxin extends Vaccine{
    Covaxin(int boost,int durability){
        this.boost=boost;
        this.durability=durability;
    }
    void update(int boost,int durability){
        this.boost=boost;
        this.durability=durability;
    }
    void inject(Virus vr){
        vr.life-=5;
        System.out.println("Your vaccine is boosted and it reduces the life of the virus by 5");
    }
    int effect(){
        System.out.println("Virus’s action reduced by 5");
        return 5;}
 }
 class Pfizer extends Vaccine{
    Pfizer(int boost,int durability){
        this.boost=boost;
        this.durability=durability;
    }
    void update(int boost,int durability){
        this.boost=boost;
        this.durability=durability;
    }
    void inject(Virus vr){
        vr.life-=6;
        System.out.println("Your vaccine is boosted and it reduces the life of the virus by 6");
    }
    int effect(){
        System.out.println("Virus’s action reduced by 4");
        return 4;}
 }
 class Sputnik extends Vaccine{
    Sputnik(int boost,int durability){
        this.boost=boost;
        this.durability=durability;
    }
    void update(int boost,int durability){
        this.boost=boost;
        this.durability=durability;
    }
    void inject(Virus vr){
        vr.life-=4;
        System.out.println("Your vaccine is boosted and it reduces the life of the virus by 4");
    }
    int effect(){
        System.out.println("Virus’s action reduced by 8");
        return 8;}
 }
class Virus{
    int life;
    void  attack(Vaccine V,int eff){}
}
class Alpha extends Virus{
    int pre;
    Alpha(int life){
        this.life=life;
    }
    void attack(Vaccine v,int eff){
       System.out.println("VIRUS’s ACTION !");
       int min=0,max=(life/4); 
       int b=(int)(Math.random()*(max-min+1)+min);
       System.out.println("life "+life+" b "+b);
       if(pre>0){
        b=b-pre;
        if(b<0)
        b=0;
        }
        v.durability-=b;
        if(v.durability<0)
       v.durability=0;
       System.out.println("Virus reduces the vaccine’s DURABILITY by "+b);
       pre=eff;
    }
}
class Beta extends Virus{
    int pre;
    Beta(int life){
        this.life=life;
    }
  void attack(Vaccine v,int eff){
       System.out.println("VIRUS’s ACTION !");
       int min=0,max=(life/4); 
       int b=(int)Math.random()*(max-min+1)+min;
       if(pre>0){
        b=b-pre;
        if(b<0)
        b=0;
        }
       v.durability-=b;
       if(v.durability<0)
       v.durability=0;
       System.out.println("Virus reduces the vaccine’s DURABILITY by "+b);
       pre=eff;
    }
}
class Gama extends Virus{
    int pre;
    Gama(int life){
        this.life=life;
    }
    void attack(Vaccine v,int eff){
       System.out.println("VIRUS’s ACTION !");
       int min=0,max=(life/3); 
       int b=(int)Math.random()*(max-min+1)+min;
       if(pre>0){
        b=b-pre;
        if(b<0)
        b=0;
        }
       v.durability-=b;
       if(v.durability<0)
       v.durability=0;
       System.out.println("Virus reduces the vaccine’s DURABILITY by "+b);
       pre=eff;
    }
}
class Sigma extends Virus{
    int pre;
    Sigma(int life){
        this.life=life;
    }
    void attack(Vaccine v,int eff){
       System.out.println("VIRUS’s ACTION !");
       int min=0,max=(life/2); 
       int b=(int)Math.random()*(max-min+1)+min;
       if(pre>0){
       b=b-pre;
       if(b<0)
       b=0;
       }
       v.durability-=b;
       if(v.durability<0)
       v.durability=0;
       System.out.println("Virus reduces the vaccine’s DURABILITY by "+b);
       pre=eff;
    }
}

 class App {
     static String username;
     static String aadhar_no;
     static int check;
     public App(){
         username="not assigned";
         aadhar_no="not assigned";
     }
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        new App();
        check=0;
        while(true){
        System.out.println("Welcome to the portal");
        System.out.println("Please select a your option:"); 
        System.out.println("1. New User");
        System.out.println("2. Existing Patient");
        System.out.println("3. Exit");
        int n=sc.nextInt();sc.nextLine();
        Vaccine v=new Vaccine();
        if(n==1){
           //System.out.println(v.boost+" "+v.durability);
            System.out.println("Enter username"); 
            username=sc.nextLine();
            System.out.println("Enter Aadhar number");
            aadhar_no=sc.nextLine();
            //System.out.println(username+" "+aadhar_no);
            System.out.println("choose youe vaccine");
            System.out.println("1. covishield\n 2. covaxin\n 3.pfizer\n 4.sputnik");
            String vac[]={"covishield","covaxin","pfizer","sputnik"};
            check=sc.nextInt();sc.nextLine();
            System.out.println("check-"+check);
            System.out.println("patient has been registered");
            System.out.println("Username - "+username);
            System.out.println("Aadhar Number - "+aadhar_no);
            System.out.println("vaccine opted - "+vac[check-1]);
        }
        if(n==2){
            System.out.println("check-"+check);
            switch(check){
                case 1:
                 v=new Covishield(10,100);
                break;
                case 2:
                 v=new Covaxin(10,100);
                break;
                case 3:
                 v=new Pfizer(10,100);
                break;
                case 4:
                 v=new Sputnik(10,100);
                break;
                
            }
            System.out.println("Enter Registered Username:");
            String username_temp=sc.nextLine();
            System.out.println("verifying");
            if(username.equals(username_temp)){
                System.out.println("Patient Found !");
                System.out.println("Welcome"+username);
                System.out.println("You’re being tested for the 1st wave for the alpha variant of the virus :");
                Virus vr1=new Alpha(100);
                v.update(10,100);
                System.out.println("Vaccine’s BOOST : "+v.boost+" | Vaccine’s DURABILITY : "+v.durability+" | Virus’s LIFE : "+vr1.life+" | Virus Variant : ALPHA");
                while(true){
                    System.out.println("Please select an action:\n1. INJECT\n2. EFFECT\n3. Exit\n"); 
                    int x1=sc.nextInt();sc.nextLine(); 
                    if(x1==1){
                        v.inject(vr1);
                        System.out.println("Vaccine’s DURABILITY : "+v.durability+" | Virus’s LIFE : "+vr1.life); 
                        if(vr1.life==0){
                            System.out.println("Virus Defeated !");   
                            System.out.println("Vaccine proves to be effective during the first wave!!!");
                            System.out.println("Moving on to the next wave.");
                            Virus vr2=new Beta(100);
                            v.update(10,150);
                            System.out.println("Vaccine’s BOOST : "+v.boost+" | Vaccine’s DURABILITY : "+v.durability+" | Virus’s LIFE : "+vr2.life+" | Virus Variant : Beta");
                            while(true){
                                System.out.println("Please select an action:\n1. INJECT\n2. EFFECT\n3. Exit\n"); 
                                int x2=sc.nextInt();sc.nextLine(); 
                                if(x2==1){
                                    v.inject(vr2);
                                    System.out.println("Vaccine’s DURABILITY : "+v.durability+" | Virus’s LIFE : "+vr2.life); 
                                    if(vr2.life==0){
                                        System.out.println("Virus Defeated !");   
                                        System.out.println("Vaccine proves to be effective during the second wave!!!");
                                        System.out.println("Moving on to the next wave.");
                                        Virus vr3=new Gama(200);
                                        v.update(10,200);
                                        System.out.println("Vaccine’s BOOST : "+v.boost+" | Vaccine’s DURABILITY : "+v.durability+" | Virus’s LIFE : "+vr3.life+" | Virus Variant : Gamma");
                                        while(true){
                                            System.out.println("Please select an action:\n1. INJECT\n2. EFFECT\n3. Exit\n"); 
                                            int x3=sc.nextInt();sc.nextLine(); 
                                            if(x3==1){
                                                v.inject(vr3);
                                                System.out.println("Vaccine’s DURABILITY : "+v.durability+" | Virus’s LIFE : "+vr3.life); 
                                                if(vr3.life==0){
                                                    System.out.println("Virus Defeated !");   
                                                    System.out.println("Vaccine proves to be effective during the third wave!!!");
                                                    System.out.println("Moving on to the next wave.");
                                                    Virus vr4=new Sigma(250);
                                                    v.update(10,250);
                                                    System.out.println("Vaccine’s BOOST : "+v.boost+" | Vaccine’s DURABILITY : "+v.durability+" | Virus’s LIFE : "+vr4.life+" | Virus Variant : Sigma");
                                                    while(true){
                                                        System.out.println("Please select an action:\n1. INJECT\n2. EFFECT\n3. Exit\n"); 
                                                        int x4=sc.nextInt();sc.nextLine(); 
                                                        if(x4==1){
                                                            v.inject(vr4);
                                                            System.out.println("Vaccine’s DURABILITY : "+v.durability+" | Virus’s LIFE : "+vr4.life); 
                                                            if(vr4.life==0){
                                                                System.out.println("Virus Defeated !");   
                                                                System.out.println("Vaccine proves to be effective during the fourth wave!!!");
                                                                System.out.println("Congratulations, your vaccine has overpowered all the variants of the virus and hence\nhas proved to be effective in all the waves. Great Job!\nThanks for your participation. Now let’s get Vaccinated !!!");
                                                                System.exit(0);
                                                            }
                                                            vr4.attack(v,0);
                                                            System.out.println("Vaccine’s DURABILITY : "+v.durability+" | Virus’s LIFE : "+vr4.life); 
                                                            if(v.durability==0){
                                                                System.out.println("Oops! Your vaccine fails to affect the Sigma Variant.\nHowever, The vaccine helps you fight against several attacks of the virus and proves to\nbe useful. This shows how important the vaccine is in the fight against COVID-19.\nThanks for your participation. Now Let’s get Vaccinated !!!");  
                                                                System.exit(0);
                                                            }
                                                        }
                                                        if(x4==2){
                                                            int eff=v.effect();
                                                            System.out.println("Vaccine’s DURABILITY : "+v.durability+" | Virus’s LIFE : "+vr4.life);
                                                            vr4.attack(v,eff);
                                                            System.out.println("Vaccine’s DURABILITY : "+v.durability+" | Virus’s LIFE : "+vr4.life);
                                                            if(v.durability==0){
                                                                System.out.println("Oops! Your vaccine fails to affect the Sigma Variant.\nHowever, The vaccine helps you fight against several attacks of the virus and proves to\nbe useful. This shows how important the vaccine is in the fight against COVID-19.\nThanks for your participation. Now Let’s get Vaccinated !!!");  
                                                                System.exit(0);
                                                            }
                                                        }
                                                        if(x4==3){
                                                            System.out.println("Exited at wave 4!");
                                                            System.out.println("Thanks for your participation. Let’s get Vaccinated !!!");
                                                            System.exit(0);
                                                        }
                                                    }
                                                }
                                                vr3.attack(v,0);
                                                System.out.println("Vaccine’s DURABILITY : "+v.durability+" | Virus’s LIFE : "+vr3.life); 
                                                if(v.durability==0){
                                                    System.out.println("Oops! Your vaccine fails to affect the Gama Variant.\nHowever, The vaccine helps you fight against several attacks of the virus and proves to\nbe useful. This shows how important the vaccine is in the fight against COVID-19.\nThanks for your participation. Now Let’s get Vaccinated !!!");  
                                                    System.exit(0);
                                                }
                                            }
                                            if(x3==2){
                                                int eff=v.effect();
                                                System.out.println("Vaccine’s DURABILITY : "+v.durability+" | Virus’s LIFE : "+vr3.life);
                                                vr3.attack(v,eff);
                                                System.out.println("Vaccine’s DURABILITY : "+v.durability+" | Virus’s LIFE : "+vr3.life);
                                                if(v.durability==0){
                                                    System.out.println("Oops! Your vaccine fails to affect the Gama Variant.\nHowever, The vaccine helps you fight against several attacks of the virus and proves to\nbe useful. This shows how important the vaccine is in the fight against COVID-19.\nThanks for your participation. Now Let’s get Vaccinated !!!");  
                                                    System.exit(0);
                                                }
                                            }
                                            if(x3==3){
                                                System.out.println("Exited at wave 3!");
                                                System.out.println("Thanks for your participation. Let’s get Vaccinated !!!");
                                                System.exit(0);
                                            }
                                        }
                        
                                    }
                                    vr2.attack(v,0);
                                    System.out.println("Vaccine’s DURABILITY : "+v.durability+" | Virus’s LIFE : "+vr2.life); 
                                    if(v.durability==0){
                                        System.out.println("Oops! Your vaccine fails to affect the Beta Variant.\nHowever, The vaccine helps you fight against several attacks of the virus and proves to\nbe useful. This shows how important the vaccine is in the fight against COVID-19.\nThanks for your participation. Now Let’s get Vaccinated !!!");  
                                        System.exit(0);
                                    }
                                }
                                if(x2==2){
                                    int eff=v.effect();
                                    System.out.println("Vaccine’s DURABILITY : "+v.durability+" | Virus’s LIFE : "+vr2.life);
                                    vr2.attack(v,eff);
                                    System.out.println("Vaccine’s DURABILITY : "+v.durability+" | Virus’s LIFE : "+vr2.life);
                                    if(v.durability==0){
                                        System.out.println("Oops! Your vaccine fails to affect the Beta Variant.\nHowever, The vaccine helps you fight against several attacks of the virus and proves to\nbe useful. This shows how important the vaccine is in the fight against COVID-19.\nThanks for your participation. Now Let’s get Vaccinated !!!");  
                                        System.exit(0);
                                    }
                                }
                                if(x2==3){
                                    System.out.println("Exited at wave 2!");
                                    System.out.println("Thanks for your participation. Let’s get Vaccinated !!!");
                                    System.exit(0);
                                }
                            }
                        }
                        vr1.attack(v,0);
                        System.out.println("Vaccine’s DURABILITY : "+v.durability+" | Virus’s LIFE : "+vr1.life); 
                        if(v.durability==0){
                            System.out.println("Oops! Your vaccine fails to affect the Alpha Variant.\nHowever, The vaccine helps you fight against several attacks of the virus and proves to\nbe useful. This shows how important the vaccine is in the fight against COVID-19.\nThanks for your participation. Now Let’s get Vaccinated !!!");  
                            System.exit(0);
                        }
                    }
                    if(x1==2){
                        int eff=v.effect();
                        System.out.println("Vaccine’s DURABILITY : "+v.durability+" | Virus’s LIFE : "+vr1.life);
                        vr1.attack(v,eff);
                        System.out.println("Vaccine’s DURABILITY : "+v.durability+" | Virus’s LIFE : "+vr1.life);
                        if(v.durability==0){
                            System.out.println("Oops! Your vaccine fails to affect the Alpha Variant.\nHowever, The vaccine helps you fight against several attacks of the virus and proves to\nbe useful. This shows how important the vaccine is in the fight against COVID-19.\nThanks for your participation. Now Let’s get Vaccinated !!!");  
                            System.exit(0);
                        }
                    }
                    if(x1==3){
                        System.out.println("Exited at wave 1!");
                        System.out.println("Thanks for your participation. Let’s get Vaccinated !!!");
                        System.exit(0);
                    }
                }
               
                
            }
            else{
                System.out.println("Patient not found !!! If you haven’t registered yet then please register first.");  
            }
        }
        if(n==3){
            break;
        }
     }
        sc.close();
    }
}
