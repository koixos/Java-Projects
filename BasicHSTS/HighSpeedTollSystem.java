import java.util.Scanner;
import java.lang.Math;
import java.util.concurrent.TimeUnit;

public class HighSpeedTollSystem {
    private final Scanner inp = new Scanner(System.in);
    private final RandomInfo info = new RandomInfo();
    private int totalCount;

    public int getTotalCount() {
        return totalCount;
    } /* END OF getTotalCount */

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    } /* END OF setTotalCount */

    public void start() {
        Car car;
        Booth booth;
        Administration administration;

        System.out.print("\n######################################################################################################################\n\t\t\t\t\t\t\t\t\t\t\tHIZLI GEÇIŞ SISTEMI SIMULASYONU\n######################################################################################################################\n\t& Bu projede boğazlardan geçiş yaparken kullanılan ücretlendirme sistemi HGS'yi simüle edeceğiz.\n\t& Belirlediğiniz sayı kadar araç, oluşturulacak rastgele bilgilerle (ad-soyad, hgs no, bakiye, araç sınıfı) HGS'den geçmiş varsayılacak.\n\t& Geçen her bir araç bir diziye kaydolacak ve geçiş ücreti aracın sınıfına göre bakiyesinden tahsil edilecek.\n\t& Araç geçişi tamamlandıktan sonra Admin Panelinden bu araçları listeleyebilir ve günlük kazancı görebilirsiniz.\n\t& Daha gerçekçi sonuçlar için \"HighSpeedTollSystem.java\" sınıfındaki kodu yorumdan çıkarıp araçlar arasına bekleme süresi ekleyebilirsiniz.\n");

        do {
            try {
                System.out.print("\nTest için geçiş yapacak araba sayısı: ");
                this.setTotalCount(inp.nextInt());
                if (this.getTotalCount() > 0)
                    break;
                else System.out.print("Lütfen geçerli bir sayı giriniz.\n");
            } catch (Exception e) {
                inp.nextLine();
                System.out.print("Lütfen geçerli bir sayı giriniz.\n");
            } finally {
                System.out.print("----------------------------------------------------------------------------------------------------------------------");
                System.out.print("");
            }
        } while(true);

        booth = new Booth(this.getTotalCount());
        for (int i = 0; i < this.getTotalCount(); i++) {
            car = this.createRandomCar(this.createRandomSelection());
            booth.payment(car);
            booth.keepPassing(car, i);
            /**
             * To add delay between cars, you may want to uncomment this code.

             try {
                TimeUnit.SECONDS.sleep(1);
             } catch (InterruptedException e) {
                throw new RuntimeException(e);
             }  */
        }
        System.out.print("\nBütün araçlar başarıyla geçiş yaptı.");

        administration = new Administration(booth);
        administration.adminPanel();
    } /* END OF start */

    public Car createRandomCar(int selection) {
        // This function creates random cars with random info
        return switch (selection) {
            case 1 -> new Class1(
                    this.info.createRandomHSTSNumber(),
                    this.info.selectRandomName(this.info.getArrOfRandomNames()),
                    this.info.selectRandomName(this.info.getArrOfRandomSurnames()),
                    this.info.createRandomBalance()
            );
            case 2 -> new Class2(
                    this.info.createRandomHSTSNumber(),
                    this.info.selectRandomName(this.info.getArrOfRandomNames()),
                    this.info.selectRandomName(this.info.getArrOfRandomSurnames()),
                    this.info.createRandomBalance()
            );
            case 3 -> new Class3(
                    this.info.createRandomHSTSNumber(),
                    this.info.selectRandomName(this.info.getArrOfRandomNames()),
                    this.info.selectRandomName(this.info.getArrOfRandomSurnames()),
                    this.info.createRandomBalance()
            );
            default -> null;
        };
    } /* END OF createCar */

    public int createRandomSelection() {
        return (int)(Math.random() * 3) + 1;
    } /* END OF createRandomSelection */
}