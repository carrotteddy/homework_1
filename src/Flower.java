public class Flower {
    private EnumColor color;
    private byte numberOfPetals;
    private Garden garden;


    public EnumColor getColor() {
        return color;
    }

    public byte getNumberOfPetals() {
        return numberOfPetals;
    }

    public Flower(EnumColor color, byte numberOfPetals, Garden garden) {
        this.color = color;
        this.numberOfPetals = numberOfPetals;
        this.garden = garden;
    }

    public String getInfo(){
        return "COLOR: " + color +"\nNUMBER OF PETALS: " + numberOfPetals +"\nGARDEN NAME: "
                + garden.getName() + "\nGARDEN YEAR: " + garden.getYear() +"\nGARDEN ADDRESS: "
                + garden.getAddress();
    }


}
