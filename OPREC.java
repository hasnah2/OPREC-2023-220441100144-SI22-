/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hasnah.oprec;

/**
 *
 * @author hasna
 */
import java.util.Scanner;

class NasiBiasa{
    int angka;
    public void Rice(){
        System.out.println("apakah anda ingin menambah nasi dengan harga 3000?y/t");
        Scanner Scanner = null;
        var input=Scanner.nextLine();
        int d=3000;
        int a=5000;
        var total=a+d;
        switch(input){
            case "y":
            System.out.println(a+d);
            case "t":
                System.out.println("");
                break;
    }
        if(total>30000){
            System.out.println("anda mendapatkan diskon 3%"+total*3/100);
        }else if (total >70000){
            System.out.println("anda mendapatkan diskon 7%"+total*7/100);
        }else{
            System.out.println("mianhe");
        }  
        System.out.println("masukkan kode promo jika ada");
        var pilih=Scanner.nextLine();
        switch(pilih){
            case->"GEPREK17";
        }

    }
    
}

public class OPREC {

    public static void main(String[] args) {
        System.out.println("AYAM GEPREK KAMAL");
        System.out.println("=====MENU========");
        System.out.println("1. Biasa : 5000");
        System.out.println("2. Double : 7000");
        System.out.println("3. Special : 9000");
        Scanner Scanner = null;
        int pilihan=Scanner.nextInt();

       
        NasiBiasa nasi=new NasiBiasa();
        switch(pilihan){
            case 1-> System.out.println("anda memilih menu biasa seharga 5000 ");
            case 2-> System.out.println("anda memilih menu double seharga 7000 ");
            case 3-> System.out.println("anda memilih menu special seharga 9000 ");
            default->{
                System.out.println("terimakasih");
                break;
            }
        }
        
        
        
    }  
        
    }
   

