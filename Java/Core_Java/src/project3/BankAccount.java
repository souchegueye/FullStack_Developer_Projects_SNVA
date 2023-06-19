package project3;

class BankAccount {

	private String[] ids;

	private String[] passwords;

	private double[] balances;

	// default constructor
	public BankAccount() {

	}

	public BankAccount(String[] ids, String[] passwords, double[] balances) {

		this.ids = ids;

		this.passwords = passwords;

		this.balances = balances;

	}

	public double getBalance(String id, String password) {

		for (int i = 0; i < ids.length; i++) {

			if (ids[i].equals(id) && passwords[i].equals(password)) {

				return balances[i];

			}

		}

		return -1;

	}
}
