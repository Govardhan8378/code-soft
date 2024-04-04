import java.util.Scanner;  

public class ATMinterface  
{  
     public static void main(String args[] )  
    {  
        float balance = 1000, withdraw, deposit;
          
        try (Scanner sc = new Scanner(System.in)) 
        {
			while(true)  
			{    
			    System.out.println("ATM Machine\n");  
			    System.out.println("1 Withdraw");  
			    System.out.println("2 Deposit");  
			    System.out.println("3 Check Balance");  
			    System.out.println("4 EXIT\n");  
			    System.out.print("Choose the option:");  
			    int choice = sc.nextInt();  
			    switch(choice)  
			    {  
			      case 1:  
			             System.out.print("Enter money to be withdrawn:");  
			             withdraw = sc.nextInt();  
			             if(balance >= withdraw)  
			             {  
			              balance = balance - withdraw;  
			              System.out.println("Please collect your money and your balance "+balance);  
			             }  
			             else  
			             {  
			              System.out.println("Insufficient Balance");  
			             }  
			                    break;  
   
			      case 2:  
			              
			             System.out.print("Enter money to be deposited:");  
			             deposit = sc.nextInt();  
			             balance = balance + deposit;  
			             System.out.println("Your Money has been deposited successfull your balance "+balance);    
			                    break;  
   
			      case 3:  
			             System.out.println("Balance : "+balance);    
			                    break;  
   
			      case 4:  
			             System.exit(0);  
			    }  
			}
		}
    }
        
 }  
//https://youtube.com/playlist?list=PLf4ZgZMb1EljrHq_RPWYdx2HmbGfYxAoH&si=8VM6nTjtY0qiN3wR
