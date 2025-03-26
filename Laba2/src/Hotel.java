public class Hotel {
    private String name;
    private String location;
    private int numberOfRooms;
    private int occupiedRooms;
    private boolean hasPool;
    private double rating;


    public Hotel(String name, String location, int numberOfRooms, boolean hasPool, double rating, int occupiedRooms) {
        this.name = name;
        this.location = location;
        this.numberOfRooms = numberOfRooms;
        this.hasPool = hasPool;
        this.rating = rating;
        this.occupiedRooms = occupiedRooms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public boolean hasPool() {
        return hasPool;
    }

    public void setPool(boolean hasPool) {
        this.hasPool = hasPool;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getOccupiedRooms() {
        return occupiedRooms;
    }

    public void setOccupiedRooms(int occupiedRooms) {
        this.occupiedRooms =occupiedRooms;
    }

    public double calculateOccupancyRate() {
        return (double) occupiedRooms / numberOfRooms * 100;
    }

    public void displayInfo() {
        System.out.println("Название отеля: " + name);
        System.out.println("Расположение: " + location);
        System.out.println("Количество номеров: " + numberOfRooms);
        System.out.println("Есть бассейн: " + (hasPool ? "Да" : "Нет"));
        System.out.println("Рейтинг: " + rating);
        System.out.println("Занятые комнаты " + occupiedRooms );
        System.out.println("Заполняемость отеля " + calculateOccupancyRate() + "%" );


    }


    public static void main(String[] args) {

        Hotel myHotel = new Hotel("Гранд Отель", "Москва", 150, true,4.5,45);

        myHotel.displayInfo();
    }
}

