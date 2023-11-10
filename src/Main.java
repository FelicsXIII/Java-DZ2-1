public class Main {
    public static void main(String[] args) {
        System.out.println("Программа расчета милей");
        int formula = 20; //  за каждые 20 рублей начисляется 1 миля
        int amout = 1898323; // цена билета
        System.out.println("Cумма покупки: " +  amout + " рублей");
        int bonus = amout / formula;
        System.out.println("Начислено: " + bonus + " милей");
    }
}