import java.io.*;

public class CaseLogin {

    public static void main(String[] args){

        String id_user="", pass="";

        BufferedReader dataInput = new BufferedReader(new InputStreamReader(System.in));

        do{
            System.out.println("Masukan ID.User = ");
            id_user = dataInput.readLine();

            System.out.println("Masukan Password = ");
            pass = dataInput.readLine();

            if(id_user.equals("171530028")){
                System.out.println("ID.User yang Anda masukkan salah");
            }else{
                if(pass.equals("mahasiswa123")){
                    System.out.println("Password yang anda masukkan salah");
                }else{
                    status = false;
                }
            }
        }while(status);

        System.out.println("Selamat datang : " + id_user);

    }
}