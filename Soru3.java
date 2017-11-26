//Klavyeden girilen Vize-Final notlarına göre öğrencinin dersi geçip geçmediğini bulan Java programı
//NOT:Vize %40,Final %60,Geçme Notu:50

import java.util.Scanner;

public class Soru3
{
	public static void main(String [] args)
	{
		Scanner reader = new Scanner(System.in);
		int vize,finall;
		double not;	
		
		System.out.print("Vize:");
		vize = reader.nextInt();
		System.out.print("Final:");
		finall = reader.nextInt();

		not = (vize*0.4) + (finall*0.6);

		if(not >= 50)
		{
			System.out.print("Sinifi gectiniz..");
		}else
		{
			System.out.print("Kaldiniz..");
		}
	}
}