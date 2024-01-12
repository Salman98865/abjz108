package work;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Account {
static String Name;

static String id;
static String mail;
static String number;
static String balance;
Scanner in=new Scanner(System.in);

 Transcation t=new Transcation();
 Customer c=new Customer();
	
	public void Detials(StringBuilder id2, String name2, String mail2, String number2, String balance2) throws FileNotFoundException,ArrayIndexOutOfBoundsException{
		
	String Path="E:\\Javahurreh/";
		//File f=new File(Path);
	
		Scanner in = new Scanner(new File(Path+Name+".txt"));
         while (in.hasNextLine())
         {
           String s1 = in.nextLine();  
           System.out.println(s1);
           String[] sArray = s1.split(",");
           
           System.out.println(sArray[0]); //Just to verify that file is being read
           System.out.println(sArray[1]);
           id=sArray[0];
           Name=sArray[1];
           mail=sArray[2];
           number=sArray[3];
           balance=sArray[4];
           
           System.out.println("your account No"+id);
           System.out.println("your Name"+Name);
           System.out.println("your Mail"+mail);
           System.out.println("your phonenumber"+number);
           System.out.println("your balance"+balance);   
		
           System.out.println("your ID: "+id2);
           System.out.println("your Name: "+name2);
           System.out.println("your Mail: "+mail2);
           System.out.println("your Number: "+number2);
           System.out.println("your Balance: "+balance2);
              
           System.out.println("view your Transcations press 0");
           System.out.println("Login Page the press 1");
           int a=in.nextInt();
           if(a==0){
        	   t.transcationHome();
        	   
           }else if(a==1){
        	   c.Login();
           }else{
        	   System.out.println("Enter the valid Input for output");
           }
         }}}