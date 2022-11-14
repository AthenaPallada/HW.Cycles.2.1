public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        double sumWithPercent = 0;
        double savings = 15000;
        double percent = 0.01;
        int i = 0;
        while(sumWithPercent < 2_459_000) {
            sumWithPercent = (sumWithPercent + savings) * (1 + percent);
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна = " + sumWithPercent + " рублей");
        }
        // Задача 2
        System.out.println("Задача 2");
        i = 0;
        while(i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for(i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        // Задача 3
        System.out.println();
        System.out.println("Задача 3");
        int populationY = 12_000_000;
        int childBirth = 17;
        int mortality = 8;

        while(i < 10) {
            populationY = (populationY / 1000 * childBirth - mortality) + populationY;
            i++;
            System.out.println("Год " + i + ", численность населения составляет = " + populationY);
        }
    }
}