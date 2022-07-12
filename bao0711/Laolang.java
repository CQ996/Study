package bao0711;

import java.util.Scanner;

public class Laolang {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("老狼老狼几点了？");
        int answer=input.nextInt();
        while (answer!=12){
            System.out.println("老狼没抓到人，继续抓人");
            answer=input.nextInt();
        }
        System.out.println("12点了，老狼抓到了人");
    }
}
