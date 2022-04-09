public class Main {
    public static void main (String[] args) {
        Cars car1=CarFactory.getCar (Cars.RENAULT);
        Cars car2=CarFactory.getCar (Cars.BMW);
        Cars car3=CarFactory.getCar (Cars.SAIPA);
        Cars car4=CarFactory.getCar (Cars.TOYOTA);
        car1.showCar();
        car2.showCar();
        car3.showCar();
        car4.showCar();
    }
}
