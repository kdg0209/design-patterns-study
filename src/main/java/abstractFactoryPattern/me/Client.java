package abstractFactoryPattern.me;

public class Client {
    public static void main(String[] args) {
        Person teacher = new Person(new AppleFactory());
        Phone phone1 = teacher.buy(PersonType.TEACHER);
        System.out.println(phone1.getCompany().getClass());
        System.out.println(phone1.getBattery().getClass());
        System.out.println(phone1.getCamera().getClass());

        System.out.println();
        System.out.println();

        Person student = new Person(new SamsungFactory());
        Phone phone2 = student.buy(PersonType.STUDENT);
        System.out.println(phone2.getCompany().getClass());
        System.out.println(phone2.getBattery().getClass());
        System.out.println(phone2.getCamera().getClass());
    }
}
