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

        System.out.println("задание 3");
        int start = 12000000;
        int birthRate = 17;
        int deathRate = 8;
        int a3 = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Год " + i + ", численность населения составляет " + start);
            a3 = start / 1000;
            start += a * birthRate - a3 * deathRate;
        }
        System.out.println("");

        System.out.println("задание 4");
        int start4 = 15000;
        int i = 1;
        do {
            System.out.println("Месяц " + i + ", сумма накоплений: " + start4 + " руб.");
            i += 1;
            start4 += start4 * 0.07;
        } while (start4 < 12000000);
        System.out.println("Чтобы накопить 12000000 рублей, потребуется " + i + " месяцев");
        System.out.println("");

        System.out.println("задание 5");
        int start5 = 15000;
        int l = 1;
        do {
            start5 += start5 * 0.07;
            l += 1;
            if (l % 6 == 0) {
                System.out.println("Месяц " + l + ", сумма накоплений: " + start5 + " руб.");
            }
        } while (start5 < 12000000);
        System.out.println("Чтобы накопить 12000000 рублей, потребуется " + l + " месяцев");
        System.out.println("");

        System.out.println("задание 6");
        int sum5 = 15000;
        int i6 = 1;
        do {
            sum5 += sum5 * 0.07;
            i6 += 1;
            if (i6 % 6 == 0) {
                System.out.println("Месяц " + i6 + ", сумма накоплений: " + sum5 + " руб.");
            }
        } while (i6 < 9 * 12);
        System.out.println("За 9 лет Василий накопит " + sum5 + " рублей");
        System.out.println("");

        System.out.println("задание 7");
        int i7 = 1;
        int friday = 5;
        do {
            if (i7 == friday || i7 % 7 == 5) {
                System.out.println("Сегодня пятница, " + i7 + "-е число. Необходимо подготовить отчет");
            }
            i7 += 1;
        } while (i7 <= 31);
        System.out.println("");

        System.out.println("задание 8");
        int yearStart = 1825;
        int yearFinish = 2125;
        int c = yearStart;
        do {
            if (c % 79 == 0) {
                System.out.println(c);
            }
            c += 1;
        } while (c <= yearFinish);
        System.out.println("");
    }
}