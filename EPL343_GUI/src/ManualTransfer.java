public class ManualTransfer {
	String barcode, quantity;

	public ManualTransfer(String b, String q) {
		barcode = b;
		quantity = q;
	}

	public String getBarcode() {
		return barcode;
	}

	public String getQuantity() {
		return quantity;
	}
}
