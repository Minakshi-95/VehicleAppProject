public class Main {
    public static void main(String[] args) {
        SUV fortuner = new SUV("fortuner", false);
        fortuner.move(40, 0);
        fortuner.accelerate(20);
        //fortuner.accelerate(-60);

        System.out.println("current Gear :" +fortuner.getCurrentGear());
        System.out.println("current Speed :" +fortuner.getCurrentSpeed());
    }
}