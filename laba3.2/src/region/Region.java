package region;
import country.Country;

public class Region extends Country {
    private double area;

    public Region(String name, String capital, double area) {
        super(name, capital);
        this.area = area;
    }

    public double getArea() {
        return area;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Region Area: " + area + " sq km");
    }
}
