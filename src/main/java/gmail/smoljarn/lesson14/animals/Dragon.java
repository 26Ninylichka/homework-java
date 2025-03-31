package gmail.smoljarn.lesson14.animals;

import java.util.Objects;

public class Dragon {

    private String name;
    private int age;
    private double weight;
    private String voice;
    private Breed breed;


    @Override
    public String toString() {
        return "Dragon{" + "name='" + name + '\'' + ", age=" + age + ", weight=" + weight + ", voice='" + voice + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dragon dragon = (Dragon) o;
        return age == dragon.age && Double.compare(weight, dragon.weight) == 0 && breed == dragon.breed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, weight, breed);
    }

    public Dragon() {
        System.out.println("Dragon Constructor called");
    }

    public Dragon(String name, int age, double weight, String voice, Breed breed) {
        System.out.println("Dragon Constructor WITH PARAMETERS called");
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.voice = voice;
        this.breed = breed;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;

    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public String getVoice() {
        return voice;
    }
}


