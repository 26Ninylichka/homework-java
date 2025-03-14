package gmail.smoljarn.lesson14.animals;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public  class Dragon {

    private String name;
    private int age;
    private double weight;
    private String voice;
    private Breed breed;


    @Override
    public String toString() {
        return "Dragon{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", voice='" + voice + '\'' +
                '}';
    }

    public Dragon() {
        System.out.println("Dragon Constructor called");
    }

    public Dragon(String name, int age, double weight, String voice) {
        System.out.println("Dragon Constructor WITH PARAMETERS called");
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.voice = voice;
        this.breed = breed;
    }
}







