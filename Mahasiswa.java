class Mahasiswa extends Civitas implements Pengajar {
    private String nim;
    private double ipk;
    private int golUkt;

    public Mahasiswa(String nama, int umur, boolean jenisKelamin, String nim, double ipk, int golUkt) {
        super(nama, umur, jenisKelamin);
        this.nim = nim;
        this.ipk = ipk;
        this.golUkt = golUkt;
    }
    
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
    
    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }
    
    public int getGolUkt() {
        return golUkt;
    }

    public void setGolUkt(int golUkt) {
        this.golUkt = golUkt;
    }

    public void ngerjainTugas() {
        System.out.println(getNama() + " Mengerjakan Tugas.");
    }

    public void pasrah() {
        System.out.println(getNama() + " Pasrah.");
    }

    public void mengikutiOrganisasi(String organisasi) {
        System.out.println(getNama() + " Mengikuti Organisasi " + organisasi);
    }

    public void presentasi() {
        System.out.println(getNama() + " Presentasi.");
    }

    @Override
    public void mengajar(String matkul) {
        System.out.println(getNama() + " Mengajar Mata Kuliah " + matkul);
    }

    @Override
    public void mengasihTugas() {
        System.out.println(getNama() + " Mengasih Tugas.");
    }

    @Override
    public void menilaiTugas() {
        System.out.println(getNama() + " Menilai Tugas.");
    }
}