public class Main {
    public static void main(String[] args) {

        int number = 5;
        System.out.println(number);

        Train mta = new Train(true);
        Boolean trainStatus = mta.getOnFire();
        System.out.println();
        System.out.println();
        System.out.println(trainStatus);
        System.out.println("Hello!");
        System.out.println("World!");
    }
}
