//abstract class that creates multiple methods to be used at a later time
abstract class Vacation {
	
	private String destination;
	private double budget;

	//simple setter methods for setting destination, and budget
	Vacation(String dest, double budg){
		setDestination(dest);
		setBudget(budg);
	}
	
	public void setDestination(String d) {
		destination = d;
	}

	//budget can only be set if you have a higher than 0.0 budget, sends an exception error if not
	public void setBudget(double b) {
		if(b>=0.0) {
		budget = b;
		}
		else {
			throw new IllegalArgumentException("Budget must be >=0.0");

		}
	}
	
	public String getDestination() {
		return destination;
	}
	public double getBudget() {
		return budget;
	}
	
	public String toString() {
		return String.format("Destination: %S; Budget: $%.2f\n", destination,budget);
	}

	//Checks to see if the original vacation is the same as the vacation that is being compared/equals to at the moment
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Vacation)) {
			return false;
		}
		else {
			Vacation objVac = (Vacation)obj;
			if((destination == objVac.getDestination())&&((budget-objVac.getBudget()<=0.0001)&&budget-objVac.getBudget()>=-0.0001)||(objVac.getBudget()-budget<=0.0001)&&objVac.getBudget()-budget>=-0.0001) {
				return true;
			}
			else {
				return false;
			}
		}
	}
	public abstract double overBudget();

}
