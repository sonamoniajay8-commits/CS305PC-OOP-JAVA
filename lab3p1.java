/**
import java.util.Scanner;
class lab3p1{
	public static  void main (String...args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number  ");
		int a = sc.nextInt();
		System.out.println("prime number between that "+a);
           	for(int i=2;i<a;i++)
		{
			int temp=0;
			if(i==2){
				temp++;
				
			}
			for(int j=2;j<=i;j++){
				if(i%j==0)
					break;
			else
				temp++;
			}
				if(temp>0){
					System.out.println(""+i);
			}
	}
			}
			}
import java.util.Scanner;
class lab3p1{
	public static  void main (String...args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number  ");
		int a = sc.nextInt();
		System.out.println("prime number between that "+a);
		int i=2;
			while(i<a){
		int temp=0;
				if(i==2){
				temp++;
			
			}
		int j=2;
				while(j<i){
		if(i%j==0){
				temp=0;
				break;
		}
		else
		 		temp++;
		 
			j++;
		}
			if(temp>0){
				System.out.println(""+i);
		
		}
		i++;
}
		}
		}**/
import java.util.Scanner;

class lab3p1{
	public static  void main (String...args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number  ");
		int a = sc.nextInt();
		System.out.println("prime number between that "+a);
		int i=2;
		do{
			int j=2;
			int temp=0;
		do{
			if(i==2){
				temp++;
				j++;
				continue;
			}
			if(i%j==0){
				temp =0;
					break;
				}
			else
				temp++;
					j++;
				}
			while(j<i);
				if(temp>0)
					System.out.println(""+i);
			
			i++;
		}
		while(i<a);
		
}
			}
			
		
		
		
				
			
			
			
























