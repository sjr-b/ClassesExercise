public class Runner {

    public static void main(String[] args) {
        Car batmobile = new Car(1941, 1, "Wayne Enterprises", false, true);
        System.out.println(batmobile.toString());
        batmobile.setMiles(100);
        System.out.println(batmobile.toString());

        Rectangle rect = new Rectangle(3,4);
        System.out.println(rect.getArea());
        System.out.println(rect.getDiagonal());
        System.out.println(rect.isSquare());
    }

}
