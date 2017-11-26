/*
	x>0 , y<0 ise f(x,y) = 4x + 2y + 4
	x>0 , y=0 ise f(x,y) = 2x - 7y - 3
	x<0 , y>0 ise f(x,y) = 3x + 4y + 3
Klavyeden  girilen x ve y değerleri için yukarıdaki fonksiyonu bulan Java programı
*/

import java.util.Scanner;

public class Soru8
{
	public static void main(String [] args)
	{
		int x,y,sonuc=0;
		Scanner reader = new Scanner(System.in);

		System.out.print("X:");
		x = reader.nextInt();
		System.out.print("Y:");
		y = reader.nextInt();

		if(x>0 && y<0)
		{
			sonuc = (4*x)+(2*y)+4;
			System.out.print("Sonuc:" + sonuc);
		}else if(x>0 && y==0)
		{
			sonuc = (2*x)-y-3;
			System.out.print("Sonuc:" + sonuc);
		}else if(x<0 && y>0)
		{
			sonuc = (3*x)+(4*y)+3;
			System.out.print("Sonuc:" + sonuc);
		}else
		{
			System.out.print("X ve Y degerleri istenilen aralikta degil");
		}
	}
}