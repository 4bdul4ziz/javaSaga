import java.util.Scanner;

class FurnitureShop {
	Scanner S = new Scanner(System.in);
	private String Name, Address, PhoneNo;
	String ItemPicked;
	double DistanceFromShop;

	void getFurnitures() {
		System.out.println();
		System.out.println("List of Items Available:");
		System.out.println("1.Desks");
		System.out.println("2.Drawers");
		System.out.println("3.Chairs");
		System.out.println("4.Couches");
		System.out.println();
	}

	void getCustomerDetails() {
		System.out.print("Name: ");
		this.Name = S.nextLine();
		System.out.print("Address: ");
		this.Address = S.nextLine();
		System.out.print("Phone Number: ");
		this.PhoneNo = S.nextLine();
		System.out.print("Item: ");
		this.ItemPicked = S.nextLine();
		System.out.print("Distance From Shop(in KMs): ");
		this.DistanceFromShop = S.nextDouble();
		S.nextLine();
		System.out.println();
	}

	void putCustomerDetails() {
		System.out.println("Name: " + Name);
		System.out.println("Address: " + Address);
		System.out.println("Phone Number: " + PhoneNo);
		System.out.println("Distance From Shop: " + DistanceFromShop);
		System.out.println("Item: " + ItemPicked);
		System.out.println();
	}
}

class CustomizeFurniture extends FurnitureShop {
	Scanner S = new Scanner(System.in);
	String ExtraCushion, FinePolishing, Reupholstering;

	void doCustomization() {
		if (ItemPicked.equals("Chair") || ItemPicked.equals("Couch")) {
			System.out.print("Extra Cushioning: ");
			this.ExtraCushion = S.nextLine();
			System.out.print("Reupholstering: ");
			this.Reupholstering = S.nextLine();
		} else {
			this.ExtraCushion = "nil";
			this.Reupholstering = "nil";
		}
		System.out.print("Fine Polishing: ");
		this.FinePolishing = S.nextLine();
		System.out.println();
	}

	void putCustomization() {
		System.out.println("Extra Cushioning: " + ExtraCushion);
		System.out.println("Reupholstering: " + Reupholstering);
		System.out.println("Fine Polishing: " + FinePolishing);
		System.out.println();
	}
}

class Transport extends CustomizeFurniture {
	protected int charges;

	void transportCharges(double d) {
		if (d < 5) {
			charges = 0;
		} else {
			charges = 500;
		}
	}

	void ShowDetails() {
		super.putCustomerDetails();
		super.putCustomization();
		transportCharges(super.DistanceFromShop);
		System.out.println("Transportation Charges: " + charges);
		System.out.println();

	}

	

	public static void main(String[] args) {
		Transport T = new Transport();
		T.getFurnitures();
		T.getCustomerDetails();
		T.doCustomization();

		T.ShowDetails();

	}
}
