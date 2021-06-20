package TV;

class TV{
    boolean on;
    int channel = 1; // Channel 1-120
    int volumeLevel = 0; // Volume 1-10

}

public class Main {

    public static void main(String[] args) {

        TV tv1 = new TV();
        System.out.println(tv1.on);
    }
}
