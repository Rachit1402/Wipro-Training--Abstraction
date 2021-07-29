import java.util.*;
public class AssignmentMain3 {
	public static void main(String[] args)
	{
		Instrument[] instruments = new Instrument[10];
		
		Random random = new Random();
		for(int i=0;i<10;i++)
		{
			int rand = random.nextInt(4-1)+1;
			switch(rand)
			{
				case 1:
					instruments[i] = new Piano();
					break;
				case 2:
					instruments[i] = new Guitar();
					break;
				case 3:
					instruments[i] = new Flute();
					break;
			}
		}
		System.out.println("Considering the position starts with 1 and not the index value which starts with 0");
		System.out.println();
		System.out.println();
		for(int i=0;i<10;i++)
		{
			if(instruments[i] instanceof Piano)
			{
				System.out.println("Piano is stored at "+(i+1)+"th position");
			}
			if(instruments[i] instanceof Guitar)
			{
				System.out.println("Guitar is present at "+(i+1)+"th position");
			}
			if(instruments[i] instanceof Flute)
			{
				System.out.println("Flute is place at "+(i+1)+"th position");
			}
		}
	}

}
