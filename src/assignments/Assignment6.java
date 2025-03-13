package assignments;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String customerName = "John Doe";
		int creditScore = 720;
		float income = 55000.0f;
		boolean isEmployed = true;
		float debtToIncomeRatio = 35.0f;

		if (creditScore > 750) {
			System.out.println("The Loan is Automatically Approved.");
		} else if (creditScore >= 650 && creditScore <= 750) {
			if (income >= 50000) {
				if (isEmployed) {
					if (debtToIncomeRatio < 40) {
						System.out.println(
								"Since John Doe is Employed, the Credit Score is between 650 to 750, the income is also greater than $50,000 & DBI Ratio is lesser than 40, the Loan is Approved for "
										+ customerName);
					} else
						System.out
								.println("Since the DTI Ratio is greater than or Equal to 40%, the Loan is Denied for "
										+ customerName);
				} else
					System.out.println("Since the Customer is Umemployed, the Loan is Denied for" + customerName);
			} else
				System.out.println(
						"Since the Customer's Income is less the $50,000, the Loan is Denied for" + customerName);
		} else
			System.out.println("Since the Credit Score is below 650, the Loan is Denied for" + customerName);
	}

}
