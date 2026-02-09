public class Main {
    public static void main(String[] args) {
        int check = 100;
        int contribute = 1100;
        if (contribute > 1000) {
            int bonus = (contribute / 100);
            System.out.println("Баланс" + " " + (bonus + check + contribute));
            System.out.println("Начисленных бонусов" + " " + bonus);
        } else {
            int bonus = 0;
            System.out.println("Баланс" + " " + (contribute + check));
            System.out.println("Начисленных бонусов" + " " + bonus);
        }
    }
}