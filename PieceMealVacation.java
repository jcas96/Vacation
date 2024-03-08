
public class PieceMealVacation extends Vacation{
	
	private String [] items;
	private double [] costs;
	PieceMealVacation(String d, double b,String [] item, double [] cost){
		super(d,b);
		setItems(item);
		setCosts(cost);
		
	}
	
	public void setItems(String[]newItems) {
		int len = newItems.length;
		items = new String[len];
		for(int i =0;i<len;i++) {
			items[i]=newItems[i];
		}
	}
	
	public void setCosts(double[]newCosts) {
		int len = items.length;
		costs = new double[len];
		for(int i =0;i<newCosts.length;i++) {
			if((newCosts.length>len)&&(i==len)) {
				break;
			}else if((newCosts.length<len)&&(i>=len)){
				costs[i]=0.0;
			}else {
			costs[i]=newCosts[i];
			}
		}
	}
	
	public double[] getCosts() {
		return costs;
	}
	
	public String[] getItems() {
		return items;
	}
	public String toString() {
		String str="";
		for(int i =0;i<items.length;i++) {
			str+= (String.format("%S: $%.2f\n", items[i],costs[i]));
		}
		return super.toString()+str;
		}
	
	@Override
	public boolean equals( Object obj )
	  {
		boolean ans = false;
		if ( ! ( obj instanceof Vacation ) )
		   ans= false;
		else
		{
		  PieceMealVacation itemCost = (PieceMealVacation) obj;
		  for(int i =0;i<items.length;i++) {
			  if((super.equals(itemCost)&&(items[i].equalsIgnoreCase(itemCost.items[i])&&((costs[i]-itemCost.costs[i]<=0.0001)&&(costs[i]-itemCost.costs[i]>=-0.0001))||(itemCost.costs[i]-costs[i]<=0.0001)&&itemCost.costs[i]>=-0.0001))) {
				  ans= true;
			  }else {
				  ans = false;
			  }
		  }
		}
		return ans;
	  }
	
	@Override
	public double overBudget() {
		double amt=0;
		for(int c =0;c<costs.length;c++) {
			amt+=costs[c];
		}
		double budgPrice = super.getBudget()-amt;
		return budgPrice;
	}
	
}
