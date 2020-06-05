package javaapplication10;

public class JavaApplication10 {
static int sayi = 25; //burada sayi değişkenini 25
//olarak belirledik
static int bolen = 4;   //burada sayi değişkenini
// 4 olarak belirledik
 public static void main(String[] args) {  
     
   int bolum = sayi / bolen; //bölüm adında değişken tanımladık
   //bu değişken sayi ile bölen değişkenlerini bölecek
   int kalan = sayi % bolen;//kalan adında değişken tanımladık
   //bu değişken sayi ile bölen değişkenlerinden kalanı gösterecek.

        System.out.println("İşlem:"+sayi+"/"+bolen);
     //ekrana işlem: sayi değişkeni ile bölen değişkeni değerlerini
     //bölüp ekrana yazdıracak
        System.out.println("Bölüm = " + bolum);
     //ekrana bölüm: bölüm değişkenini ekrana yazdıracak
        System.out.println("Kalan = " + kalan);
    //ekrana bölüm: kalan değişkenini ekrana yazdıracak
    }
    
}
