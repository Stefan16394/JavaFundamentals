package P01_Generic_Box;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.valueOf(sc.nextLine());

        for (int i=0;i<n;i++)
        {
            Box box=new Box(sc.nextLine());
            System.out.println(box.toString());
        }
    }
}
