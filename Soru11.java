//Kullanıcıdan alınan sayının 2'nın kuvveti olup olmadığını bulan Java programı

import java.util.Scanner;

public class Soru11 {

	public static void main(String args[])
	{
		Scanner reader = new Scanner(System.in);
		int sayi;

		System.out.print("Bir sayi giriniz:");
		sayi = reader.nextInt();

		kuvvet(sayi);
	}

	public static void kuvvet(int Sayi)
	{
		if ( (Sayi%2)!= 0 )
		{
			System.out.println("2nin kuvveti degil");
		}else
		{
			if( (Sayi/2)==1 )
			{
				System.out.println("2nin kuvveti");
			}else
			{
				kuvvet(Sayi/2);
			}
		}
	}
}