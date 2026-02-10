import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String soal = sc.next(); // Soal1, Soal2, dst

        switch (soal) {

            // ================= SOAL 1 =================
            case "Soal1": {
                int a = sc.nextInt();
                int b = sc.nextInt();

                if ((a > 0 && b > 0 && a > Integer.MAX_VALUE - b) ||
                    (a < 0 && b < 0 && a < Integer.MIN_VALUE - b)) {
                    System.out.println("OVERFLOW");
                } else {
                    System.out.println(a + b);
                }
                break;
            }

            // ================= SOAL 2 =================
           case "Soal2": {
             double x = sc.nextDouble();
              double y = sc.nextDouble();

                // hitung pakai float (dipaksa dari awal)
                float fx = (float) x;
                float fy = (float) y;
                float sumFloat = fx + fy;

                // hitung pakai double
                double sumDouble = x + y;

                double diff = Math.abs(sumDouble - sumFloat);

                System.out.printf("%.6f%n", diff);
                break;
            }

            // ================= SOAL 3 =================
            case "Soal3": {
                int n = sc.nextInt();

                Integer a = n;
                Integer b = a;
                a = a + 1;

                System.out.println("==: " + (a == b));
                System.out.println("equals: " + a.equals(b));
                break;
            }

            // ================= SOAL 4 =================
            case "Soal4": {
                String s = sc.next();

                String a = s;
                String b = new String(s);

                a = a + "X";

                System.out.println("==: " + (a == b));
                System.out.println("equals: " + a.equals(b));
                break;
            }

            // ================= SOAL 5 =================
            case "Soal5": {
                int i = Integer.parseInt(sc.next());
                double d = Double.parseDouble(sc.next());
                boolean flag = Boolean.parseBoolean(sc.next());

                double result = i * d;
                if (!flag) result *= -1;

                System.out.printf("%.2f%n", result);
                break;
            }

            default:
                System.out.println("Soal tidak dikenali");
        }

        sc.close();
    }
}