import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class DogBreed {
    String name;
    String size; 
    String temperament; 

    public DogBreed(String name, String size, String temperament) {
        this.name = name;
        this.size = size;
        this.temperament = temperament;
    }

    @Override
    public String toString() {
        return name + " (" + size + ", " + temperament + ")";
    }
}
public class DogBreedRecommendation{

    private static List<DogBreed> dogBreeds = new ArrayList<>();

    static {
        dogBreeds.add(new DogBreed("Beagle", "small", "friendly"));
        dogBreeds.add(new DogBreed("Labrador Retriever", "large", "friendly"));
        dogBreeds.add(new DogBreed("German Shepherd", "large", "active"));
        dogBreeds.add(new DogBreed("Pug", "small", "playful"));
        dogBreeds.add(new DogBreed("Bulldog", "medium", "gentle"));
        dogBreeds.add(new DogBreed("Golden Retriever", "large", "friendly"));
        dogBreeds.add(new DogBreed("Chihuahua", "small", "loyal"));
        dogBreeds.add(new DogBreed("Dachshund", "small", "curious"));
        dogBreeds.add(new DogBreed("Rottweiler", "large", "confident"));
        dogBreeds.add(new DogBreed("Border Collie", "medium", "intelligent"));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter preferred size (small, medium, large): ");
        String preferredSize = scanner.nextLine().trim().toLowerCase();

        System.out.print("Enter preferred temperament (friendly, independent, active, playful, gentle, loyal, curious, confident, intelligent): ");
        String preferredTemperament = scanner.nextLine().trim().toLowerCase();

        List<DogBreed> recommendations = getRecommendations(preferredSize, preferredTemperament);

        System.out.println("\nRecommended Dog Breeds:");
        if (recommendations.isEmpty()) {
            System.out.println("No breeds match your preferences.");
        } else {
            for (DogBreed breed : recommendations) {
                System.out.println(breed);
            }
        }

        scanner.close();
    }

    private static List<DogBreed> getRecommendations(String size, String temperament) {
        List<DogBreed> recommendations = new ArrayList<>();

        for (DogBreed breed : dogBreeds) {
            if (breed.size.equalsIgnoreCase(size) && breed.temperament.equalsIgnoreCase(temperament)) {
                recommendations.add(breed);
            }
        }
        return recommendations;
    }
}
