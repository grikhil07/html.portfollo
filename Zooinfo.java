public class Zoo {
    private String name;
    private Endclosure[] endclosures;

    // Constructor
    public Zoo(String name, Endclosure[] endclosures) {
        this.name = name;
        this.endclosures = endclosures;
    }

    // Inner class Endclosure
    public class Endclosure {
        private String name;
        private String type;
        private String[] animals;

        public Endclosure(String name, String type, String[] animals) {
            this.name = name;
            this.type = type;
            this.animals = animals;
        }

        public void displayEndclosureDetails() {
            System.out.println("Endclosure Name: " + name);
            System.out.println("Type: " + type);
            System.out.print("Animals: ");
            for (String animal : animals) {
                System.out.print(animal + " ");
            }
            System.out.println();
        }
    }

    // Static nested class Zooinfo
    public static class Zooinfo {
        private String address;
        private String phone;

        public Zooinfo(String address, String phone) {
            this.address = address;
            this.phone = phone;
        }

        public void displayZooInfo() {
            System.out.println("Zoo Address: " + address);
            System.out.println("Zoo Phone: " + phone);
        }
    }

    public static void main(String[] args) {
        Endclosure lionDen = new Zoo("National Zoo", null).new Endclosure("Lion's Den", "Carnivore", new String[]{"Lion"});
        Endclosure birdSanctuary = new Zoo("National Zoo", null).new Endclosure("Bird Sanctuary", "Avian", new String[]{"Parrot", "Eagle"});

        Zoo zoo = new Zoo("National Zoo", new Endclosure[]{lionDen, birdSanctuary});
        for (Endclosure enclosure : zoo.endclosures) {
            enclosure.displayEndclosureDetails();
        }

        Zooinfo info = new Zooinfo("123 Zoo Lane", "123-456-7890");
        info.displayZooInfo();
    }
}
