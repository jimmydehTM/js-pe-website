public class Store{

	String type;
	int number;



	public Store(String productType, int num){
		type = productType;
		number = num;

				}

	public void shelf(){
	System.out.println("yes? " + type + "? We have those.");
	}


	public void numberOnShelf() {
	System.out.println("We have " + number + " " + type + ".");
	}


	public static void main(String[] args){

	Store product = new Store("candybars", 5);

	//product.shelf();

	product.numberOnShelf();
	}

 }
