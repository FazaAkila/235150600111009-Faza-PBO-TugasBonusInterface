class Dosen extends Civitas {
    private String nip;
    private double gaji;

    public Dosen(String nama, int umur, boolean jenisKelamin, String nip, double gaji) {
        super(nama, umur, jenisKelamin);
        this.nip = nip;
        this.gaji = gaji;
    }
    
    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void ikutPenelitian() {
        System.out.println(getNama() + " Ikut Penelitian.");
    }

    @Override
    public void masukKelas() {
        System.out.println(getNama() + " Masuk Kelas.");
    }
}
