package snackbarApp;

public class Snack{
	private static int maxId = 0;

	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vendingMachineId;
	

	public Snack(String name, int quantity, double cost, int vendingMachineId){
		maxId++;
		id = maxId;
		this.name = name;
		this.cost = cost;
		this.vendingMachineId = vendingMachineId;
		this.quantity = quantity;
	}
	//getters
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public double getCost(){
		return cost;
	}
	public int getVendingMachineId(){
		return vendingMachineId;
	}
	public int getQuantity(){
		return quantity;
	}
	//setters
	public void setName(String name){
		this.name = name;
	}
	public void setCost(int cost){
		this.cost = cost;
	}
	public void setVendingMachineId(int vendingMachineId){
		this.vendingMachineId = vendingMachineId;
	}
	//methods
	public void addQuantity(int amountToAdd){
		this.quantity = quantity + amountToAdd;
	}
	public void buySnack(int amountToBuy){
		this.quantity = quantity - amountToBuy;
	}
	public double getTotal(int amountToBuy){
		return amountToBuy * this.cost;
	}
}