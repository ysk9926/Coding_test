package Bronze;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class pr_4153 {
    public static void main(String[] args) throws FileNotFoundException {
        File inputfile = new File("src/Bronze/Input/4153.txt");
        Scanner sc = new Scanner(inputfile);

        while (true) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            if(x == 0 && y == 0 && z == 0) break;

            int longX = x*x - y*y - z*z;
            int longY = y*y - x*x - z*z;
            int longZ = z*z - y*y - x*x;

            if(longX == 0 || longY == 0 || longZ == 0) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}
