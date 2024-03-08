
abstract class Vacation {
	
	private String destination;
	private double budget;
	
	Vacation(String dest, double budg){
		setDestination(dest);
		setBudget(budg);
	}
	
	public void setDestination(String d) {
		destination = d;
	}
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
