package main;

public class Testing {
	
	public int addition (int x, int y) {
		
		return x+y;
	
	}
	
	public boolean checkTheRange (int rangeMin,int rangeMax, int number) {
		
		if(number >= rangeMin && number <= rangeMax) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
