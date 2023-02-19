import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner inp= new Scanner(System.in);
        System.out.print("Matematik notunuz= ");
        mat=inp.nextInt();

        System.out.print("fizik notunuz= ");
        fizik=inp.nextInt();

        System.out.print("kimya notunuz= ");
        kimya=inp.nextInt();

        System.out.print("turkce notunuz= ");
        turkce=inp.nextInt();

        System.out.print("tarih notunuz= ");
        tarih=inp.nextInt();

        System.out.print("muzik notunuz= ");
        muzik=inp.nextInt();

        int toplam=mat+fizik+turkce+tarih+muzik+kimya;
        double sonuc=toplam/6;

        System.out.print("ortalamanız="+sonuc);

        boolean kosul= sonuc>=60;

        String snc= kosul ? "sınıfı geçtiniz" : "kaldınız";

        System.out.println(snc);



    }
}