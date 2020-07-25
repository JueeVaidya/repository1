public class Borr {
    
	private double prinicipleAmount ;
	private double rateOfInterest ;
	private double periodInYears ;
	
	
	public Borr() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Borr(double prinicipleAmount, double rateOfInterest, double periodInYears) {
		super();
		this.prinicipleAmount = prinicipleAmount;
		this.rateOfInterest = rateOfInterest;
		this.periodInYears = periodInYears;
	}

	public double getPrinicipleAmount() {
		return prinicipleAmount;
	}

	public void setPrinicipleAmount(double prinicipleAmount) {
		this.prinicipleAmount = prinicipleAmount;
	}

	public double getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	public double getPeriodInYears() {
		return periodInYears;
	}

	public void setPeriodInYears(double periodInYears) {
		this.periodInYears = periodInYears;
	}
	
	
	
}