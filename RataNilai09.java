import java.util.Scanner;
public class RataNilai09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i,j;
        float nilai, totalNilai=0, rataNilai=0;
        
        i=1;
        while (i<=5) {
            System.out.println("Input nilai mahasiswa ke- " + i);
            for (j=1; j<=5; j++) {
            System.out.print("Nilai ke-" + j + " = ");
            int nilaiMhs = sc.nextInt();
            totalNilai+=nilaiMhs;
            }
            rataNilai=totalNilai/5;
            System.out.println("total nilai Mahasiswa = " + totalNilai);
            System.out.println("rataan nilai Mahasiswa = " + rataNilai);
            i++;
        }
        
    }
}
