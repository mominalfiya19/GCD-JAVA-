
public class GCD {

	public static void main(String[] args) {
		
		int Num1=60, Num2=25, Temp, GCD=0;  
		
		while(Num2 != 0)  
		{  
		Temp = Num2;  
		Num2 = Num1 % Num2;  
		Num1 = Temp;  
		}  
		
		GCD = Num1;  
		System.out.println("\n GCD =  " + GCD);  
	}
}
