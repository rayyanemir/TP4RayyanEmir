public class Burhanpedia {
    private static UserRepository userRepo; 
    private static TransaksiRepository transaksiRepo;


    public static UserRepository getUserRepo() {
        return userRepo;
    }

    public TransaksiRepository getTransaksiRepo() {
        return transaksiRepo;
    }

}
