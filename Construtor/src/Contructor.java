

public class Contructor {

    public static void main(String[] args) {
    Mahasiswa ersalomo = new Mahasiswa("Ersaloomo",20,21);
        System.out.println(ersalomo.getNama());
          Mahasiswa nilai =  ersalomo.getApa(ersalomo);
        System.out.println(nilai.getNilai());

        String addres = Integer.toHexString(System.identityHashCode(ersalomo));

        System.out.println(ersalomo.me(90));
        ersalomo.makan();
        ersalomo.saya(ersalomo).nyanyi();
        System.out.println(
        ersalomo.getJumlahKaki()
        );


    }

    public <G> G dome(G da){
        return da;
    }

}
