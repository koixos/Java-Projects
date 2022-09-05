import java.util.Date;

public abstract class Car {
    private String className;
    private int classNo;
    private int hstsNo;
    private String name;
    private String surname;
    private Date passingDate_Time;
    private double balance;
    private double price;

    public Car(int hstsNo, String name, String surname, double balance) {
        this.setHstsNo(hstsNo);
        this.setName(name);
        this.setSurname(surname);
        this.setPassingDate_Time(new Date(System.currentTimeMillis()));
        this.setBalance(balance);
    } /* END OF Car */

    public String getClassName() {
        return className;
    } /* END OF getClassName */

    public void setClassName(String className) {
        this.className = className;
    } /* END OF setClassName */

    public int getClassNo() {
        return classNo;
    } /* END OF getClassNo */

    public void setClassNo(int classNo) {
        this.classNo = classNo;
    } /* END OF setClassNo */

    public int getHstsNo() {
        return hstsNo;
    } /* END OF getHstsNo */

    public void setHstsNo(int hstsNo) {
        this.hstsNo = hstsNo;
    } /* END OF setHstsNo */

    public String getName() {
        return name;
    } /* END OF getName */

    public void setName(String name) {
        this.name = name;
    } /* END OF setName */

    public String getSurname() {
        return surname;
    } /* END OF getSurname */

    public void setSurname(String surname) {
        this.surname = surname;
    } /* END OF setSurname */

    public Date getPassingDate_Time() {
        return passingDate_Time;
    } /* END OF getPassingDate_Time */

    public void setPassingDate_Time(Date passingDate_Time) {
        this.passingDate_Time = passingDate_Time;
    } /* END OF setPassingDate_Time */

    public double getBalance() {
        return balance;
    } /* END OF getBalance */

    public void setBalance(double balance) {
        this.balance = balance;
    } /* END OF setBalance */

    public double getPrice() {
        return price;
    } /* END OF getPrice */

    public void setPrice(double price) {
        this.price = price;
    } /* END OF setPrice */
}

class Class1 extends Car {
    public Class1(int hstsNo, String name, String surname, double balance) {
        super(hstsNo, name, surname, balance);
        this.setClassName("Otomobil");
        this.setClassNo(1);
        this.setPrice(8.25);
    } /* END OF Class1 */
}

class Class2 extends Car {
    public Class2(int hstsNo, String name, String surname, double balance) {
        super(hstsNo, name, surname, balance);
        this.setClassName("Minibüs");
        this.setClassNo(2);
        this.setPrice(10.75);
    } /* END OF Class2 */
}

class Class3 extends Car {
    public Class3(int hstsNo, String name, String surname, double balance) {
        super(hstsNo, name, surname, balance);
        this.setClassName("Otobüs");
        this.setClassNo(3);
        this.setPrice(23.25);
    } /* END OF Class3 */
}