package tekrarlarDigerKaynaklar;

public static boolean TcKimlikKontrol(String kimlikNo)
{
    // değişkenler
    int tekHaneler = 0;
    int ciftHaneler = 0;
    int kural;
    int toplam = 0;
    
    // 1. kural 11 hane kontrolü
    if (kimlikNo.length() < 11) {
        return false;
    }
    // 2. kural 0 ile başlayamaz 
    if (kimlikNo.startsWith("0")) {
        return false;
    }
    // diğer kurallar için rakamlar tek tek parse edilip diziye atılır
    char arrChar[] = kimlikNo.toCharArray();
    int[] arr = new int[arrChar.length];
    for (int i = 0; i < arrChar.length; i++) {
        arr[i] = Integer.parseInt(arrChar[i] + "");
    }
    // 3. kural son rakam tek olamaz. çift sayı kontrolü için mod 2 uygulanır ve kalan o dan farklı ise geçersiz sayılır.
    if (arr[10] % 2 != 0) {
        return false;
    }
    // 4. kural ilk dokuz rakamdan tek haneler ile çift haneler toplamı
    for (int i = 0; i < 9; i++) {
        toplam += arr[i];
        if ((i % 2) == 0) {
            // TC kimlik numarasının 1,3,5,7,9 toplamı
            tekHaneler += arr[i];
        } else {
            // TC kimlik numarasının 2,4,6,8 toplamı
            ciftHaneler += arr[i];
        }
    }
    
    // ilk on hanenin toplamı 5.kuralda kullanacağız.
    toplam += arr[9];

    kural = ((tekHaneler * 7) - ciftHaneler);
    // 4. kurala göre kural değişkeninde kalan değerin mod 10'nu alındığında kalan T.C. Kimlik Numarasının onuncu hanesi vermeli. farklı ise şartı sağlamadığını gösterir
    if (kural % 10 != arr[9]) {
        return false;
    }
    // 5. kural T.C. Kimlik numarasının ilk on hanesinin toplamının mod 10'nundan kalan T.C. Kimlik numarasının 11. hanesine eşittir. Değilse şart sağlanmamış demektir.
    if ((toplam % 10) != arr[10]) {
        return false;
    }
    // yukarıda olumsuz bir durum yoksa demekki gelen T.C. Kimlik Numarası doğrudur.
    return true;
    
	}
}
