import java.io.*;

public class PostTest_1 {

    public static void main(String[] args) {

        BufferedReader dataInput = new BufferedReader (new InputStreamReader(system.in));

        int menu;
        String kodebarang[] = new String[50];
        String namabarang[] = new String[50];
        float harga[] = new float[50];
        int jumlah[] = new int[50];
        String pilih = "";
        boolean status1 = false;
        boolean status2 = false;
        int x = 0;

        System.out.println(" .: Menu App :.");
        System.out.println("(1) Input data barang");
        System.out.println("(2) Cetak data barang");

        System.out.priintln("Pilih menu : ");
        menu = Integer.parseInt(dataInput.readLine());

            if(menu == 1){
                do{
                    System.out.println("Masukan kode barang : ");
                    kodebarang[x] = dataInput.readLine();
                    System.out.prntln("Masukan nama barang : ");
                    namabarang[x] = dataInput.readline();
                    System.out.println("Masukan harga : ");
                    harga[x] = Float.parseFloat(dataInput.readLine());
                    System.out.println("Masukan jumlah : ");
                    jumlah[x] = Integer.parseInt(dataInput.readLine());

                    System.out.println("Apakah akan melakukan input lagi? : Y/N")
                    pilih = dataInput.readLine();
                    if(pilih.equals("Y")){
                        status1 = true;
                        x++;
                    }else{
                        status1 = false;
                        status2 = true;
                    }
                }while(status1);
            }else if(menu == 2){
                for(int i = 0; i<kodebarang.length; i++;){

                    if (kodebarang[1].equals("")){
                        System.out.println("Kode barang : " + kodebarang);
                        System.out.println("Kode barang : " + namabarang);
                        System.out.println("Harga : " + harga);
                        System.out.println("Jumlah : " + jumlah);
                    }else{
                        break;
                    }
                }
            }
        }while(status2);
    }
}