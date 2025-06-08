public class Pembeli extends User {
    private Cart keranjang;

    public Pembeli(String username, String password) {
        super(username, password, "Pembeli");
        this.keranjang = new Cart();
    }
    
    public Cart getCart() {
        return keranjang;
    }
}
