package adapterPattern;

public class Client {
    public static void main(String[] args) {

        AppleProduct iPhone = new IPhone();
        iPhone.charging("아이폰 미니 12");

        System.out.println();

        AppleProduct mackBook = new MackBook();
        mackBook.playNumbers("macBook의 Numbers");
        mackBook.playKeynote("macBook의 Keynoter");

        System.out.println();

        AppleProduct galaxy = new SamsungAdapter(new Galaxy());
        galaxy.charging("갤럭시 노트");
        galaxy.playNumbers("galaxy의 Execl");
        galaxy.playKeynote("galaxy의 Powerpoint");
    }
}
