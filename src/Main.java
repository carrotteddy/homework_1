public class Main {
    public static void main(String[] args) {
        Garden garden1 = new Garden("Bloom", 1987,"Street");
        Garden garden2 = new Garden("FlowerParadise", 1869,"ourStreet");


        Rose objectA = new Rose(EnumColor.RED, (byte) 54, garden1, 10 );
        RoseBush objectB = new RoseBush(EnumColor.PINK,(byte) 12, garden2,17, 14);
        RoseBush objectC = new RoseBush(EnumColor.WHITE, (byte) 127, garden2,19, 24);

        Rose[] flowers ={ objectA, objectB, objectC};
        for (Rose flower: flowers) {
            System.out.println(flower.getInfo());
            flower.inflictPrick();
            flower.flowering();
        }


    }
}