public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var figterWeight1 = 78.2;
        var figterWeight2 = 82.2;
        var allWeight = figterWeight1 + figterWeight2;
        System.out.println("Общий вес бойцов " + allWeight);
        var varianceWeight = figterWeight2 - figterWeight1;
        System.out.println("Разница между весами бойцов " + varianceWeight);
        var differentWeight = figterWeight2 % figterWeight1;
        System.out.println("Разница между весами бойцов " + differentWeight + "кг!");
        var allTime = 640;
        var personalTime = 8;
        var worker = allTime / personalTime;
        System.out.println("Всего работников в компании - " + worker + " человек");
        var allWorker = worker + 94;
        var neededTime = allWorker * 8;
        System.out.println("Если в компании работает " + allWorker + " человек, то всего " + neededTime + " часов работы может быть поделено между сотрудниками.");
        int A = 33000;
        System.out.println("Значение переменной A с типом int равно" + A + " ");
        byte B = 2;
        System.out.println("Значение переменной B с типом byte равно" + B + " ");
        short C = 200;
        System.out.println("Значение переменной C с типом short равно" + C + " ");
        long D = 2200000000L;
        System.out.println("Значение переменной D с типом long равно" + D + " ");
        float E = 40.555f;
        System.out.println("Значение переменной E с типом float равно" + E + " ");
        double G = 40.5553331;
        System.out.println("Значение переменной G с типом double равно" + G + " ");
        float simbolOne = 27.12f;
        System.out.println(simbolOne);
        long simbolTwo = 987678965549L;
        System.out.println(simbolTwo);
        double simbolThree = 2.786;
        System.out.println(simbolThree);
        short simbolFour = 569;
        System.out.println(simbolFour);
        short simbolFive = -159;
        System.out.println(simbolFive);
        int simbolSix = 27897;
        System.out.println(simbolSix);
        byte simbolSeven = 67;
        System.out.println(simbolSeven);
        byte studentLP = 23;
        byte studentAS = 27;
        byte studentEA = 30;
        short allPaper = 480;
        int studentPaper = allPaper / (studentLP + studentAS + studentEA);
        System.out.println("На каждого ученика рассчитано " + studentPaper + " листов бумаги");
        byte CapacityM = 16;
        byte timeCapacity = 2;
        int minCapacityM = CapacityM / timeCapacity;
        int twentyminCapacityM = 20 * minCapacityM;
        System.out.println("«За 20 мин машина произвела " + twentyminCapacityM + " штук бутылок");
        int hourCapacityM = 60 * minCapacityM;
        int dayCapacityM = 24 * hourCapacityM;
        System.out.println("«За сутки машина произвела " + dayCapacityM + " штук бутылок");
        int treedayCapacityM = 3 * dayCapacityM;
        System.out.println("«За три дня машина произвела " + treedayCapacityM + " штук бутылок");
        int monthCapacityM = 30 * dayCapacityM;
        System.out.println("«За месяц машина произвела " + monthCapacityM + " штук бутылок");
        byte allPaint = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int klassRepair = allPaint / (whitePaint + brownPaint);
        int needWhiteP = klassRepair * whitePaint;
        int needBrownP = klassRepair * brownPaint;
        System.out.println("В школе, где " + klassRepair + " классов, нужно " + needWhiteP + " банок белой краски и " + needBrownP + " банок коричневой краски");
        byte banana = 5;
        short milk = 2;
        byte icecreamPlombir = 2;
        byte egg = 4;
        byte bananaWeight = 80;
        short milkWeght = 105;
        byte icecreamPlombirWeight = 100;
        byte eggWeight = 70;
        float breakfastSportsmen = ((banana * bananaWeight) + (milk * milkWeght) + (icecreamPlombir * icecreamPlombirWeight) + (egg * eggWeight));
        System.out.println("Завтрак спортсмена в граммах " + breakfastSportsmen + " грамм");
        float kg = 1000f;
        float breakfastSportsmenkg = breakfastSportsmen / kg;
        System.out.println("Завтрак спортсмена в килограммах " + breakfastSportsmenkg + " кг");
        byte needWeight = 7;
        short oneloseWeight = 250;
        short secondloseWeight = 500;
        float oneSumdaylose = ((7 * kg) / oneloseWeight);
        System.out.println("При похудении на " + oneloseWeight + " потребуется " + oneSumdaylose + " дней");
        float secondSumdaylose = ((7 * kg) / secondloseWeight);
        System.out.println("При похудении на " + secondloseWeight + " потребуется " + secondSumdaylose + " дней");
        float averageSumdaylose = ((oneSumdaylose + secondSumdaylose) / 2);
        System.out.println("В среднем потребуется " + averageSumdaylose + " день");
        int Mary = 67760;
        int Den = 83690;
        int Kristy = 76230;
        int difMary = Mary * 10 / 100;
        int salaryMary = difMary + Mary;
        int yearsalaryMary = 12 * Mary;
        int yearnewsalaryMary = 12 * salaryMary;
        System.out.println("Маша теперь получает " + salaryMary + " рублей. Годовой доход вырос на " + (yearnewsalaryMary - yearsalaryMary) + " рублей");
        int difDen = Den * 10 / 100;
        int salaryDen = difDen + Den;
        int yearsalaryDen = 12 * Den;
        int yearnewsalaryDen = 12 * salaryDen;
        System.out.println("Денис теперь получает " + salaryDen + " рублей. Годовой доход вырос на " + (yearnewsalaryDen - yearsalaryDen) + " рублей");
        int difKristy = Kristy * 10 / 100;
        int salaryKristy = difKristy + Kristy;
        int yearsalaryKristy = 12 * Kristy;
        int yearnewsalaryKristy = 12 * salaryKristy;
        System.out.println("Кристина теперь получает " + salaryKristy + " рублей. Годовой доход вырос на " + (yearnewsalaryKristy - yearsalaryKristy) + " рублей");
        var ex = 1;
        System.out.println("условный оператор Задача -" + ex + ".");

        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен - " + age + " то, он совершеннолетний. ");
        }
        int age1 = 17;
        if (age1 < 18) {
            System.out.println("Если возраст человека равен - " + age1 + " он не достиг совершеннолетия, нужно немного подождать.");
        }

        var ex1 = 2;
        System.out.println("условный оператор Задача -" + ex1 + ".");

        int tempa = -5;
        if (tempa <= -5) {
            System.out.println("На улице " + tempa + " градусов, нужно надеть шапку. ");
        }

        int tempa1 = 5;
        if (tempa1 >= 5) {
            System.out.println("На улице " + tempa1 + " градусов, можно идти без шапки.");
        }
        var ex2 = 3;
        System.out.println("условный оператор Задача -" + ex2 + ".");
        int speed = 61;
        if (speed >= 61) {
            System.out.println("Если скорость  " + speed + " придется заплатить штраф. ");
        }
        int speed1 = 60;
        if (speed1 <= 60) {
            System.out.println("Если скорость " + speed1 + " можно ездить спокойно.");
        }
        //ex4;
        System.out.println("условный оператор Задача -4");
        int peopleAge1 = 3;
        if (peopleAge1 >= 2 && peopleAge1 <= 6) {
            System.out.println("Если возраст человека равен  " + peopleAge1 + " года,  о ему нужно ходить в детский сад. ");
        } else if (peopleAge1 >= 7 && peopleAge1 <= 18) {
            System.out.println("Если возраст человека равен  " + peopleAge1 + "лет,  о ему нужно ходить в школу. ");
        } else if (peopleAge1 >= 18 && peopleAge1 <= 24) {
            System.out.println("Если возраст человека равен  " + peopleAge1 + "год,  то его место в университете. ");
        } else if (peopleAge1 >= 24) {
            System.out.println("Если возраст человека равен  " + peopleAge1 + "лет,  то ему пора ходить на работу. ");
        }
        //ex5;
        System.out.println("условный оператор Задача -5");
        int ageSk = 15;
        if (ageSk <= 5)
            System.out.println("Если возраст ребенка равен " + ageSk + ", то ему нельзя кататься на аттракционе");
        else if (ageSk <= 14)
            System.out.println("Если возраст ребенка равен " + ageSk + ", то он может кататься на аттракционе в сопровождении взрослых");
        else System.out.println("Если возраст ребенка равен " + ageSk + ", то ему можно кататься на аттракционе");
        //ex6;
        System.out.println("условный оператор Задача -6");
        int count = 65;
        if (count <= 60) System.out.println("Есть сидячие");
        else if (count <= 102) System.out.println("Есть стоячие.");
        else System.out.println("Мест нет.");
        //ex7;
        System.out.println("условный оператор Задача -7");

    int Simb1 = 1;
    int Simb2= 2;
    int Simb3 = 3;
    if (Simb1 > Simb2 && Simb1 > Simb3) {
        System.out.println("Большее число " + Simb1);}
        else if (Simb2 > Simb1 && Simb2 > Simb3) {
            System.out.println("Большее число " + Simb2);}
        if (Simb3 > Simb2 && Simb3 > Simb1) {
            System.out.println("Большее число " + Simb3);} }
}



