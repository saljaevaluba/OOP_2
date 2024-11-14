public class Main {
    public static void main(String[] args) throws Exception {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();
        phone1.print();
        phone2.print();
        phone3.print();

        phone1.receiveCall("Aboba");
        phone2.receiveCall("Abiba");
        phone3.receiveCall("Ababa");

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());

        phone1.receiveCall("Qert", "+7(962)5930-63-3");

        int count = 10;
        Reader[] readers = new Reader[count];


    }
}
