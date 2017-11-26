//Klavyeden girilen 3 sayının ortalamasını alan Java programı

import java.util.Scanner;

public class Soru1
{
	public static void main(String args[])
	{
		int toplam;
		int [] sayi = new int[3];
		float sonuc;
		Scanner reader = new Scanner(System.in);

		System.out.print("1. sayi:");
		sayi[0] = reader.nextInt();
		System.out.print("2. sayi:");
		sayi[1] = reader.nextInt();
		System.out.print("3. sayi:");
		sayi[2] = reader.nextInt();
		
		toplam = sayi[0] + sayi[1] + sayi[2];
		sonuc = (float)toplam/3;

		System.out.print("Sonuc:" + sonuc);
	}	
}