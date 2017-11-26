//1'den 100'e kadar olan sayıların toplamını çıktı olarak veren Java programı

public class Soru5
{
	public static void main(String [] args)
	{
		int toplam = 0;
		for(int i=0;i<=100;i++)
		{
			toplam += i;
		}
		System.out.print("Toplam:"+toplam);
	}
}