import javax.swing.JOptionPane;

public class InputJOptionPane{

    public static void main( String[] args ) throws IOException{

            String nim="", nama="", tempat="", tgllahir="";

            nama = JOptionPane.showInputDialog("Masukkan Nama Anda : ");
            nim = JOptionPane.showInputDialog("Masukkan NIM Anda : ");
            tempat = JOptionPane.showInputDialog("Masukkan Tempat Lahir Anda : ");
            tgllahir = JOptionPane.showInputDialog("Masukkan Tanggal Lahir Anda : ");
            
    }
}