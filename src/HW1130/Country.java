package HW1130;

public class Country {
    String name;
    String capitalCity;
    City[] cities;
    Country(String name, String capitalCity, City[] cities){
        this.name=name;
        this.capitalCity=capitalCity;
        this.cities=cities;
    }
    int area() {
        int ans = 0;
        for (City city : cities) {
            ans += city.area;
        }
        return ans;
    }
    int population() {
        int ans = 0;
        for (City city : cities) {
            ans += city.population;
        }
        return ans;
    }
}
