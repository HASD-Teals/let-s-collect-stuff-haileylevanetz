import java.util.ArrayList;
import java.util.List;
public class CollectionClient {
    public static void main(String[] args) throws Exception {
        // Add your collection ArrayList here..
        // e.g. List<Collectable> collection = new ArrayList<Collectable>();
        List <Collectable> guitars =new ArrayList <Collectable>();
        createCollection(guitars);
        System.out.println(guitars);
        // Add collection methods here to manage and manipulate the collection
    }
    public static void createCollection(List <Collectable> guitars){
        Collectable blackSmoke =new Collectable("Martin", "000-17E", "charcoal", "Acoustic-Electric", 1555);
        Collectable ocean= new Collectable("Gibson", "Les Paul Traditional", "Ocean blue", "Electric", 2650);
        guitars.add(blackSmoke);
        guitars.add(ocean);
    }
}
