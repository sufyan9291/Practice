package barclays;

final class Cart {
	private final int cartId;
	private final String cartOwner;
	private final Item item;
	public Cart(int cartId, String cartOwner, Item item) throws CloneNotSupportedException {
		this.cartId = cartId;
		this.cartOwner = cartOwner;
		this.item = (Item)item.clone();
	}
	public int getCartId() {
		return cartId;
	}
	public String getCartOwner() {
		return cartOwner;
	}
	public Item getItem() throws CloneNotSupportedException {
		return (Item)item.clone();
	}
	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", cartOwner=" + cartOwner
				+ ", itemId=" + item.getItemId() + ", itemPrice=" + item.getPrice() + "]";
	}
}

class Item implements Cloneable{
	private int itemId;
	private double price;
	public Item(int itemId, double price) {
		this.itemId = itemId;
		this.price = price;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class ImmutablePractice {
	public static void main(String[] args) throws CloneNotSupportedException {
		Item i1 = new Item(101, 325);
		Cart c1 = new Cart(1, "sufyan", i1);
		System.out.println(c1);
		Item i2 = c1.getItem();
		i2.setPrice(2222);
		i1.setPrice(4444);
		System.out.println(c1);
	}

}
