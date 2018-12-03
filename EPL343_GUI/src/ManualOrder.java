public class ManualOrder {
	String barcode2,quantity2,weight2,volume2,supplier2;
	
	
//	private final SimpleStringProperty barcode;
//	private final SimpleStringProperty quantity;
//	private final SimpleStringProperty weight;
//	private final SimpleStringProperty volume;
//	private final SimpleStringProperty supplier;
	
	public ManualOrder(String barcode, String quantity, String weight, String volume, String supplier) {
//		this.barcode = new SimpleStringProperty(barcode);
//		this.quantity = new SimpleStringProperty(quantity);
//		this.weight = new SimpleStringProperty(weight);
//		this.volume = new SimpleStringProperty(volume);
//		this.supplier = new SimpleStringProperty(supplier);
		this.barcode2 = barcode;
		this.quantity2 = quantity;
		this.weight2 = weight;
		this.volume2 = volume;
		this.supplier2 = supplier;
	}
	
	public String getBarcode() {
		return barcode2;
	}

	public String getQuantity() {
		return quantity2;
	}

	public String getWeight() {
		return weight2;
	}

	public String getVolume() {
		return volume2;
	}

	public String getSupplier() {
		return supplier2;
	}
}
