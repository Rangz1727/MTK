/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Morganz
 */
import java.util.Scanner;

public class MatematikaCanggihBeraksi {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MatematikaCanggih mtk = new MatematikaCanggih();
         System.out.print("masukan angka 1 : ");
         int a = input.nextInt();
         System.out.print("masukan angka 2 : ");
         int b = input.nextInt();
         System.out.println("hasil pertambahan : " + mtk.pertambahan(a,b));
         System.out.println("hasil perkalian : " + mtk.perkalian(a, b));
         System.out.println("hasil modulus : " + mtk.modulus(a, b));
         
     }
     
}
