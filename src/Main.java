public class Main {
    public static void main(String[] args) {
        int check = 100;
        int contribute = 1100;
        int bonus = (contribute / 100);
        if (contribute > 1000) {
            System.out.println(bonus + check + contribute);
            System.out.println(bonus);
        } else {
            System.out.println(contribute + check);
            System.out.println(bonus = 0);
        }
    }
}