//Klavyeden kenarları girilen bir üçgenin çeşidini belirleyen Java programı

import java.util.Scanner;

public class Soru2
{
	public static void main(String [] args)
	{
		int [] kenar = new int[3];

		Scanner reader = new Scanner(System.in);

		System.out.print("1.Kenar:");
		kenar[0] = reader.nextInt();
		System.out.print("2.Kenar:");
		kenar[1] = reader.nextInt();
		System.out.print("3.Kenar:");
		kenar[2] = reader.nextInt();

		if( (kenar[0]==kenar[1]) && (kenar[1]==kenar[2]) )
		{
			System.out.print("Eskenar Ucgen");
		}else if(kenar[0]!=kenar[1] && kenar[0]!=kenar[2] && kenar[1]!=kenar[2])
		{
			System.out.print("Cesitkenar Ucgen");
		}else
		{
			System.out.print("Ikizkenar Ucgen");
		}
	}
}