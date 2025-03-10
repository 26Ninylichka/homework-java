package gmail.smoljarn.lesson14.animals;

public  class Dragon {

    private String name;
    private int age;
    private double weight;
    private String voice;


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

    public Dragon(String name, int age, double weight, String voice){
        System.out.println("Dragon Constructor WITH PARAMETERS called");
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.voice = voice;
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


    public void setVoice(String voice) {
        this.voice = voice;
    }
    public String getVoice() {
        return voice;
    }
}


