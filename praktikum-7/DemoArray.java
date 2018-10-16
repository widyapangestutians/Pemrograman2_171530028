public class DemoArray {

    public static void main(String[] args) { //method main -> 
        System.out.println("\nContoh 1 \n");
        String nama[] = new String[5]; //deklarasi var array dan pemberian panjang array
        nama[0] = "Andi Novianto"; // pemberian nilai array var nama pada elemen ke-0
        nama[1] = "Zidna Aisya";
        System.out.println(nama[0]);
        System.out.println(nama[1]);
        System.out.println(nama[2]);

        System.out.println("\n Contoh 2 \n");
        int nilai[] = {75, 80, 90, 100}; //deklarasi array var nilai dng tipe data int dan diinisialisasikan
        System.out.println("Cetak nilai elemen 0 : "+nilai[0]);
        System.out.println("Cetak nilai elemen 0 : "+nilai[0]);
        System.out.println("Cetak nilai elemen 0 : "+nilai[0]);
        System.out.println("Cetak nilai elemen 0 : "+nilai[0]);
        int jumlah = nilai[1] + nilai[2] + nilai[3]; // deklarasi array var jumlah dgn tipe data int
        System.out.println("Jumlah Nilai elemen (1+2+3) : "+jumlah);
    }
}