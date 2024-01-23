import java.util.Scanner;
import java.util.Random;
abstract class Payments
{
	 
	 abstract void onlinePayment();
	 
}

class CitySelector extends Payments
{
     static final int MAX_USERS = 10;
     static String[] usernames = new String[MAX_USERS];
     static String[] passwords = new String[MAX_USERS];
     static int lcount=0;
     static int scount=0;
     public static String def = "\u001B[0m";
	public static String magneta = "\u001B[35m";
	public static String green = "\u001B[32m";
	public static String yellow = "\u001B[33m";
	public static String red = "\u001B[31m";
	public static String skblue = "\u001B[36m";
	public static String blink = "\u001B[5m";
	public static String blue = "\u001B[34m";
     static int userCount = 0;
     static  String e,t,b,c; 
        public static void main(String[] args) {
        Payments obj=new CitySelector();
        Scanner sc = new Scanner(System.in);
	 System.out.println();
	   System.out.print(blink);
		System.out.print(blue);
		System.out.println("                     *************************************************************************************");
		System.out.println("                     ***************************** "+def+yellow+"_WELCOME TO CITY GUIDE_"+def+blue+blink+" *******************************");
		System.out.println("                     *************************************************************************************");
		System.out.print(def);
	    System.out.println();
        while (true) {
            System.out.print(magneta);  
	    System.out.println("                                         If you are New user please SignUp");
            System.out.print(def);
            System.out.print(skblue);
            System.out.println("                                         1. Sign Up");
            System.out.println("                                         2. Login");
            System.out.println("                                         3. Exit");
            System.out.print(def);
	    System.out.print(yellow);
            System.out.print("                                           Choose an option: ");
	  
	   System.out.print(def);
            String choice = sc.next();
            sc.nextLine(); 
            switch (choice) {
                case "1":
		    scount++;
                    signUp(sc);
		    login(sc);
                    break;
                case "2":
		    lcount++;
		    if(lcount==1 && scount==0)
		    {
                     System.out.print(red);
		     System.out.println("please signup first before you login.......");
                     System.out.print(def);
		   }
		    break;
                case "3":
                    System.out.print(red);
                    System.out.println("Exiting.....");
		     System.out.print(def);
                    System.exit(0);
                default:
                    System.out.print(red);
                    System.out.println("Invalid option. Please try again.");
                    System.out.print(def);
		   
            }
	
        }
    }

