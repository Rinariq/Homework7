public class Main {
    public static void main(String[] args) {
        System.out.println("задание 1");
        int sum = 0;
        int plus = 15000;
        int month = 1;
        do {
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
            sum += plus;
            month += 1;
        } while (sum < 2459000);
        System.out.println("Чтобы накопить 2 459 000 руб, потребуется " + month + " месяцев");
        System.out.println("");

        System.out.println("задание 2");
        int a = 1;
        do {
            System.out.print(a + " ");
            a += 1;
        } while (a <= 10);
        System.out.println("");
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("");

        System.out.println("задание 3");
        int start = 12000000;
        int birthRate = 17;
        int deathRate = 8;
        int ratio = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Год " + i + ", численность населения составляет " + start);
            ratio = start / 1000;
            start += ratio * birthRate - ratio * deathRate;
        }
        System.out.println("");

        System.out.println("задание 4");
        int start4 = 15000;
        int month4 = 1;
        do {
            System.out.println("Месяц " + month4 + ", сумма накоплений: " + start4 + " руб.");
            month4 += 1;
            start4 += start4 * 0.07;
        } while (start4 < 12000000);
        System.out.println("Чтобы накопить 12000000 рублей, потребуется " + month4 + " месяцев");
        System.out.println("");

        System.out.println("задание 5");
        int start5 = 15000;
        int period = 1;
        do {
            start5 += start5 * 0.07;
            period += 1;
            if (period % 6 == 0) {
                System.out.println("Месяц " + period + ", сумма накоплений: " + start5 + " руб.");
            }
        } while (start5 < 12000000);
        System.out.println("Чтобы накопить 12000000 рублей, потребуется " + period + " месяцев");
        System.out.println("");

        System.out.println("задание 6");
        int contribution = 15000;
        int buildup = 1;
        do {
            contribution += contribution * 0.07;
            buildup += 1;
            if (buildup % 6 == 0) {
                System.out.println("Месяц " + buildup + ", сумма накоплений: " + contribution + " руб.");
            }
        } while (buildup < 9 * 12);
        System.out.println("За 9 лет Василий накопит " + contribution + " рублей");
        System.out.println("");

        System.out.println("задание 7");
        int dayWeek = 5;
        do {
            System.out.println("Сегодня пятница, " + dayWeek + "-е число. Необходимо подготовить отчет");
            dayWeek += 7;
        } while (dayWeek<=31);
        System.out.println("");

        System.out.println("задание 8");
        int yearStart = 1825;
        int yearFinish = 2125;
        int comet = yearStart;
        do {
            if (comet % 79 == 0) {
                System.out.println(comet);
            }
            comet += 1;
        } while (comet <= yearFinish);
    }
}