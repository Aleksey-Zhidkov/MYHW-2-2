public class Main {
    public static void main(String[] args) {
        int check = 300;
        int contribute = 1000;
        int bonus = (contribute / 100);
        if (contribute >= 1000) {
            System.out.println(bonus + check + contribute);
        } else {
            System.out.println(contribute + check);
        }
    }
}