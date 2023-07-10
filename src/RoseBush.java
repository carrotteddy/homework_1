public final class RoseBush  extends  Rose{
    private int numberOfFlowers;
    public RoseBush(EnumColor color, byte numberOfPetals, Garden garden, int numberOfThorns, int numberOfFlowers) {
        super(color, numberOfPetals, garden, numberOfThorns);
        this.numberOfFlowers = numberOfFlowers;
    }

    public int getNumberOfFlowers() {
        return numberOfFlowers;
    }

    @Override
    public void flowering() {
        System.out.println("Лепестки роз куста расскрываются");
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nNUMBER OF FLOWERS: " + numberOfFlowers;
    }
}
