import java.io.*;

public class Kuis1 {

    public static void main(String[] args) throws IOException{
        BufferedReader dataInput = new BufferedReader (new InputStreamReader(System.In));
        String kode[];
        String nama[];
        String jumlah[];

        System.out.println("Masukkan kode barang = ");
            kode[] = dataInput.readLine();
        System.out.println("Masukkan nama barang = ");
            nama[] = dataInput.readLine();
        System.out.println("Masukkan jumlah barang = ");
            jumlah[] = dataInput.readLine();
        
    }
}