     static void signUp(Scanner sc) {
        System.out.print("Enter your username: ");
        String username = sc.nextLine();
            System.out.print("Enter your password: ");
            String password = sc.nextLine();
            usernames[userCount] = username;
            passwords[userCount] = password;
            userCount++;
	    System.out.print(green); 
            System.out.println("                                       Sign up successful!");
	    System.out.print(def);  
	    System.out.print(magneta);
	    System.out.println("                                       Login with your credentials.....");
	    System.out.print(def);
      }
     static void login(Scanner sc) {
        System.out.print("Enter your username: ");
        String username = sc.nextLine();

        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        int userIndex = findIndex(username);

        if (userIndex != -1 && passwords[userIndex].equals(password)) {
	     System.out.print(green);
            System.out.println("                                        Login successful!");
            System.out.print(def);
        } else {
	     System.out.print(red);
            System.out.println("Invalid username or password. Please try again.");
            System.out.print(def);
	    login(sc);
        }
	display();
	
    }
     static int findIndex(String username) {
        for (int i = 0; i < userCount; i++) {
            if (usernames[i].equals(username)) {
                return i;
            }
        }
        return -1;
    }
public static void display(){
        System.out.print(blue);

        System.out.println("						Select a city:");
	System.out.print(def);
	System.out.print(yellow);
	System.out.println("								1.Vizag");	
	System.out.println("								2.Hyderabad");
	System.out.println("								3.Delhi");
	System.out.println("								4.Paris");
	System.out.println("								5.exist");
	System.out.print(def);
	city();
	} 
	static void city(){
        System.out.println("Enter the number of the city: ");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();
        switch(choice)
	{
	  case "1":
		    System.out.print(yellow);
	            System.out.println("    				You Selected VIZAG");
		    System.out.print(def);
		    System.out.print(skblue);
                    System.out.println("						1.Tourist Places Near Me");
		    System.out.println("						2.Restraurants near me"); 
		    System.out.println("						3.Hotels near me");
		    System.out.println("						4.Shopping Malls Near me");
		    System.out.println("						5.Exit");
		    System.out.print(def);
                    Scanner sc = new Scanner(System.in);
                    System.out.println("select any one of the above to know the details.....");
                    c=sc.next();
                    String You_SelectedPlace="";
                      switch(c)
                      {
                       case "1":
			       You_SelectedPlace=": Tourist Places Near Me:";
			       System.out.print(magneta);
                               System.out.println("						1.RK beach------------------>5km");
			       System.out.println("						2.kailsagiri----------------->8km");
			       System.out.println("						3.Zoo park------------------>10km");
			       System.out.println("						4.CMR Central----------------->2km");
			       System.out.print(def);
			       System.out.println();
                               display();
                               break;
                       case "2":
			        You_SelectedPlace=": Restraurants near me:";
				 System.out.print(magneta);
                                 System.out.println("						1.Muntaj Restaurant-------------------->1km");
			         System.out.println("						2.Barbeque nation------------------>850mts");
				 System.out.println("						3.Srikanya Restaurant------------------>2.5km");
			         System.out.println("						4.Paradise------------------>3km");				 System.out.print(def);
				 System.out.println();
				display();
                                 break;
                       case "3":
			      You_SelectedPlace=": Hotels near me:";
			     System.out.print(magneta);
                             System.out.println("     						1.The GateWay Hotel------------------>3km");
			     System.out.println("						2.Treebo Trend MVP Grand------------------>5km");
			     System.out.println("						3.Dolphin Hotel------------------>5.5km");
			     System.out.println("						4.Fortune Inn------------------>3.8km");
			     System.out.println("						5.Exit");
			     System.out.print(def);
			     System.out.println("Select any one Hotel to book the rooms");
                              Payments obj=new CitySelector();
			     String choose=sc.next();
				switch(choose)
				{
					case "1":
							System.out.println("You Selected The GateWay Hotel");
							obj.onlinePayment();
							break;
					case "2":
							System.out.println("You Selected Treebo Trend MVP Grand");
							obj.onlinePayment();
							break;
					case "3":
							System.out.println("You Selected Dolphin Hotel");
							obj.onlinePayment();
					                 break;
					case "4":		
							System.out.println("You Selected Fortune Inn");
							obj.onlinePayment();
					                 break;
					case "5":
							System.out.println("Exit");
							System.exit(0);
					default:
							System.out.println("Invalid selection ..please select valid number");
				}
                                System.out.println();
				display();
                             System.out.println();
                               break;
                        case "4":
			       You_SelectedPlace=": Shopping Malls Near me:";
			       System.out.print(magneta);
                               System.out.println("						1.CMR shopping Mall------------------>4km");
			       System.out.println("						2.Lucky Shopping Mall------------------>8km");
			       System.out.println("						3.South India Shopping Mall----------------->6km");
			       System.out.println("						4.jk Shopping Mall----------------->3km");
			       System.out.print(def);
                               System.out.println();
				display();
                               break;
			case "5":
				System.out.print(blink);
				System.out.println(red +"					        **************_exit_*****************"+def);
				System.out.println(green+"					______________THANK YOU , VISIT AGAIN____________________"+def);
				System.exit(0);
			default:
				System.out.print(blink);
		                System.out.print(red);
				System.out.println("					invalid choice ...try again.....");
				System.out.print(def);
				display();
				
                              }
                          
                     
	       	     break;
	 case "2":
	             System.out.print(skblue);
                     System.out.println("    				     You Selected HYDERABAD");
		    System.out.print(def);
		    System.out.print(yellow);
                    System.out.println("						1.Tourist Places Near Me");
		    System.out.println("						2.Restraurants near me"); 
		    System.out.println("						3.Hotels near me");
		    System.out.println("						4.Shopping Malls Near me");
		    System.out.println("						5.Exit");
		    System.out.print(def);
		    
                    Scanner ac = new Scanner(System.in);
                    System.out.println("select any one of the above to know the details.....");
                    e=ac.next();
                      switch(e)
                      {
                       case "1":
			       You_SelectedPlace=": Tourist Places Near Me:";
    			       System.out.print(skblue);
                               System.out.println("					1.Charminar------------------>7km");
				System.out.println("					2.Golconda Fort------------------>9km");
				System.out.println("					3.NTR Garden------------------>6.5km");
				System.out.println("					4.Zoo Park------------------>10km");
			       System.out.print(def);
				System.out.println();
				display();
                               break;
                       case "2":
				You_SelectedPlace=": Restraurants near me:";
			       System.out.print(skblue);
                               System.out.println("					1.Gismat------------------>3km");
			       System.out.println("					2.Em Babu Thinnara------------------->780mts");
				System.out.println("					3.Kritunga------------------>5km");
			       System.out.println("					4.Jail Mandiii------------------>1km");
				System.out.print(def);
				System.out.println();
				display();
                               break;
                       case "3":
				You_SelectedPlace=": Hotesls near me:";
			       System.out.print(skblue);
                                System.out.println("						1.Taj Krishna------------------>3km");
				System.out.println("						2.Taj Banjara------------------>4km");
				System.out.println("						3.Lemon Tree------------------>5km");
				System.out.println("						4.Royalton------------------>4km");
				System.out.println("						5.Exit");
				System.out.print(def);
				System.out.println("Select any one Hotel to book the rooms");
				Payments obj=new CitySelector();
				String choose=ac.next();
				switch(choose)
				{
					case "1":
							System.out.println("You Selected Taj Krishna");
							obj.onlinePayment();
							break;
					case "2":
							System.out.println("You Selected Taj Banjara");
							obj.onlinePayment();
							break;
					case "3":
							System.out.println("You Selected Lemon Tree");
							obj.onlinePayment();
					                 break;
					case "4":		
							System.out.println("You Selected Royalton");
							obj.onlinePayment();
					                 break;
					case "5":
							System.out.println("Exit");
							System.exit(0);
					default:
							System.out.println("Invalid selection ..please select valid number");
				}
                                System.out.println();
				display();
                               break;
                        case "4":
				You_SelectedPlace=": Shopping Malls Near me:";
				System.out.print(skblue);
                               System.out.println("						1.CMR Shopping Mall------------------>2km");
				System.out.println("						2.Trends Shopping Mall------------------>1.8km");
				System.out.println("						3.Chennai Shopping Mall------------------>3km");
				System.out.println("						4.KLM Shopping Mall------------------>6km");
				System.out.print(def);
				System.out.println();
				display();
                               break;
			case "5":
				System.out.print(blink);
				System.out.println(red+"						 **************_exit_*****************"+def);
				System.out.println(green+"					______________THANK YOU , VISIT AGAIN____________________"+def);
				System.exit(0);
			default:
				System.out.print(blink);
				System.out.print(red);
				System.out.println("					invalid choice ...try again.....");
				System.out.print(def);
				display();
                              }
                          
	       	     break;
  	case "3":
		    System.out.print(magneta);
		     System.out.println("    				      You Selected DEHLI");
		    System.out.print(def);
		    System.out.print(yellow);
	            System.out.println("						1.Tourist Places Near Me");
		    System.out.println("						2.Restraurants near me"); 
		    System.out.println("						3.Hotels near me");
		    System.out.println("						4.Shopping Malls Near me");
		    System.out.println("						5.Exit");
		    System.out.print(def);
                     Scanner fc = new Scanner(System.in);
                     System.out.println("select any one of the above to know the details.....");
                     t=fc.next();
                      switch(t)
                      {
                       case "1":
			       You_SelectedPlace=": Tourist Places Near Me:";
			       System.out.print(blue);
                               System.out.println("						1.Red Fort------------------>4km");
				System.out.println("						2.Indian Gate------------------>5km");
				System.out.println("						3.Lotus Temple------------------>4.4km");
				System.out.println("						4.Jantar Mantar------------------>8.9km");
				System.out.print(def);
				System.out.println();
				display();
                               break;
                       case "2":
				You_SelectedPlace=": Restraurants near me:";
				System.out.print(blue);
                              System.out.println("						1.Lotus Leaf Resto.------------------>4km");
				System.out.println("						2.Dubai Dining Delhi------------------>3km");
				System.out.println("						3.Little Chef------------------>6km");
				System.out.println("						4.5 Star Restro.------------------>6km");
				System.out.print(def);
				System.out.println();
				display();
                               break;
                       case "3":
				You_SelectedPlace=": Hotesls near me:";
				System.out.print(blue);
                              System.out.println("						1.Lemon Tree------------------>1km");
				System.out.println("						2.Hotel Gold------------------>2km");
				System.out.println("						3.Star Villa------------------>3km");
				System.out.println("						4.City Park------------------>4km");
				System.out.println("                                                5.Exit");
				System.out.print(def);
				System.out.println("Select any one Hotel to book the rooms");
				Payments obj=new CitySelector();
				String choose=fc.next();
				switch(choose)
				{
					case "1":
							System.out.println("You Selected Lemon Tree");
							obj.onlinePayment();
							break;
					case "2":
							System.out.println("You Selected Hotel Gold");
							obj.onlinePayment();
							break;
					case "3":
							System.out.println("You Selected Star Villa");
							obj.onlinePayment();
					                 break;
					case "4":		
							System.out.println("You Selected City Park");
							obj.onlinePayment();
					                 break;
					case "5":
							System.out.println("Exit");
							System.exit(0);
					default:
							System.out.println("Invalid selection ..please select valid number");
				}
                                System.out.println();
				display();
                   
                               break;
                        case "4":
				You_SelectedPlace=": Shopping Malls Near me:";
				System.out.print(blue);
                               System.out.println("						1.Pacific Mall------------------>4km");
				System.out.println("						2.DLF Mall------------------>2km");
				System.out.println("						3.City Square Mall------------------>4km");
				System.out.println("						4.V3S Mall------------------>3km");
				System.out.print(def);
                              	
				System.out.println();
				display();
                               break;
			case "5":
				System.out.print(blink);
				System.out.println(red+"						**************_exit_*****************"+def);
				System.out.println(green+"					______________THANK YOU , VISIT AGAIN____________________"+def);
				System.exit(0);
			default:
				System.out.print(blink);
				System.out.print(red);
				System.out.println("					invalid choice ...try again.....");
				System.out.print(def);
				display();
                              }
                          
	       	     break;
	case "4":
		   System.out.print(skblue);
	            System.out.println("					You Selected PARIS");
		    System.out.print(def);
		    System.out.print(magneta);
                    System.out.println("						1.Tourist Places Near Me");
		    System.out.println("						2.Restraurants near me"); 
		    System.out.println("						3.Hotels near me");
		    System.out.println("						4.Shopping Malls Near me");
		    System.out.println("						5.Exit");
		    System.out.print(def);
                    Scanner gc = new Scanner(System.in);
                     System.out.println("select any one of the above to know the details.....");
                     b=gc.next();
                      switch(b)
                      {
                       case "1":
				You_SelectedPlace=": Tourist Places Near Me:";
				System.out.print(skblue);
                               System.out.println("						1.Eiffel Tower------------------>4km");
				System.out.println("						2.Paris City Vision------------------>2km");
			     System.out.println("						3.Place Des Vosges------------------>7km");
				System.out.println("						4.Moulin Rouge------------------>10km");
				System.out.print(def);
				System.out.println();
				display();
                               break;
                       case "2":
				You_SelectedPlace=": Restraurants near me:";
				System.out.print(skblue);
                                System.out.println("						1.Fanfan------------------>4km");
				System.out.println("						2.To Restaurant Paris------------------>15km");
				System.out.println("						3.LE JU'------------------>9km");
				System.out.println("						4.ASPIC RESTRAUNT------------------>14km");
				System.out.print(def);	
                              
				System.out.println();
				display();
                               break;
                       case "3":
				You_SelectedPlace=": Hotesls near me:";
				System.out.print(skblue);
                              System.out.println("						1.Paris Hotel------------------>4km");
				System.out.println("						2.B&B Hotel------------------>1km");
				System.out.println("						3.Pullman Paris Hotel------------------>2km");
				System.out.println("						4.Hotel Rachel------------------>3km");
				System.out.println("						5.Exit");
				System.out.print(def);
				System.out.println("Select any one Hotel to book the rooms");
				Payments obj=new CitySelector();
				String choose=gc.next();
				switch(choose)
				{
					case "1":
							System.out.println("You Selected Paris Hotel");
							obj.onlinePayment();
							break;
					case "2":
							System.out.println("You Selected B&B Hotel");
							obj.onlinePayment();
							break;
					case "3":
							System.out.println("You Selected Pullman Paris Hotel");
							obj.onlinePayment();
					                 break;
					case "4":		
							System.out.println("You Selected  Hotel Rachel");
							obj.onlinePayment();
					                 break;
					case "5":
							System.out.println("Exit");
							System.exit(0);
					default:
							System.out.println("Invalid selection ..please select valid number");
				}
				display();
                               System.out.println();
                               break;
                        case "4":
				You_SelectedPlace=": Shopping Malls Near me:";
				System.out.print(skblue);
                               System.out.println("                                               1.RoseWood Mall------------------>6km");
				System.out.println("                                              2.Bercy Village------------------>1km");
				System.out.println("                                              3.WestField Forum Mall------------------>4km");
				System.out.println("                                              4.Forum Mall------------------>3km");
				System.out.print(def);
				System.out.println();
				display();
                               break;
			case "5":
				System.out.print(blink);
				System.out.println(red+"                                                    **************_exit_*****************"+def);
				System.out.println(green+"                                       	______________THANK YOU , VISIT AGAIN____________________"+def);
				System.exit(0);
			default:
				System.out.print(blink);
				System.out.print(red);
				System.out.println("					invalid choice ...try again.....");
				System.out.print(def);
				display();
                                break;
                          
			}
			break;
	case "5":
			System.out.print(blink);
			System.out.println(red+"						      **************_exit_*****************"+def);
				System.out.println(green+"					__________________THANK YOU , VISIT AGAIN____________________"+def);
				System.exit(0);
	default:
				System.out.print(blink);
				System.out.print(red);
				System.out.println("					invalid choice ...try again.....");
				System.out.print(def);
				display();
        }
}
public void onlinePayment()
{  
	
	rooms();
	pay();
}
	void rooms()
      {
	Scanner sa=new Scanner(System.in);
	System.out.print(magneta);
	System.out.println("                                                 Enter number of nights: ");
	System.out.print(def);
        int numberOfNights = sa.nextInt();
	double normalRoomPrice = 500.0;
	System.out.print(skblue);
	System.out.println("                                                 normal room price---->500/-");
	System.out.print(def);
        double acRoomPrice = 1000.0;
	System.out.print(skblue);
	System.out.println("                                                 Ac room price------->1000/-");
	System.out.print(def);	
        System.out.println("choose any option in given below.....");
	System.out.print(yellow);	
	 System.out.println("                                                 1.Normal rooms");
	System.out.println("                                                 2.Ac rooms");
        System.out.println("                                                 3.Ac&Normal rooms");
	System.out.print(def);
	String opt=sa.next();
	switch(opt)
       {
	case "1":
			  System.out.print(skblue);
	                   System.out.println("                                                  Enter number of  rooms that you want:");
			  System.out.print(def);
                          int noOfRooms=sa.nextInt();
                          if (normalRoomPrice > 0)
	                    {
int v=10000;
                             System.out.println("");
                             double totalCost = normalRoomPrice * numberOfNights*noOfRooms;
			     System.out.println("You total amount "+totalCost+"Rs/-");
	                    }
                        
			break;
	case "2": 
    			System.out.print(skblue);
                         System.out.println("                                                  Enter number of rooms that you want:");
			 System.out.print(def);
                          int noOfRoom=sa.nextInt();
	                     if (acRoomPrice > 0)
	                     {
                               double totalCost = acRoomPrice * numberOfNights*noOfRoom;
				System.out.println("You total amount "+totalCost+"Rs/-");
                             }
                         
			 break;
        case "3":
		   System.out.print(blue);
	        System.out.println("						Enter number Of Normal Rooms:");
		    System.out.print(def);
                    int ac=sa.nextInt();
	           System.out.print(blue);
                System.out.println("						Enter number Of Ac Rooms:");
		    System.out.print(def);
                    int nc=sa.nextInt();
                    double totalCost=normalRoomPrice * numberOfNights*ac+acRoomPrice * numberOfNights*nc;
                      System.out.println("Your total amount "+totalCost+"Rs/-");
                      break;
	default:
			System.out.print(blink);
			System.out.println(red +"                            **************_Invalid room type entered,Please enter valid option._*****************"+def);
                          rooms();
        }
     }
      
