package gmail.smoljarn.lesson14;

import gmail.smoljarn.lesson14.animals.Breed;
import gmail.smoljarn.lesson14.animals.Dragon;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Dragon dragon1 = new Dragon();
        dragon1.setName("Astor");
        dragon1.setAge(5);
        dragon1.setWeight(10);

        System.out.println(dragon1.getName());
        System.out.println(dragon1.getAge());
        System.out.println(dragon1.getWeight());

        Dragon sunny = new Dragon("Sunny", 4, 4.5, "Voice-0", Breed.ALPHAS);
        Dragon danny = new Dragon("Danny", 5, 5.6,"Voice-1", Breed.MOONDRAGON);
        System.out.println(sunny.equals(danny));

        System.out.println("New dragon " + "\n");


        Dragon dragon2 = new Dragon("Viking", 2, 5, "Я тебе зажарю: fire", Breed.ALPHAS);


        System.out.println(dragon2.getName());
        System.out.println(dragon2.getAge());
        System.out.println(dragon2.getWeight());
        System.out.println(dragon2.getVoice());


        Scanner scan = new Scanner(System.in);
        Dragon[] dragons = new Dragon[3];
        System.out.println("Вибери породу дракона");
        String breedString = scan.nextLine();
        Breed breed = Breed.valueOf(breedString);


        for (int i = 0; i < dragons.length; i++) {


            System.out.println("\nВведіть дані для дракона ");


            System.out.print("Введіть  імя дракона: ");
            String name = scan.nextLine();


            System.out.print("Введіть вік дракона: ");
            int age = scan.nextInt();

            System.out.println("Введіть вагу дракона");
            double weight = scan.nextDouble();

            scan.nextLine();

        }
    }
}