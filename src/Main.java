public class Main {
    public static void main(String[] args) {

        int initial = 300; // начальный счёт
        int topUp = 100; // пополнение
        int bonus; // бонус

        if (topUp >= 1000) {
            bonus = topUp / 100;
            System.out.println("Вам начислено " + bonus + " бонус(а/ов)");
        } else {
            bonus = 0;
        }
        int total = initial + topUp + bonus; // итоговая сумма на счету
        System.out.println("Сумма на счету " + total + " рубль(я/ей)");
    }
}