public class Main {
    public static void main(String[] args) {
        MagicBox<Integer> magicBox = new MagicBox<>(3);
        MagicBox<String> magicBox1 = new MagicBox<>(3);


        magicBox.add(600);
        magicBox.add(800);
        magicBox.add(400);
        System.out.println(magicBox.add(900));
        System.out.println(magicBox.pick());
        magicBox1.add("Нина");
        magicBox1.add("Привет");
        magicBox1.add("Пока");
        System.out.println(magicBox1.add("Нетология"));
        System.out.println(magicBox1.pick());

    }
}
