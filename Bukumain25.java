public class Bukumain25 {
    public static void main(String[] args) {
        Buku25 bk1 = new Buku25();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.stok = bk1.stok-5;
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();
        System.out.println(bk1);

        Bukumodif bk2 = new Bukumodif("Self Reward", "maheera Ayesha", 160, 29, 59000);
        bk1.terjual(11);
        bk1.tampilInformasi();
        System.out.println("Harga yang terjual = "+bk1.hitungHargaTotal(bk1.stok));
        System.out.println("Diskon = "+bk1.hitungDiskon(bk1.stok));
        System.out.println("Bayar = "+bk1.hitungHargaBayar(bk1.stok));
         
        

        
    }
}
