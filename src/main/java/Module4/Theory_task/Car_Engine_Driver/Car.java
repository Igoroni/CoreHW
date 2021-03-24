package Module4.Theory_task.Car_Engine_Driver;

import Module4.Theory_task.Phone;

public class Car {
    public String idAvto;
    public String classAvto;
    public int weightAvto;

    Driver driver = new Driver();
    Engine engine = new Engine();

    public void start(){
        System.out.println("Let's go!");
    }

    public void stop() {
        System.out.println("Pull down now.");
    }

    public void turnRight() {
        System.out.println("time to turn right");
    }

    public void turnLeft() {
        System.out.println("now take the left turn");
    }

    @Override
    public String toString() {
        return "Car{" +
                "idAvto='" + idAvto + '\'' +
                ", classAvto='" + classAvto + '\'' +
                ", weightAvto=" + weightAvto +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }


    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car);
    }
}


