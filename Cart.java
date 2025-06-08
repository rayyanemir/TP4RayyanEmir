public class Cart {
    private CartProduct[] items;
    private int itemCount;
    private static final int INITIAL_CAPACITY = 10;

    public Cart() {
        this.items = new CartProduct[INITIAL_CAPACITY];
        this.itemCount = 0;
    }

    public String addToCart(Product product, int quantity) {
        if (product.getProductStock() < quantity) {
            return "Stok produk tidak mencukupi!";
        }

        // Check if product already exists in cart
        for (int i = 0; i < itemCount; i++) {
            if (items[i].getProductId().equals(product.getProductId())) {
                items[i].increaseAmount(quantity); //menambah barang
                return "Produk berhasil ditambahkan ke keranjang!";
            }
        }

        // Resize array if needed
        if (itemCount == items.length) {
            CartProduct[] newArray = new CartProduct[items.length * 2];
            System.arraycopy(items, 0, newArray, 0, items.length);
            items = newArray;
        }

        // Add new product
        items[itemCount++] = new CartProduct(product.getProductId(), quantity);
        return "Produk berhasil ditambahkan ke keranjang!";
    }

    public String deleteFromCart(UUID productId) {
        for (int i = 0; i < itemCount; i++) {
            if (items[i].getProductId().equals(productId)) {
                System.arraycopy(items, i + 1, items, i, itemCount - i - 1);
                items[--itemCount] = null;
                return "Produk berhasil dihapus dari keranjang!";
            }
        }
        return "Produk tidak ditemukan di keranjang.";
    }

    public CartProduct[] getCartItems() {
        CartProduct[] result = new CartProduct[itemCount];
        System.arraycopy(items, 0, result, 0, itemCount);
        return result;
    }

    public boolean isEmpty() {
        return itemCount == 0;
    }
}
