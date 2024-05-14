public class Main {
    public static void main(String[] args) {
        // Instansiasi dari masing-masing konkret class
        Civitas civitas = new Civitas("Civitas Kendall", 30, true);
        Dosen dosen = new Dosen("Dosen Taylor", 35, true, "123456", 15000000);
        Mahasiswa mahasiswa = new Mahasiswa("Mahasiswa Gavi", 20, true, "210123456", 3.75, 5);
        Asprak asprak = new Asprak("Asprak Finneas", 21, false, "210654321", 3.80, 4);
        Resepsionis resepsionis = new Resepsionis("Resepsionis Timothee", 25, false, 123, "Senior", 5000000);

        // Instansiasi dengan konsep upcasting
        PesertaKelas pesertaDosen = dosen;
        PesertaKelas pesertaMahasiswa = mahasiswa;
        PesertaKelas pesertaAsprak = asprak;
        PesertaKelas pesertaResepsionis = resepsionis;

        // Menjalankan metode dari setiap instansiasi konkret class
        civitas.makanDiKantin("A");
        civitas.naikLift();
        civitas.masukKelas();

        dosen.ikutPenelitian();
        pesertaDosen.masukKelas();

        mahasiswa.ngerjainTugas();
        mahasiswa.mengikutiOrganisasi("BEM");
        mahasiswa.presentasi();
        mahasiswa.mengajar("Matematika");
        mahasiswa.mengasihTugas();
        mahasiswa.menilaiTugas();
        pesertaMahasiswa.masukKelas();

        asprak.ngasihKomenDiGCR();
        pesertaAsprak.masukKelas();

        resepsionis.melayani();
        resepsionis.melapor();
        pesertaResepsionis.masukKelas();
    }
}