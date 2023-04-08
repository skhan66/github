package Session4;
public class MainClass {
    public static void main (String[] args){
        Car car = new Car();
        car.goFast();
        car.soundHorn();
    }
}
interface Vehicle {
    public void soundHorn();
    public void goFast();
}
class Car implements Vehicle{
    @Override
    public void soundHorn() {
        System.out.println("Sounding Horn");
    }

    @Override
    public void goFast() {
        System.out.println("Going Fast");
    }
}