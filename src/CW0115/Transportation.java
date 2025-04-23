package CW0115;

public class Transportation {
    String name;
    private int mileage;
    private int id;
    Transportation(String name, int mileage){
        this.name = name;
        this.mileage = mileage;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMileage() {
        return mileage;
    }

    public int getId() {
        return id;
    }

    void Go(){
        System.out.println(name + " is going.");
    }

    void OilChange(){
        System.out.println(name + " is in need of changing oil.");
    }
}
