package snackbarApp;

public class Customer{
	private static int maxId = 0;

	private int id;
	private String name;
	private double cash;

	public Customer(String name, double cash){
		maxId++;

		id = maxId;
		this.name = name;
		this.cash = cash;
	}
	public String getName(){
		return name;
	}
	public int getId(){
		return id;
	}
	public double getCash(){
		return cash;
	}
	public void setName(String name){
		this.name = name;
	}
	public void addCash(double amountToAdd){
		this.cash = this.cash + amountToAdd;
	}
	public void buySnacks(int numberOfSnacks, double costToBuy){
		this.cash = this.cash - (costToBuy * numberOfSnacks);
	}
}