package Module4.Theory_task;

public class Phone {
    public int number = 25;
    public String model = "XXXX";
    public Double weight = 4.58;

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone(32,"RXZ");
        Phone phone3 = new Phone(444, "AAA", 5.78);

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

        phone1.receiveCall("vasue");


    }

    public void receiveCall(String name) {
        System.out.println(name + " is calling.");
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(int number, String model, Double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone() {
    }

    public void receiveCall(String name, int phoneNumber) {
        System.out.println(name + "is calling, phone number - " + phoneNumber);
    }

    public void sendMessage(int ... numbers) {
        for(int number: numbers) {
            System.out.println(number);
        }
    }

}
