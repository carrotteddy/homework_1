public class Rose extends Flower {
    private int numberOfThorns;

    public Rose(EnumColor color, byte numberOfPetals, Garden garden, int numberOfThorns) {
        super(color, numberOfPetals, garden);
        this.numberOfThorns = numberOfThorns;
    }

    public int getNumberOfThorns() {
        return numberOfThorns;
    }

    public final  void inflictPrick(){
        System.out.println("Шипы колятся \uD83E\uDE78 \uD83E\uDE78 \uD83E\uDE78");
    }
    public void flowering(){
        System.out.println("Лепестки розы ракрываются");
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nNUMBER OF THORNS: " + numberOfThorns;
    }
}
