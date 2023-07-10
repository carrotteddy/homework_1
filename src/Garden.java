public class Garden {
    private String name;
    private int year;
    private String address;

    public Garden(String name, int year, String address) {
        this.name = name;
        this.year = year;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getAddress() {
        return address;
    }
}
