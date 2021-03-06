public class CI {

	public double calCompoundInterest(Borro b) {
		//Calculating Equivalent Amount
		return calEquivalentAmount(b) - b.getPrinicipleAmount() ;
	}
	
	public double calEquivalentAmount(Borro b) {
		//Calculates equivalent amount at the end of a certain period at given rate of interest.
		return b.getPrinicipleAmount()*Math.pow((1+(b.getRateOfInterest()/100)), b.getPeriodInYears());
	}
	
	
	
	
}