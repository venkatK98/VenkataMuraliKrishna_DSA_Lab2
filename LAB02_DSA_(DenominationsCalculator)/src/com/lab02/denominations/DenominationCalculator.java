package com.lab02.denominations;

public class DenominationCalculator {

	private int[] denominations;
	int paymentAmount;
	boolean outcome;

	public DenominationCalculator(int[] denominations, int paymentAmount) {
		this.denominations = denominations;
		this.paymentAmount = paymentAmount;
	}

	public int[] getDenominations() {
		return denominations;
	}

	public void setDenominations(int[] denominations) {
		this.denominations = denominations;
	}

	public int getPaymentamount() {
		return paymentAmount;
	}

	public void setPaymentamount(int paymentamount) {
		this.paymentAmount = paymentamount;
	}

	public boolean isOutcome() {
		return outcome;
	}

	public void setOutcome(boolean outcome) {
		this.outcome = outcome;
	}

	public void calculate() {

		performSort();

		StringBuilder result = new StringBuilder();
		result.append(String.format("Amount to pay : %d", paymentAmount));
		result.append(System.getProperty("line.separator"));

		int tempAmount = paymentAmount;

		try {

			for (int index = 0; index < denominations.length; index++) {

				int denominationValue = denominations[index];

				int quotient = tempAmount / denominationValue;
				int remainder = tempAmount % denominationValue;

				if (quotient == 0) {

					// This denomination cannot be considered for the final outcome

				} else {

					result.append(String.format("Denomination : %d, Count : %d", denominationValue, quotient));
					result.append(System.getProperty("line.separator"));

					tempAmount = remainder;
				}

				if (remainder == 0) {
					this.outcome = true;
					break;
				}
			}

		} catch (ArithmeticException arithmeticException) {
			arithmeticException.printStackTrace();
		}

		if (outcome) {

			System.out.println("Success");
			System.out.println(result);
		} else {
			System.out.println("Failure");
			result.append(String.format("Unable to provide denomination for the balance amount of %d", tempAmount));
			System.out.println(result);
		}
	}

	public void performSort() {
		MergeSortDesc descSorter = new MergeSortDesc();
		descSorter.sortDesc(denominations, 0, denominations.length - 1);
	}
}
