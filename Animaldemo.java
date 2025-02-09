import java.util.Scanner;
class Animals {
    private String species;
    int age;
    float weight;
    protected String color;
    public Animals(String species, int age, float weight, String color) {
        this.species = species;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }
    public String getSpecies() {
        return species;
    }
    public void displayAnimals() {
        System.out.println("Species: " + getSpecies() + " with Age: " + age + " years" +" with Weight: " + weight + " kg" + " and Color: " + color);
    }
}
class Dog extends Animals {
    String name;
    String owner;

    public Dog(String species, int age, float weight, String color, String name, String owner) {
        super(species, age, weight, color);
        this.name = name;
        this.owner = owner;
    }
    public void displayDog() {
        displayAnimals();
        System.out.println("Dog's Name: " + name +  " Owne by : " + owner);
    }
}
public class Animaldemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter species: ");
        String species = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter weight: ");
        float weight = sc.nextFloat();
        sc.nextLine();
        System.out.print("Enter color: ");
        String color = sc.nextLine();
        System.out.print("Enter dog's name: ");
        String name = sc.nextLine();
        System.out.print("Enter owner's name: ");
        String owner = sc.nextLine();
        Dog D = new Dog(species, age, weight, color, name, owner);
        D.displayDog();
        sc.close();
    }
}
