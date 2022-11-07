class Manusia{
    constructor({nama,usia,berat}) {
        this.nama = nama;
        this.usia = usia;
        this.berat = berat
    }
}



const ersalomo = new Manusia({
    nama : 'Ersalomo',
    usia:20,
    berat:45
})
ersalomo.asal = 'Medan'
console.log(ersalomo.berat)
console.log(ersalomo.asal)