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
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Bukumodif bk2 = new Bukumodif("Self Reward", "maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Bukumodif bukuXavier = new Bukumodif("The story of majid", "Erwan Majid", 170, 30, 100000);
        bukuXavier.terjual(11);
        bukuXavier.tampilInformasi();
    }
}
