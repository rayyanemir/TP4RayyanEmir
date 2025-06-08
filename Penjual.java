public class Penjual extends User {
    private ProductRepository productRepo;
    private String namaToko;

    public Penjual(String username, String password, String namaToko) {
        super(username, password, "Penjual");
        this.productRepo = new ProductRepository(namaToko);
    }

    public ProductRepository getRepo() {
        return productRepo;
    }
    
}
