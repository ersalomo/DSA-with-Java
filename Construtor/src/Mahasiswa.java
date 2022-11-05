public class Mahasiswa extends MaklukHidup implements Manusia {
    private String nama;
    private int umur;
    private int nilai;
    public Mahasiswa(String nama, int umur,int nilai){
        this.nama = nama;
        this.umur = umur;
        this.nilai = nilai;
    }
    public String getNama(){
        return this.nama;
    }
    public int getNilai(){
        return this.umur;
    }
    public Mahasiswa getApa(Mahasiswa mahasiswa){
        return mahasiswa;
    }
    public  <T> T me(T data){
        return data;
    }

    @Override
    public void  makan() {
        System.out.println(this.nama + " "+ "Minum");

    }

    @Override
    public void minum() {
        System.out.println(this.nama + " "+ "Hallo sata minum");
    }

    @Override
    public void nyanyi() {
        System.out.println(this.nilai +   "Nila");
    }

    @Override
    public <T> T saya(T object) {
        return object;
    }

    @Override
    public int getJumlahKaki(){
        return this.jumlahKaki;
    }

}
