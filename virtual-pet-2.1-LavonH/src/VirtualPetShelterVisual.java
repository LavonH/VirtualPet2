import java.util.List;

public class VirtualPetShelterVisual {
    public static void displayShelterStatus(VirtualPetShelter shelter) {
        List<VirtualPet> pets = shelter.getAllPets();
        
        System.out.println("Virtual Pet Shelter");
        System.out.println("----------------------------");
        
        for (VirtualPet pet : pets) {
            System.out.println(pet.getName());
            System.out.println("Description: " + pet.getDescription());
            System.out.println("Hunger: " + pet.getHunger());
            System.out.println("Thirst: " + pet.getThirst());
            System.out.println("Boredom: " + pet.getBoredom());
            System.out.println("----------------------------");
        }
    }

    public static void main(String[] args) {
        VirtualPetShelter shelter = new VirtualPetShelter();

       
        VirtualPet pet1 = new VirtualPet("Fido", "A playful dog");
        VirtualPet pet2 = new VirtualPet("Whiskers", "A curious cat");
        shelter.addPet(pet1);
        shelter.addPet(pet2);

        
        displayShelterStatus(shelter);
    }
}