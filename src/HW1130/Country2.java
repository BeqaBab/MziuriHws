package HW1130;

public class Country2 {
    String name;
    int population;
    String capital;
    int area;
    Country2(String name, int population, String capital ,int area){
        this.name=name;
        this.population=population;
        this.capital=capital;
        this.area=area;
    }
    void getInfo(){
        System.out.println(name + " " + population + " " + capital + " " + area);
    }
    public class River{
        String riverName;
        int length;
        River(String name, int length){
            this.riverName=name;
            this.length=length;
        }
        void getInfo(){
            System.out.println(riverName + " " + length);
        }
    }
}
