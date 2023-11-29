package tahap2pbo;

import java.util.Date;

public class TransaksiPeminjaman {
    public String id;
    public Date tanggalPeminjaman;
    public Date tanggalJatuhTempo;
    public String waktu;
    public int durasiPeminjaman;
    public AnggotaPerpustakaan anggota;
    public Buku buku;

    public TransaksiPeminjaman(String id, Date tanggalPeminjaman, Date tanggalJatuhTempo,
            String waktu, int durasiPeminjaman, AnggotaPerpustakaan anggota, Buku buku) {
        this.id = id;
        this.tanggalPeminjaman = tanggalPeminjaman;
        this.tanggalJatuhTempo = tanggalJatuhTempo;
        this.waktu = waktu;
        this.durasiPeminjaman = durasiPeminjaman;
        this.anggota = anggota;
        this.buku = buku;
    }

    public Buku getBuku() {
        return buku;
    }

    public Date getTanggalJatuhTempo() {
        return tanggalJatuhTempo;
    }

    public void setTanggalJatuhTempo(Date tanggalJatuhTempo) {
        this.tanggalJatuhTempo = tanggalJatuhTempo;
    }

    public void catatPeminjaman() {
        if (tanggalPeminjaman != null) {
            System.out.println(anggota.getNama() + "melakukan peminjaman buku " + buku.getJudulBuku() + " pada " + tanggalPeminjaman + " (" + waktu + ").");
        } else {
            System.out.println("Transaksi peminjaman belum tercatat ");
        }
    }

    public void catatPengembalian() {
        if (tanggalJatuhTempo != null) {
            System.out.println(anggota.getNama() + "melakukan pengembalian buku " + buku.getJudulBuku() + " pada " + tanggalJatuhTempo + ".");
        } else {
            System.out.println("Transaksi pengembalian belum tercatat ");
        }
    }
}
