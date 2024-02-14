public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
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
        var boxerOne = 78.2;
        var boxersTwo = 82.7;
        var totalWeight = boxerOne + boxersTwo;
        System.out.println("Общая масса двух бойцов " + totalWeight + "кг");
        var weightDifference = boxerOne - boxersTwo;
        System.out.println("Разница между массами бойцов " + weightDifference + "кг");
        var difference = (boxerOne + boxersTwo) % boxerOne;
        System.out.println ("Разница между массами бойцов " + difference + "кг");
        var hours = 640;
        var onePersonWorking = 8;
        var numberOfPeople = hours / onePersonWorking;
        System.out.println("Всего работников в компании " + numberOfPeople + " человек");
        var newNumberOfPeople = numberOfPeople + 92;
        var numberOfHoursPerPerson = hours / newNumberOfPeople;
        System.out.println("Новое количество людей в фирме " + newNumberOfPeople + " Человек" );
        System.out.println(("Если в компании работает " + newNumberOfPeople + " человека " ) + "то всего " + numberOfHoursPerPerson + " часов работы может быть поделено между сотрудниками");



    }
}