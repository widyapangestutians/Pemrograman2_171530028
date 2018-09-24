//import library
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

    public class GetInputReader1 {

        public static void main( String[] args) {

            //deklarasi objek buffereReader dengan nama variabelnya dataIn
            BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

            String nim="", nama="";

            System.out.print("Masukkan Nama Anda : ");
            try{        // try and catch untuk menangkap pesan error
                nama = dataIn.readLine();
            }catch( IOException e){             
                System.out.println("Error!");
            }
            
            System.out.print("Masukkan NIM Anda  : ");
            try{
                nim = dataIn.readLine();
            }catch( IOException e){
                System.out.println("Error!");
            }

            System.out.println("");
            System.out.println("-----------------------------------------------------");
            System.out.println("-----------------------------------------------------");
            System.out.println("Selamat Datang " + nama);
            System.out.println("NIM : " + nim );
        }
    }