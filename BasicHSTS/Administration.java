import java.util.Scanner;

public class Administration {
    private final Scanner inp = new Scanner(System.in);
    private final Booth booth;
    private double totalBalance;

    public Administration(Booth booth) {
        this.booth = booth;
        this.totalBalance = 0;
    } /* END OF Administration */

    public double getTotalBalance() {
        return totalBalance;
    } /* END OF getTotalBalance */

    public void adminPanel() {
        int selection;
        System.out.print("\n======================================================================================================================\n\t\t\t\t\t\t\t\t\t\t<-- Yönetici Paneline Hoşgeldiniz -->\n======================================================================================================================");
        this.calculateTotalBalance(this.booth.getArrOfCar());
        do {
            try {
                System.out.print("\n\t$ MENÜ: \n\t  1. Gün Içerisinde Geçiş Yapan Araçları Listele\n\t  2. Toplam Bakiye\n\t  3. Çıkış\n\nSeçim: ");
                selection = inp.nextInt();
                if (selection == 1)
                    this.report();
                else if (selection == 2)
                    System.out.print("\n$ Toplam bakiye: " + String.format("%.2f", this.getTotalBalance()) + "\n");
                else if (selection == 3) {
                    System.out.print("\nSistemden çıkış yapıyorsunuz...\n");
                    break;
                } else
                    System.out.print("Lütfen geçerli bir seçim yapınız.\n");
            } catch (Exception e) {
                inp.nextLine();
                System.out.print("Lütfen geçerli bir seçim yapınız.\n");
            } finally {
                System.out.print("----------------------------------------------------------------------------------------------------------------------");
            }
        } while (true);
    } /* END OF adminPanel */

    public void report() {
        // Function to report daily passings
        Car[] carArr = this.booth.getArrOfCar();
        System.out.print("\n----------------------------------------------------------------------------------------------------------------------\n\tHGS NO\t\t||\t\t\tAD - SOYAD\t\t\t\t||\tBAKIYE\t\t||\t\t\t\tTARIH\t\t\t\t||\tSINIF\n----------------------------------------------------------------------------------------------------------------------\n");
        for (Car car : carArr) {
            System.out.print("  " + car.getHstsNo() + "\t||\t" + car.getName() + " " + car.getSurname());
            // This if-else block only meant to make the output look better.
            if ((car.getName().length() + car.getSurname().length() + 1) >= 28)
                System.out.print("\t");
            else if ((car.getName().length() + car.getSurname().length() + 1) >= 24)
                System.out.print("\t\t");
            else if ((car.getName().length() + car.getSurname().length() + 1) >= 20)
                System.out.print("\t\t\t");
            else if ((car.getName().length() + car.getSurname().length() + 1) >= 16)
                System.out.print("\t\t\t\t");
            else if ((car.getName().length() + car.getSurname().length() + 1) >= 12)
                System.out.print("\t\t\t\t\t");
            else
                System.out.print("\t\t\t\t\t\t");
            System.out.print("||\t" + String.format("%.2f", car.getBalance()) + " TL\t||\t" + car.getPassingDate_Time() + "\t||\t  " + car.getClassNo() + "\n");
        }
    } /* END OF report */

    public void calculateTotalBalance(Car[] arrOfCar) {
        // Function to calculate daily balance
        for (Car car : arrOfCar)
            this.totalBalance += car.getPrice();
    } /* END OF calculateTotalBalance */
}
