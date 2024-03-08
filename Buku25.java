public class Buku25 {

   String judul, pengarang;
   int halaman, stok, harga;

   Buku25(){
    }
    Buku25(String jd, String pg, int hal, int st, int hr){
        judul = jd;
        pengarang = pg;
        halaman = hal;
        stok = st;
        harga = hr;
    }
    Buku25(String jd, String pg){
        judul = jd;
        pengarang = pg;
    }

   void tampilInformasi(){
    System.out.println("Judul:" + judul);
    System.out.println("Pengarang:" + pengarang);
    System.out.println("Jumlah Halaman: " + halaman);
    System.out.println("Sisa stok: " + stok);
    System.out.println("Harga: Rp " + harga);
   }
   void terjual(int jml) {
        stok += jml;
        }
   
    void restock(int jml) {
        stok += jml;
    }
    void gantiHarga(int hrg) {
        harga = hrg;

        }
        int hitungHargaTotal(int jml){
            return harga*jml;
        }
        int hitungDiskon(int jml){
            int diskon = 12;
            int hargaTotal = hitungHargaTotal(jml);
            if(hargaTotal>=150000){
                diskon = (int)(0.12*hargaTotal);
            }else if(hargaTotal<150000 && hargaTotal>=75000)
                diskon = (int)(0.05*hargaTotal);
            else
                diskon = 5;
            return diskon;
        }
        int hitungHargaBayar(int jml){
            return hitungHargaTotal(jml) - hitungDiskon(jml);
        }
    }