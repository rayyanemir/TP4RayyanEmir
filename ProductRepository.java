import java.util.Optional;

public class ProductRepository {
    private String namaToko;



    public ProductRepository(String namaToko) {
        this.namaToko = namaToko;
    }

    public Optional<Product> getProductByIdUUID(String id) {
        //TODO
        return null;
    }

    public String getNamaToko() {
        return this.namaToko;
    }

    public Product[] getProductList() {
        Product[] result = new Product[productCount];
        System.arraycopy(productList, 0, result, 0, productCount);
        return result;
    }
}
