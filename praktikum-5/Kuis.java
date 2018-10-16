import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Kuis {
    public static void main(String[] args) {
        
        BufferedReader dataInput = new BufferedReader (new InputStreamReader(System.in));

        String id_user="", pass="";

        while(true){

            System.out.print("ID.User : ");
                try{        // try and catch untuk menangkap pesan error
                    id_user = dataInput.readLine();
                }catch( IOException e){             
                    System.out.println("Error!");
                }

            System.out.print("Password : ");
                try{        // try and catch untuk menangkap pesan error
                    pass = dataInput.readLine();
                }catch( IOException e){             
                    System.out.println("Error!");
                }

            if (id_user.equals("171530028") && pass.equals("mahasiswa123")){
                System.out.println("Selamat datang... " + id_user);
                break;
            }else if(id_user.equals("171530028") == false) {
                System.out.println("ID.User salah");
            }else if(pass.equals("mahasiswa123") == false) {
                System.out.println("Password salah");
            }
            
        }
    }
}