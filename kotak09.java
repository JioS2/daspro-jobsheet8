import java.util.Scanner;
public class kotak09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = sc.nextInt();

        if (N < 3) {
            System.out.println("Nilai N minimal 3.");
        } else {
            // Perulangan luar untuk baris
            for (int i = 0; i < N; i++) {
                // Perulangan dalam untuk kolom
                for (int j = 0; j < N; j++) {
                    // Kondisi untuk mencetak angka di tepi luar persegi
                    if (i == 0 || i == N - 1 || j == 0 || j == N - 1) {
                        System.out.print(N + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println(); // Pindah ke baris berikutnya
            }
        }

    }
}
