package Giris;

import java.util.Scanner;
public class Baslangic {
    public static void main(String[] args) {
       /*Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        𝜋 sayısını = 3.14 alınız.
        Formül : (𝜋 * (r*r) * 𝛼) / 360 */

        int r;
        double pi=3.14;
        int alfa;
        double alan;
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen r yi giriniz");
        r=input.nextInt();
        System.out.println("lutfen aciyi giriniz");
        alfa=input.nextInt();
        alan=(pi*(r*r)*alfa)/360;
        System.out.println(alan);




        }






    }

