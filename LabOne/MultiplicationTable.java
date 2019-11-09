public class MultiplicationTable {
	
	int number, rangeFrom, rangeTo;

	public void setnumber(int num) {
		number = num;
	}
	
	public void setrangeFrom(int rangeFr) {
		rangeFrom = rangeFr;
	}
	
	public void setrangeTo(int rangeT) {
		rangeTo = rangeT;
	}
	
	public void displayTable() {

		System.out.println("Multiplicationtable of "+number+" from range "+rangeFrom+" to "+rangeTo+":");

		for (int i=rangeFrom; i<=rangeTo; i++) {
			System.out.println(number+ "x" +i+ "=" +number*i);
		}
	}
	
	public static void main(String[] args) {

		MultiplicationTable tableOfThree = new MultiplicationTable();
		tableOfThree.setnumber(3);
		tableOfThree.setrangeFrom(17);
		tableOfThree.setrangeTo(25);
		
		MultiplicationTable tableOfSeventeen = new MultiplicationTable();
		tableOfSeventeen.setnumber(17);
		tableOfSeventeen.setrangeFrom(3);
		tableOfSeventeen.setrangeTo(49);
		
		MultiplicationTable tableOfZero = new MultiplicationTable();
		tableOfZero.setnumber(0);
		tableOfZero.setrangeFrom(1);
		tableOfZero.setrangeTo(5);
		
		tableOfThree.displayTable();
		System.out.println();

		tableOfSeventeen.displayTable();
		System.out.println();

		tableOfZero.displayTable();
	}
}