        void pay()
	{
	Scanner rj=new Scanner(System.in);
        System.out.println("Choose a payment method: ");
	System.out.print(yellow);
        System.out.println("                                                 1.Paytm");
        System.out.println("                                                 2.PhonePe");
        System.out.println("                                                 3.Google Pay");
	System.out.print(def);
	System.out.print(red);
        System.out.println("                                                 4.Exit");
	System.out.print(def);
        String paymentOption = rj.next();

        switch (paymentOption) {
            case "1":
                int l=5678;
		System.out.print(skblue);
                System.out.println("	 				         Enter Your PIN:");
		System.out.print(def);
                int z=rj.nextInt();
                if(l==z)
                {
		System.out.print(blink);
		System.out.print(green);
                System.out.println("                                                 Payment Successful! using Paytm.");
		System.out.print(def);
                }
                else
                {
		System.out.print(blink);
		System.out.print(red);
                 System.out.println("                                             Invalid Pin......");
		System.out.print(def);
                 pay();
                 }
                break;
            case "2":
                int lll=5678;
		System.out.print(skblue);
                System.out.println("    					         Enter Your PIN:");
		System.out.print(def);
                int zzz=rj.nextInt();
                if(lll==zzz)
                {
		System.out.print(blink);
		System.out.print(green);
                System.out.println("                                                 Payment Successful! using PhonePe.");
		System.out.print(def);
                }
                else
                {
		System.out.print(blink);
		System.out.print(red);
                 System.out.println("                                             Invalid Pin......");
		System.out.print(def);
                 pay();
                 }
                break;
            case "3":
                int ll=5678;
		System.out.print(skblue);
                System.out.println("						 Enter Your PIN:");
		System.out.print(def);
                int zz=rj.nextInt();
                if(ll==zz)
                {
   		System.out.print(blink);
		System.out.print(green);
                System.out.println("                                                 Payment Successful! using GooglePay.");
		System.out.print(def);
                }
                else
                {
		System.out.print(blink);
		System.out.print(red);
                 System.out.println("                                               Invalid Pin......");
		System.out.print(def);
                 pay();
                }
                break;
	    case "4":
		System.out.print(blink);
		System.out.println(red+"						      **************_exit_*****************"+def);
		System.out.println(green+"					__________________THANK YOU , VISIT AGAIN____________________"+def);
		System.exit(0);
            default:
		System.out.print(blink);
		System.out.print(red);
                System.out.println("                               *****Invalid Payment Option Selected. Please Select a Valid Option*****");
		System.out.print(def);	
		pay();
        }
      }
  
}