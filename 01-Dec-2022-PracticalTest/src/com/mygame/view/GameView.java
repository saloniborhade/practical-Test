package com.mygame.view;
import com.mygame.service.*;


public class GameView {
GameService s = new GameService();
	
	
	public String[] displayCityNamesWithBlanks()
	{
		GameView v = new GameView();
		String[] c = s.getCityNameService();
		
		
		for(int i = 0 ; i < c.length; i++)
		{
			int num = c[i].length();
			int k = 0;
			// int randomArray[]= null;
			char arr[]= c[i].toCharArray();
			
			while(k != 3)
			{
				//int val = v.generateRandom(num);
				
				for(int j=0; j < arr.length;j++)
				{
					//if( i == val)
					{
						arr[i] = ' ';
					}		
				}
				
				k++;
			}
			c[i] = String.valueOf(arr);
		}
		return c;
	}
	
	
	
	//int[] generateRandom(int n)
	{
		//int max = n;
		//int min = 1;
		int i = 0;
		
		java.util.Random random = new java.util.Random();
	//	while(i != max/3 )
		{
			//int value[i] = (int) (random.nextInt(max - min) + min);
		}
		//return value;
	}

}
