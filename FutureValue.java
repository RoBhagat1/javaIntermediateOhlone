/*********************************************************************************
Name: Rohan Bhagat
Course: CS170-0X
Lab #: Lab 2
Submission Date: 10:00 pm, Wed (10/7)
Brief Description: The code to compute the value
*********************************************************************************/

import java.math.*;//import
import java.text.NumberFormat;

public class FutureValue {
	
		private String name;	//Declare instance variables
		private BigDecimal years;
		private BigDecimal  monthlyInvest;
		private BigDecimal yearlyRate;
		private BigDecimal futureValue= new BigDecimal(0);
		
		double dMonth = 12.0;
		double dHundred = 100.0;
		
	        // Convert the string input to BigDecimal 
	        BigDecimal monthsInAYear  = new BigDecimal(dMonth); 
	        BigDecimal hundred = new BigDecimal(dHundred); 
	        BigDecimal compoundOne  = new BigDecimal(1); 
		
		
		
		//following are setXx() and getXxx() for class variables
		public void setName(String userName) {
					name = userName;
				}
		public String getName() {
					return name;
				}

		public void setMonthlyInvest(BigDecimal monthlyInvestmentDeci) {
					monthlyInvest = monthlyInvestmentDeci;
				}
		public BigDecimal getMonthlyInvest() {
					return monthlyInvest;
				}
		public void setYearlyRate(BigDecimal yearlyReturnRate) {
					yearlyRate = yearlyReturnRate;
				}
		public BigDecimal getYealyRate() {
					return yearlyRate;
				}
		public void setYears(BigDecimal investYears){
					years = investYears;
				}
		public BigDecimal getYears() {
					return years;
				}
		public BigDecimal getFutureValue() {
					return futureValue;
				}
			
		public void futureValueCompute() {  //Method to compute the future value
			
					
			        BigDecimal months = yearlyRate.divide(monthsInAYear);
			        BigDecimal monthlyReturnRate= months.divide(hundred);
			        BigDecimal totalMonth = years.multiply(monthsInAYear);
			        
					int i = 1;

					do  {
						BigDecimal val1 = futureValue.add(monthlyInvest);
						BigDecimal val2 = monthlyReturnRate.add(compoundOne);
						
						futureValue = val1.multiply(val2);
						i++;
			 		}	while (i <= totalMonth.intValue());		
		}		   			
	}	//End of FutureValue3
