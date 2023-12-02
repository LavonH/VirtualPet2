import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VirtualPetShelterTest {
    @Test
    public void testFeedAllPets() {
        VirtualPetShelter shelter = new VirtualPetShelter();
        VirtualPet pet1 = new VirtualPet("Fido", "A playful dog");
        VirtualPet pet2 = new VirtualPet("Whiskers", "A curious cat");
        shelter.addPet(pet1);
        shelter.addPet(pet2);

        shelter.feedAllPets();

        assertEquals(75, pet1.getHunger());
        assertEquals(75, pet2.getHunger());
    }

    @Test
    public void testPlayWithPet() {
        VirtualPetShelter shelter = new VirtualPetShelter();
        VirtualPet pet1 = new VirtualPet("Fido", "A playful dog");
        shelter.addPet(pet1);

        shelter.playWithPet("Fido");

        assertEquals(60, pet1.getBoredom());
    }

    @Test
    public void testAdoptPet() {
        VirtualPetShelter shelter = new VirtualPetShelter();
        VirtualPet pet1 = new VirtualPet("Fido", "A playful dog");
        shelter.addPet(pet1);

        shelter.adoptPet("Fido");

        assertNull(shelter.getPet("Fido"));
    }
}