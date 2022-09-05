public class Booth {
    private final Car[] arrOfCar;

    public Booth(int arrSize) {
        arrOfCar = new Car[arrSize];
    } /* END OF Booth*/

    public Car[] getArrOfCar() {
        return arrOfCar;
    } /* END OF getArrOfCar */

    public void payment(Car car) {
        // Function to pay the toll
        car.setBalance(car.getBalance() - car.getPrice());
    } /* END OF payment */

    public void keepPassing(Car car, int countOfCar) {
        // This function holds all the passed cars to report later.
        this.arrOfCar[countOfCar] = car;
    } /* END OF keepPassing */
}
