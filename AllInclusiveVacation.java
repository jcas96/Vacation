//uses the abstract class 'Vacation' as a subclass
class AllInclusiveVacation extends Vacation{
	private String brand;
	private int rating;
	private double price;
	
	AllInclusiveVacation(String d, double b,String br, int rat, double pri){
		super(d,b);
		setBrand(br);
		setRating(rat);
		setPrice(pri);
	}
	
	public void setBrand(String bran) {
		brand = bran;
	}
	

	//emthod that checks to make sure the rating is from 1-5 or else it wil throw a exception error 
	public void setRating(int r) {
		if(r>=1&&r<=5) {
			rating = r;
		}else {
			throw new IllegalArgumentException("Rating must be >0 and <=5");
		}
		
	}
	public void setPrice(double p) {
		if(p>=0.0) {
			price = p;
		}
		else {
			throw new IllegalArgumentException("Price must be >=0.0");
		}
	}
	
	public String getBrand() {
		return brand;
	}
	public int getRating() {
		return rating;
	}
	public double getPrice() {
		return price;
	}
	
	public String toString() {
		return String.format("%sBrand: %S; Rating: %d; Price: $%.2f", super.toString(),brand,rating,price);
	}
	
	@Override
	public boolean equals( Object obj )
	  {
		if ( ! ( obj instanceof Vacation ) )
		   return false;
		else
		{
		  AllInclusiveVacation vacay = (AllInclusiveVacation) obj;
	      return ( (super.equals(vacay)) && (brand.equalsIgnoreCase(vacay.brand)&&((price-vacay.price<=0.0001)&&price-vacay.price>=-0.0001)||(vacay.price-price<=0.0001)&&vacay.price-price>=-0.0001));
		}
	  }
	
	@Override
	public double overBudget() {
		double amt;
		if(price>super.getBudget()) {
			amt = (super.getBudget()-price);
		}
		else if(price<super.getBudget()) {
			amt = super.getBudget()-price;
		}else {
			amt = 0;
		}
		return amt;
	}
}
