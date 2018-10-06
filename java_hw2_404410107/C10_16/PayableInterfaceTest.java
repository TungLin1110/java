package exe10_16;

public class PayableInterfaceTest 
{
	public static void main(String[] args) {
		// create four-element Payable array
		Payable[] payableObjects = new Payable[7];

		// populate array with objects that implement Payable
		payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
		payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);
		payableObjects[2] = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
		payableObjects[3] = new SalariedEmployee("Lisa", "Barnes", "888-88-8888", 1200.00);
		payableObjects[4] = new HourlyEmployee("Tony", "Tsai", "123-12-1234", 20.20, 50);
		payableObjects[5] = new CommissionEmployee("peter", "chu", "321-21-4321", 15000, .04);
		payableObjects[6] = new BasePlusCommissionEmployee("Kid", "chen", "121-12-1221", 6000, .07, 500);

		System.out.println("Invoices and Employees processed polymorphically:");

		// generically process each element in array payableObjects
		for (Payable currentPayable : payableObjects) {
			if (currentPayable instanceof BasePlusCommissionEmployee) {
				BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentPayable;
				//increase 10%
				employee.setBaseSalary( employee.getBaseSalary()*1.10);

				System.out.printf("%nnew base salary with 10%% increase is: $%,.2f", employee.getBaseSalary());
			}
			// output currentPayable and its appropriate payment amount
			System.out.printf("%n%s %n%s: $%,.2f%n", currentPayable.toString(), // could
																				// invoke
																				// implicitly
					"payment due", currentPayable.getPaymentAmount());
		}
	} // end main
}
