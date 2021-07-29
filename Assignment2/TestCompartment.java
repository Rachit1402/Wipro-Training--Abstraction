import java.util.*;
public class TestCompartment
{
	public static void main(String[] args)
	{
		Compartment[] compartment = new Compartment[10];
		
		Random random = new Random();
		for(int i=0;i<10;i++)
		{
			int n = random.nextInt(4)+1;
			switch(n)
			{
			case 1:
				compartment[i] = new FirstClass();
				break;
			case 2:
				compartment[i] = new LadiesClass();
				break;
			case 3:
				compartment[i] = new General();
				break;
			case 4:
				compartment[i] = new LuggageClass();
				break;
			}
		}
		for(int i=0;i<10;i++)
		{
			System.out.println(compartment[i].notice());
		}
	}
}