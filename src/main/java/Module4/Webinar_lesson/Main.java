package Module4.Webinar_lesson;

public class Main {
    public static void main(String[] args) {

        Animal [] animals = new Animal[2];

        animals[0].setName("Kotya");
        animals[0].move(2, 4);
        System.out.println(animals[0]);
        animals[0].move(4,3);
        System.out.println(animals[0]);
//        voice(animals[0]);

        animals[1].setName("Bobik");
        animals[1].move(5, 10);
        System.out.println(animals[1]);
        animals[1].move(-20, 40);
        System.out.println(animals[1]);
        System.out.println(animals[1].voice());
//        voice(animals[1]);

        voice(animals);


    }

    public static void voice(Animal ... animals) {
        for (Animal animal: animals) {
            System.out.println(animal);
        }
    }
}
