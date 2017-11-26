/*
100'lük sistemde verilen notları harfli sistemde gösteren Java programı
   (
     100-90 arası AA
     89-80 arası BA
     79-70 arası BB
     69-60 arası CB
     59-50 arası CC
     50-0  arası FF
   )
*/

import java.util.Scanner;

public class Soru9
{
	public static void main(String [] args)
   	{
   		int nott;
   		Scanner reader = new Scanner(System.in);

   		System.out.print("Notu giriniz:");
   		nott = reader.nextInt();

   		if(nott>=90 && nott<=100 )
   		{
   			System.out.print("Harf Notunuz AA");
   		}else if(nott>=80 && nott<=89)
   		{
   			System.out.print("Harf Notunuz BA");
   		}else if(nott>=70 && nott<=79)
   		{
   			System.out.print("Harf Notunuz BB");
   		}else if(nott>=60 && nott<=69)
   		{
   			System.out.print("Harf Notunuz CB");
   		}else if (nott>=50 && nott<=59)
   		{
   			System.out.print("Harf Notunuz CC");
   		}else if(nott<50)
   		{
   			System.out.print("Harf Notunuz FF");
   		}
	}
}