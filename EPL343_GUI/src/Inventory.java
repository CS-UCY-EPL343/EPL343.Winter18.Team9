import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Inventory {

	
	String barcode,quantity,weight,volume,supplier;
	
	
//	private final SimpleStringProperty barcode;
//	private final SimpleStringProperty quantity;
//	private final SimpleStringProperty weight;
//	private final SimpleStringProperty volume;
//	private final SimpleStringProperty supplier;
	
	public Inventory(String barcode, String quantity, String weight, String volume, String supplier) {
//		this.barcode = new SimpleStringProperty(barcode);
//		this.quantity = new SimpleStringProperty(quantity);
//		this.weight = new SimpleStringProperty(weight);
//		this.volume = new SimpleStringProperty(volume);
//		this.supplier = new SimpleStringProperty(supplier);
		this.barcode = barcode;
		this.quantity = quantity;
		this.weight = weight;
		this.volume = volume;
		this.supplier = supplier;
	}
	
	public String getBarcode() {
		return barcode;
	}

	public String getQuantity() {
		return quantity;
	}

	public String getWeight() {
		return weight;
	}

	public String getVolume() {
		return volume;
	}

	public String getSupplier() {
		return supplier;
	}
	
}