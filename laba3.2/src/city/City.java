package city;
import country.Country;

public class City extends Country {
    private int population;

    public City(String name, String capital, int population) {
        super(name, capital);
        this.population = population;
    }

    public int getPopulation() {
        return population;
    }
    public void setPopulation(int population) {
        this.population = population;
}
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("City Population: " + population);
    }
}
