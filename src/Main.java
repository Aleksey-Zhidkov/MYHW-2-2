public class Main {
    public static void main(String[] args) {
        int check = 100;
        int contribute = 1100;
        int bonus = (contribute / 100);
        if (contribute >= 1001) {
            System.out.println(bonus + check + contribute);
        } else {
            System.out.println(contribute + check);
        }
    }
}