import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double muzf=0.95,patlicanf=5,elmaf=3.67,armutf=2.14,domatesf=1.11;
        double muzk,patlicank,elmak,armutk,domatesk,fiyat;
        Scanner input=new Scanner(System.in);
        System.out.print("Armut kaç kilo: ");
        armutk=input.nextDouble();
        System.out.print("Muz kaç kilo: ");
        muzk=input.nextDouble();
        System.out.print("Patlıcan kaç kilo: ");
        patlicank=input.nextDouble();
        System.out.print("Elma kaç kilo: ");
        elmak=input.nextDouble();
        System.out.print("Domates kaç kilo: ");
        domatesk=input.nextDouble();
        fiyat=(armutf*armutk)+(elmaf*elmak)+(domatesf*domatesk)+(patlicanf*patlicank)+(muzf*muzk);
        System.out.print("Ürünlerin toplam fiyatı: "+fiyat+" Türk Lirası");
    }
}