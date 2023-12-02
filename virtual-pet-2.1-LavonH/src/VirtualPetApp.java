import java.util.Scanner;

public class VirtualPetApp {
    public static void main(String[] args) {
        VirtualPetShelter shelter = new VirtualPetShelter();

       
        VirtualPet pet1 = new VirtualPet("Fido", "A playful dog");
        VirtualPet pet2 = new VirtualPet("Whiskers", "A curious cat");
        shelter.addPet(pet1);
        shelter.addPet(pet2);

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Welcome to the Virtual Pet Shelter!");

        while (true) {
            System.out.println("\nMain Menu:");
            System.out.println("1. Feed all pets");
            System.out.println("2. Water all pets");
            System.out.println("3. Play with a pet");
            System.out.println("4. Adopt a pet");
            System.out.println("5. Admit a pet");
            System.out.println("6. View all pets and their statuses");
            System.out.println("7. Exit");

            int choice = inputScanner.nextInt();
            inputScanner.nextLine(); 

            switch (choice) {
                case 1:
                    shelter.feedAllPets();
                    System.out.println("All pets have been fed.");
                    break;
                case 2:
                    shelter.waterAllPets();
                    System.out.println("All pets have been given water.");
                    break;
                case 3:
                    System.out.print("Enter the name of the pet you want to play with: ");
                    String playPetName = inputScanner.nextLine();
                    shelter.playWithPet(playPetName);
                    break;
                case 4:
                    System.out.print("Enter the name of the pet you want to adopt: ");
                    String adoptPetName = inputScanner.nextLine();
                    shelter.adoptPet(adoptPetName);
                    System.out.println(adoptPetName + " has been adopted.");
                    break;
                case 5:
                    System.out.print("Enter the name of the pet you want to admit: ");
                    String admitPetName = inputScanner.nextLine();
                    VirtualPet newPet = new VirtualPet(admitPetName, "A new pet");
                    shelter.admitPet(newPet);
                    System.out.println(admitPetName + " has been admitted to the shelter.");
                    break;
                case 6:
                    System.out.println("Pets in the shelter:");
                    for (VirtualPet pet : shelter.getAllPets()) {
                        System.out.println(pet.getName() + " - " + pet.getDescription());
                        System.out.println("Hunger: " + pet.getHunger());
                        System.out.println("Thirst: " + pet.getThirst());
                        System.out.println("Boredom: " + pet.getBoredom());
                        System.out.println();
                    }
                    break;
                case 7:
                    System.out.println("Thank you for playing!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            shelter.tick(); 
        }
    }
}