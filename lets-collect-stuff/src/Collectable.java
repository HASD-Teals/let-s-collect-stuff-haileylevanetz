public class Collectable {
    // Properties
    private String brand;
    private String model;
    private String color;
    private String type;
    private int value;
    // Constructors
    public Collectable(){
        this.brand="";
        this.model="";
        this.color="";
        this.type="";
        this.value=0;
    }
    // Override Constructors
    public Collectable(String brand, String model, String color, String type, int value){
        this.brand= brand;
        this.model=model;
        this.color=color;
        this.type=type;
        this.value=value;
    }
    // Accessors
    public String getBrand(){
        return this.brand;
    }
    public String getModel(){
        return this.model;
    }
    public String getColor(){
        return this.color;
    }
    public String getType(){
        return this.type;
    }
    public int getValue(){
        return this.value;
    }
    // Mutators
    public void setBrand(String brand){
        this.brand=brand;
    }
    public void setModel(String model){
        this.model=model;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setType(String type){
        this.type=type;
    }
    public void setValue(int value){
        this.value=value;
    }
    // Methods
    public String toString(){
        return this.brand + " " + this.model + " " + this.model + " " + this.type + " " + this.value + " ";
    }
}