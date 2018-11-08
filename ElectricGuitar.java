public class ElectricGuitar extends StringedInstrument {

    public ElectricGuitar() {

        name = "Guitar";
        numberOfStrings = 6;
    }

    public ElectricGuitar(int gnumberOfStrings) {

        name = "Guitar";
        numberOfStrings = gnumberOfStrings;
    }

    public void play() {

        System.out.println("An electric " + numberOfStrings + "-string " + name+ " is rocking!");
    }
}
