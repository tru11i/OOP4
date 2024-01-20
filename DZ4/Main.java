package DZ4;

public class Main {
    // Шаг 3: Наполнение коробки фруктами
    public static Box<Fruit> getFruitBox() {
        Box<Fruit> box = new Box<>();
        box.put(new Apple());
        box.put(new Orange());
        return box;
    }

    // Шаг 4: Вывод содержимого коробки
    public static void printBox(Box<? extends Fruit> box) {
        System.out.println(box.get().toString());
    }

    public static void main(String[] args) {
        Box<Fruit> fruitBox = getFruitBox();
        printBox(fruitBox);
    }
}