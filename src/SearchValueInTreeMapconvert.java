import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.lang.Iterable;

public class SearchValueInTreeMapconvert {

    public static void main(String[] args) {
        Iterable<String> programmingLanguages = List.of("Java", "Python", "C++", "JavaScript");

        System.out.println("Original Iterable elements:");
        for (String lang : programmingLanguages) {
            System.out.println(lang);
        }

        Collection<String> languageCollection = new ArrayList<>();
        programmingLanguages.forEach(languageCollection::add);

        System.out.println("\nConverted Collection: " + languageCollection);
    }
}

