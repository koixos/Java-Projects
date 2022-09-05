public class RandomInfo {
    // These arrays will be used as random name&surname repositories.
    // Reference for random Turkish names & surnames: 'https://tosunkaya.com/araclar/ad-soyad/index.php'
    private final String[] arrOfRandomNames = {
            "Erhan Hüseyin", "Zekeriya", "Hamza", "Ece", "Mertay", "Ilker", "Tahsin Batuhan", "Muhammed", "Emine", "Aydın", "Burhan", "Aylin", "Sevil", "Hilal", "Nihal", "Didar", "Yusufcan", "Okyar", "Mustafa Gürhan", "Elif Ceren", "Nil", "Ebubekir" ,"Onur", "Hamdiye", "Seher", "Akif", "Berker", "Musa", "Kübra", "Erim", "Semih", "Ali Saip", "Atahan", "Eren", "Ahsen", "Merve", "Ülkü", "Atanur", "Hasan", "Faik", "Derya", "Tahacan", "Sırrı", "Emirhan", "Batu", "Naime", "Hisar", "Canan", "Petek", "Sezin", "Gülperi", "Pelin", "Ahmet Ali", "Mahmut", "Asiye", "Recep"
    };
    private final String[] arrOfRandomSurnames = {
            "Yılmaz", "Bahar", "Akduman", "Özcanlı", "Arhan", "Çobanyıldızı", "Karaağaçlı", "Canbolat", "Babaoğlu", "Sulak", "Dinç", "Madak", "Osman", "Balta", "Çeviker", "Çakmak", "Çobanoğlu", "Sorguç", "Kaynak", "Dede", "Hoşer", "Kopan", "Tahtacı", "Sarıca", "Kırhan", "Taşar", "Balsak", "Vatansever", "Baykoca", "Güneş", "Orhan", "Serbest", "Yazıcıoğlu", "Doğuş", "Şahinkaya", "Gülsün", "Aşık", "Baltalı", "Açıkgöz", "Keten", "Göktaş", "Saraylı", "Tayfun", "Demirkan", "Özyazıcı", "Orcan", "Şanverdi", "Gedikli", "Katran", "Hüseyni", "Tüfekçi", "Pınar", "Özzeybek", "Maden", "Inanç", "Akusta"
    };

    public String[] getArrOfRandomNames() {
        return arrOfRandomNames;
    } /* END OF getArrOfRandomNames */

    public String[] getArrOfRandomSurnames() {
        return arrOfRandomSurnames;
    } /* END OF getArrOfRandomSurnames */

    public int createRandomNumber(int arrLength) {
        // This function creates a random number as an array index.
        return (int)(Math.random() * arrLength);
    } /* END OF createRandomNumber */

    public String selectRandomName(String[] arr) {
        return arr[this.createRandomNumber(arr.length)];
    } /* END OF selectRandomName */

    public int createRandomHSTSNumber() {
        // Turkish HSTS numbers include 10 digits.
        // This function creates random 10-digit numbers without any currency.
        return (int)(Math.random() * 1100000000) + 1000000000;
    } /* END OF createRandomHSTSNumber */

    public double createRandomBalance() {
        // This function creates random balance for drivers range of 50 TL to 500 TL.
        return (Math.random() * 451) + 50;
    } /* END OF createRandomBalance */
}
