public class YearRange {
	int firstYear, secondYear, rangeType;
	
	public YearRange(int one, int two) {
		firstYear = one;
		secondYear = two;
	}
	
	public void setRangeType(int range) {
		rangeType = range;
	}
	
	public int getFirstYear() {
		return firstYear;
	}
	
	public int getSecondYear() {
		return secondYear;
	}
	
	public int getRangeOne() {
        int firstdivisor=1;
        
		if (rangeType==1)
			firstdivisor=14;
		if (rangeType==2)
			firstdivisor=4;
		if (rangeType==3)
			firstdivisor=3;;
		
		return firstdivisor;
	}
	
	public int getRangeTwo(){
        int seconddivisior=20;
        
		return seconddivisior;
	}
	
	public void printYears(){
        if(rangeType == 1)
			for(int i = firstYear; i <= secondYear; i++)
				if(i % getRangeOne() == 0 && i % getRangeTwo() == 0)
					System.out.println(i);
		
		if(rangeType == 2){
			for(int i = firstYear; i <= secondYear; i++){
				if(i % getRangeOne() == 0)
					System.out.print(i+", ");
			}
        }
        
		if(rangeType == 3)
			for(int i = firstYear; i <= secondYear; i++)
				if((i+2) % 4 == 0 && i % getRangeOne() == 0)
					System.out.println(i);
	}

	
	public static void main(String[] args) {

		//Get all years divisible by 14 and 20
		YearRange myFirstRange = new YearRange(1314, 2014); 
		myFirstRange.setRangeType(1);
		
		//Get all leap years.
		YearRange mySecondRange = new YearRange(1100, 3150); 
		mySecondRange.setRangeType(2);
		
		//Get all Olympic years divisible by 3
		YearRange myThirdRange = new YearRange(1500, 1890); 
		myThirdRange.setRangeType(3);
		
		System.out.println("A list of all the years divisible by " + 
		myFirstRange.getRangeOne() + " and " + myFirstRange.getRangeTwo());
		myFirstRange.printYears();
		
		System.out.println("A list of all the leap years from " + 
		mySecondRange.getFirstYear() + " to " + mySecondRange.getSecondYear());
		mySecondRange.printYears();
		
		System.out.println("A list of all the Olympic years from " + 
		myThirdRange.getFirstYear() + " to " + myThirdRange.getSecondYear() + " that are divisible by " + myThirdRange.getRangeOne());
		myThirdRange.printYears();
	}
}