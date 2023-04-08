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
    }

}