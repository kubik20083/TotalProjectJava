


public class Main {
    public static void main(String[] args) {
        Toy toy1 = new Toy(1, "Кукла", 10, 30);
        Toy toy2 = new Toy(2, "Машинка", 5, 20);
        Toy toy3 = new Toy(3, "Мишка Тедди", 8, 50);

        ToyBasket toyBasket = new ToyBasket();
        toyBasket.addToy(toy1);
        toyBasket.addToy(toy2);
        toyBasket.addToy(toy3);

        Toy randomToy = toyBasket.getRandomToy();
        if (randomToy != null) {
            System.out.println("Тебе досталась игрушка '" + randomToy.getTitle() + "'!");
            System.out.println("Игрушек '" + randomToy.getTitle() + "' осталось: " + randomToy.getQty());
        } else {
            System.out.println("Не удалось получить случайную игрушку.");
        }
    }
}