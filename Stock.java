
public class Stock {

	long price;
	Integer quantity;
	
	public Stock() {
	}
	
	public Stock (long price, Integer qty){
		this.price = price;
		quantity = qty;
	}
	
	public long getPrice() {
		return this.price;
	}
	public Integer getQuantity() {
		return this.quantity;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public void setQty(Integer qty) {
		this.quantity = qty;
	}
	
}
