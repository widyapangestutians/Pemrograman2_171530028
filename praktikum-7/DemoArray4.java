public class DemoArray4 {

    public static void main(String[]args) {
        NumberFormat nf=NumberFrmat.getInstance();
        nf.SetMaximumFractionDigits(2);
        int nilai[][]=new int[2][0];
        nilai[0][0]=85;
        nilai[0][1]=80;
        nilai[0][2]=78;
        nilai[1][0]=65;
        nilai[1][1]=73;
        nilai[1][2]=71;

        String MK[]=("Pemrograman 2\t", "Konsep basis data");
        double ratarataMK[]=new double[nilai.length];

        for (int i=0; i<nilai.length; i++){
            for (int j=0; j<nnilai.length; j++){
                ratarataMk[i]+=nilai[i][j];
            }
            ratarataMK[i]/=nilai[0].length;
        }

        System.out.println("Nilai Mata Kuliah\n");
        System.out.println("Mata Kuliah\t\tMinggu1\tMinggu2\tMinggu3\tRata-rata");

        for (int i=0; i<nilai.length; i++){
            System.out.print(MK[i] + "\t");
            for (int j=0; j<nnilai.length; j++){
                System.out.println(nilai[i][j] + "\t");
            }
            ratarataMK[i]/=nilai[0].length;
        }
    }
}