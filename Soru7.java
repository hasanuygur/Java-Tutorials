//Klavyeden girilen sayının faktöriyelini alan Java programı

import java.util.Scanner;

public class Soru7
{
	public static void main(String [] args)
	{
		int sayi,faktoriyel=1;
		Scanner reader = new Scanner(System.in);

		System.out.print("Faktoriyeli alinacak sayiyi giriniz:");
		sayi = reader.nextInt();

		for(int i=1;i<=sayi;i++)
		{
			faktoriyel *= i;
		}

		System.out.print("Sonuc:" + faktoriyel);
	}
}