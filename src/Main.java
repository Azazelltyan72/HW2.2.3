public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        Human maksim = new Human("Максим", "Минск", 1987, "бренд-менеджера");
        System.out.println(maksim);
        Human anya = new Human("Аня", "Москва", 1993, " методиста образовательных программ");
        System.out.println(anya);
        Human katya = new Human("Катя", "Калининград", 1994, "продакт-менеджера");
        System.out.println(katya);
        Human artem = new Human("Артём", "Москва", 1995, "директора по развитию бизнеса");
        System.out.println(artem);
        System.out.println();
        System.out.println("Task 2");
        Car lada = new Car("Лада", "Гранта", "2015", "Россия", "желтый", "1,7 л");
        System.out.println(lada);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", "2020", "Германия", "чёрный", "3,0 л");
        System.out.println(audi);
        Car bmw = new Car("BMW", "Z8", "2021", "Германия", "чёрный", "3,0 л");
        System.out.println(bmw);
        Car kia = new Car("Kia", "Sportage 4-го поколения", "2018", "Южная Корея", "красный", "2,4 л");
        System.out.println(kia);
        Car hyundai = new Car("Hyundai", "Avante", "2016", "Южная Корея", "оранжевый", "1,6 л");
        System.out.println(hyundai);
    }
}