
public class SeniorWorker extends RegularWorker{
	private double meritPay;
	public SeniorWorker(String name, double salary, double overtimePay) {
		super(name, salary, overtimePay);
		this.meritPay = salary*0.1;
		// TODO Auto-generated constructor stub
	}
	  public double getMeritPay()
	  {
		  return meritPay;
	  }
	  public void setMeritPay(double meritPay)
	  {
		  this.meritPay = meritPay;
	  }
	  
	  
	  public double earnings()
		{
			return (super.earnings()+meritPay);
		}
	  
	  public String toString()
	  {
		  return "Senior worker: " + getName();
	  }

}
	