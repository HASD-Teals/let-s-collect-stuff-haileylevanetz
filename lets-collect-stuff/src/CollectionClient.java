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
        Collectable blackMartin =new Collectable("Martin", "000-17E", "Black Smoke", "Acoustic-Electric", 1555);
        Collectable oceanGibson= new Collectable("Gibson", "Les Paul Traditional", "Ocean blue", "Electric", 2650);
        Collectable pearlFender= new Collectable("Fender", "Stratocaster", "Pearl white", "Electric", 1620);
        Collectable concertTaylor= new Collectable("Taylor", "912ce Grand Concert", "Light Rosewood", "Acoustic-Electric", 5499);
        guitars.add(blackMartin);
        guitars.add(oceanGibson);
        guitars.add(pearlFender);
        guitars.add(concertTaylor);
    }
}
