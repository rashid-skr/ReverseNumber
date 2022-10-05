package SumR;
import java.util.Scanner;
public class Reverse {
	
			public static void main(String[] args){
			
				Scanner input= new Scanner(System.in);
				int num,sum=0,temp,r;
				System.out.print("enter nmbr =");
				num=input.nextInt();
				temp=num;
				while(temp !=0) {
					r=temp %10;
					sum=sum *10+r;
					temp=temp / 10;
					System.out.println("Reverse="+sum);
					}
}

}

