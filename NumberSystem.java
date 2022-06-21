package Rock_Paper_Scissors;

import java.util.Scanner;

public class NumberSystem {
	
	public static boolean isBinaryNumber(String num)
	{
		int num1 = Integer.parseInt(num);
		if(num1==0||num1==1||num1<0)
		{
			System.out.println("Enter valid Binary value");
			return false;
		}
		while(num1!=0)
		{
			if(num1%10>1) {
				System.out.println("Enter valid Binary value");
				return false;
			}
			num1/=10;
		}
		return true;
	}
	
	public static boolean isDecimal(String num)
	{
		int num1 = Integer.parseInt(num);
		if(num1%1==0)
			return true;
		
		System.out.println("Enter valid Decimal value");
		return false;
	}
	
	public static boolean isOcta(String num)
	{
		boolean isOctal = false;
		int num1 = Integer.parseInt(num);
		while(num1>0)
		{
			if(num1%10<=7) 
			{
				isOctal = true;				
		}else
		{
			isOctal = false;
			System.out.println("Enter valid octal value");
			break;
		}
		num1/=10;
		}
		return isOctal;
	}
	
	public static boolean isHexadecimal(String s)
	{
		int n = s.length();
		for(int i=0;i<n;i++)
		{
			char ch =s.charAt(i);
			if((ch<'0' || ch>'9') && (ch<'A' || ch >'F')) {
				System.out.println("Enter valid Hexadecimal value");
				return false;
			}
				
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		String cont="";
		while(true) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("In which Format you provide value \nBinary \noctal\nhexadecimal\nDecimal :");
		String input = sc.nextLine();
		try {
		if(input.equalsIgnoreCase("binary"))
		{
			System.out.println("Enter binary value : ");
			String result = sc.nextLine();
			x:while(isBinaryNumber(result)==true)
			{
				System.out.println("Choice in which fromat you want output \noctal\nhexadecimal\ndecimal");
				String format = sc.next();
				int decimal = Integer.parseInt(result,2);
				switch(format)
				{
				case "octal":
					System.out.println("In Octal :"+Integer.toOctalString(decimal));
					break;
				case "hexadecimal":
					System.out.println("In Hexadecimal :"+Integer.toHexString(decimal));
					break;
				case "decimal":
					System.out.println("In Decimal :"+decimal);
					break;
				default:
					System.out.println("Enter valid Format !!!!!!!");
					continue;
				}
				break;
			}
			
		}else if(input.equalsIgnoreCase("hexadecimal"))
		{
			System.out.println("Enter hexadecimal value :");
			String result = sc.nextLine();
			x:while(isHexadecimal(result)==true)
			{
				System.out.println("Choice in which fromat you want output \noctal\nBinary\ndecimal");
				String format = sc.next(); 
				int decimal = Integer.parseInt(result,16);
				switch(format)
				{
				case "octal":
					System.out.println("In Octal :"+Integer.toOctalString(decimal));
					break;
				case "decimal":
					System.out.println("In Deciaml :"+decimal);
					break;
				case "binary":
					System.out.println("In Binary :"+Integer.toBinaryString(decimal));
					break;
				default:
					System.out.println("Enter valid Format !!!!!!!");
					continue;	
				}
				break;
			}
				
		}else if(input.equalsIgnoreCase("octal"))
		{
			System.out.println("Enter Octal Value :");
			String result = sc.nextLine();
			x:while(isOcta(result)==true)
			{
				System.out.println("Choice in which fromat you want output \nhexadecimal\nBinary\ndecimal");
				String format = sc.next(); 
				int decimal = Integer.parseInt(result,8);
				switch(format)
				{
				case "hexadecimal":
					System.out.println("In hexadecimal :"+Integer.toOctalString(decimal));
					break;
				case "decimal":
					System.out.println("In Deciaml :"+decimal);
					break;
				case "binary":
					System.out.println("In Binary :"+Integer.toBinaryString(decimal));
					break;
				default:
					System.out.println("Enter valid Format !!!!!!!");
					continue;	
				}
				break;
			}
		}else if(input.equalsIgnoreCase("decimal"))
		{
			System.out.println("Enter Decimal value :");
			String result = sc.nextLine();
			x:while(isDecimal(result)==true)
			{
				System.out.println("Choice in which fromat you want output \nhexadecimal\nBinary\noctal");
				String format = sc.nextLine(); 
				int decimalint = Integer.parseInt(result);
				switch(format)
				{
				case "hexadecimal":
					System.out.println("In hexadecimal :"+Integer.toHexString(decimalint));
					break;
				case "octal":
					System.out.println("In octal :"+Integer.toOctalString(decimalint));
					break;
				case "binary":
					System.out.println("In Binary :"+Integer.toBinaryString(decimalint));
					break;	
				default:
					System.out.println("Enter valid Format !!!!!!!");
					continue;
				}
				break;
			}
		}else 
			System.out.println("Enterd Invalid Format !!!!!!");
		}catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Enter any key to continue or 'N' to end :");
		cont = sc.next().toLowerCase();
		if(cont.equals("n"))
		{
			break;
		}
		}
	}
}


		