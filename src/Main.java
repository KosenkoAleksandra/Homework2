public class Main {
    public static void main(String[] args) {
        //Переменные (часть 1)
        System.out.println("Переменные. Часть 1");
        // Задача 1
        System.out.println("Задача 1");

        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        // Задача 2
        System.out.println("Задача 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        //Задача 3
        System.out.println("Задача 3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);


// Задача 4
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

// Задача 5
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //Задача 6
        System.out.println("Задача 6");

        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        var aggregateWeight  = boxer1Weight + boxer2Weight;
        System.out.println("Общий вес двух бойцов " + aggregateWeight + " кг!");
        var weidhtDifference = boxer2Weight - boxer1Weight;
        System.out.println("Разница в весе составляет " + weidhtDifference + " кг!");

        //Задача 7
        System.out.println("Задача 7");
        weidhtDifference = boxer2Weight - boxer1Weight;
        System.out.println("1) Разница в весе составляет " + weidhtDifference + " кг!");
        weidhtDifference = boxer2Weight % boxer1Weight;
        System.out.println("2) Разница в весе составляет " + weidhtDifference + " кг!");

//Задача 8
        System.out.println("Задача 8");
        var totalWorkingHours = 640;
        var workingHours = 8;
        var numberOfWorkers = totalWorkingHours / workingHours;
        System.out.println("Всего работников в компании – " + numberOfWorkers + " человек.");
        var additionalWorkers = numberOfWorkers + 94;
        var newWorkingHours = totalWorkingHours / additionalWorkers;
        System.out.println("Если в компании работает " + additionalWorkers + " человека, то всего " + newWorkingHours + " часа работы может быть поделено между сотрудниками.");

        //Переменные (часть 2)
        System.out.println("Переменные. Часть 2");
// Задача 1
        System.out.println("Задача 1");
        byte bag = 3;
        System.out.println("Значение переменной bag с типом byte равно " + bag);
        short pen = 10500;
        System.out.println("Значение переменной pen с типом short равно " + pen);
        int box = 25000;
        System.out.println("Значение переменной box с типом int равно " + box);
        long flower = 1000000L;
        System.out.println("Значение переменной flower с типом long равно " + flower);
        float money = 25.275f;
        System.out.println("Значение переменной money с типом float равно " + money);
        double cookie = 13.557654545;
        System.out.println("Значение переменной cookie с типом double равно " + cookie);

        // Задача 2
        System.out.println("Задача 2");
        float tomato = 27.12f;
        long salt = 987678965549L;
        double pepper = 2.786;
        boolean apple = false;
        short sugar = 569;
        int temperature = -159;
        short weight = 27897;
        byte book = 67;

        // Задача 3
        System.out.println("Задача 3");
        byte class1 = 23;
        byte class2 = 27;
        byte class3 = 30;
        int allStudents = class1 + class2 + class3;
        short allPaper = 480;
        System.out.println("На каждого ученика рассчитано " + allPaper/ allStudents + " листов бумаги");

        // Задача 4
        System.out.println("Задача 4");
        byte productivity = 16;
        byte time = 2;
        int productivityOneMinute = productivity / time;
        short minutesInDay= 60 * 24;
        System.out.println("За 20 минут машина произвела " + productivityOneMinute * 20 + " штук бутылок.");
        System.out.println("За сутки машина произвела " + minutesInDay * productivityOneMinute + " штук бутылок.");
        System.out.println("За 3 дня машина произвела " + minutesInDay * 3 * productivityOneMinute + " штук бутылок.");
        System.out.println("За 1 месяц машина произвела " + minutesInDay * 30 * productivityOneMinute + " штук бутылок.");

        // Задача 5
        System.out.println("Задача 5");
        short allCans = 120;
        short paintOneClass = 2 + 4; // 2 банки белой краски и 4 банки коричневой краски
        int allClass = allCans / paintOneClass;
        int paintWhite = allClass * 2;
        int paintBrown = allClass * 4;
        System.out.println("В школе, где " + allClass + " классов, нужно " + paintWhite +
                " банок белой краски и " + paintBrown + " банок коричневой краски.");

        // Задача 6
        System.out.println("Задача 6");
        short bananasWeight = 5 * 80;
        short milkWeight = 200 / 100 * 105;
        short iceCreamWeight = 2 * 100;
        short eggsWeight = 4 * 70;
        int cocktailWeight = bananasWeight + milkWeight + iceCreamWeight +  eggsWeight;
        System.out.println("Вес спорт-завтрака составляет " + cocktailWeight + " грамм.");
        float weightKg = cocktailWeight / 1000f;
        System.out.println("Вес спорт-завтрака составляет " + weightKg + " кг.");

        // Задача 7
        System.out.println("Задача 7");
        short weightLoss1Gr = 250;
        short weightLoss2Gr = 500;
        byte purposeKg = 7;
        short purposeGr = 7 * 1000;
        int weightLossDays1 = purposeGr / weightLoss1Gr;
        int weightLossDays2 = purposeGr / weightLoss2Gr;
        System.out.println("На похудение уйдет " + weightLossDays1 + " дней, если спортсмен будет терять каждый день" +
                " по 250 грамм и " + weightLossDays2 + " дней, если спортсмен будет терять каждый день по 500 грамм.");
        int mean = (weightLossDays1 + weightLossDays2) / 2;
        System.out.println("В среднем понадобится " + mean + " день, чтобы добиться результата похудения.");

        // Задача 8
        System.out.println("Задача 8");
        int salaryEmployee1 = 67760;
        int salaryEmployee2 = 83690;
        int salaryEmployee3 = 76230;
        int salaryIncreaseEmployee1 = (int) (salaryEmployee1 + (salaryEmployee1 * 0.1));
        int salaryIncreaseEmployee2 = (int) (salaryEmployee2 + (salaryEmployee2 * 0.1));
        int salaryIncreaseEmployee3 = (int) (salaryEmployee3 + (salaryEmployee3 * 0.1));
        int yrSalaryEmployee1 = salaryEmployee1 * 12;
        int yrSalaryEmployee2 = salaryEmployee2 * 12;
        int yrSalaryEmployee3 = salaryEmployee3 * 12;
        int yrSalaryEmployee1After = salaryIncreaseEmployee1 * 12;
        int yrSalaryEmployee2After = salaryIncreaseEmployee2 * 12;
        int yrSalaryEmployee3After = salaryIncreaseEmployee3 * 12;
        int differenceSalaryEmployee1 = yrSalaryEmployee1After % yrSalaryEmployee1;
        int differenceSalaryEmployee2 = yrSalaryEmployee2After % yrSalaryEmployee2;
        int differenceSalaryEmployee3 = yrSalaryEmployee3After % yrSalaryEmployee3;
        System.out.println("Маша теперь получает " + salaryIncreaseEmployee1 + " рублей. Годовой доход вырос на "
                + differenceSalaryEmployee1 + " рублей.");
        System.out.println("Денис теперь получает " + salaryIncreaseEmployee2 + " рублей. Годовой доход вырос на "
                + differenceSalaryEmployee2 + " рублей.");
        System.out.println("Кристина теперь получает " + salaryIncreaseEmployee3 + " рубля. Годовой доход вырос на "
                + differenceSalaryEmployee3 + " рублей.");













    }
}