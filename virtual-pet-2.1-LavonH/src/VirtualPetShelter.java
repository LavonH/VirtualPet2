import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VirtualPetShelter {
    private Map<String, VirtualPet> pets = new HashMap<>();

    public void addPet(VirtualPet pet) {
        pets.put(pet.getName(), pet);
    }

    public VirtualPet getPet(String name) {
        return pets.get(name);
    }

    public List<VirtualPet> getAllPets() {
        return new ArrayList<>(pets.values());
    }

    public void feedAllPets() {
        for (VirtualPet pet : pets.values()) {
            pet.feed();
        }
    }

    public void waterAllPets() {
        for (VirtualPet pet : pets.values()) {
            pet.water();
        }
    }

    public void playWithPet(String name) {
        VirtualPet pet = pets.get(name);
        if (pet != null) {
            pet.play();
        } else {
            System.out.println("Pet not found.");
        }
    }

    public void adoptPet(String name) {
        pets.remove(name);
    }

    public void admitPet(VirtualPet pet) {
        addPet(pet);
    }

    public void tick() {
        for (VirtualPet pet : pets.values()) {
            pet.tick();
        }
    }
}