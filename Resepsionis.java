class Resepsionis extends Civitas {
    private int idResepsionis;
    private String jabatan;
    private double gaji;

    public Resepsionis(String nama, int umur, boolean jenisKelamin, int idResepsionis, String jabatan, double gaji) {
        super(nama, umur, jenisKelamin);
        this.idResepsionis = idResepsionis;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    public int getIdResepsionis() {
        return idResepsionis;
    }

    public void setIdResepsionis(int idResepsionis) {
        this.idResepsionis = idResepsionis;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void melayani() {
        System.out.println(nama + " Melayani Tamu.");
    }

    public void melapor() {
        System.out.println(nama + " Melapor.");
    }
}