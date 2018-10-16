public class DemoArray2 {

    public static void main(String args []) {
        //Contoh program pencarian

        String names[] = {"Adi", "Aji", "Abbi","Abdul", "Hasif"};
        String searchName = "Abbi";
        boolean foundName = false;
        for( int i=0; i< names.length; i++){ //perulangan for dgn inisialisasi awal i = 0, kondisi i < panjang var names
            if (names[i].equals(searchName)){
                foundName = true;
                break;
            }
        } 
        if(foundName){
            System.out.println( searchName + " found! ");
        }else{
           System.out.println( searchName + " not found ");
        }
    }
}