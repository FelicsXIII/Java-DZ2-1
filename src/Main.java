public class Main {
    public static void main(String[] args) {
        System.out.println("Программа расчета милей");
        int x = 20; //  за каждые 20 рублей начисляется 1 миля
        int amout = 5_555; // цена билета
        System.out.println("Cумма покупки " +  amout + " рублей");
        int bonus = amout / x;
        System.out.println("Начислено:" + bonus + " милей");
    }
}