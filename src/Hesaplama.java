import java.util.Scanner;

public class Hesaplama {
    public static void main(String[] args) {
        // değişkenleri oluştur.
        int mat,fizik,kimya,türkçe,tarih,müzik;

        //scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        //kullanıcıdan değerleri al
        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();

            System.out.print("fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuz : ");
        türkçe = inp.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuz : ");
        müzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + türkçe + tarih + müzik);
        double sonuc = toplam / 6.0 ;

        System.out.println("Not ortalaması: "+sonuc);
        String str = 60.0 < sonuc? "Geçtin" : "Kaldın";
        System.out.println(str);




    }
}
