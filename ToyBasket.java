import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToyBasket {
    private List<Toy> toys;

    public ToyBasket() {
        this.toys = new ArrayList<>();

    }

    // Метод для добавления игрушки в корзину
    public void addToy(Toy toy) {
        this.toys.add(toy);
    }

    // Метод для получения случайной игрушки из корзины
    public Toy getRandomToy() {
        // Подсчет общей суммы весовых характеристик
        int totalChances = toys.stream().mapToInt(Toy::getChance).sum();

        // Генерация случайного числа от 0 до общей суммы
        Random random = new Random();
        int randomValue = random.nextInt(totalChances);

        // Поиск игрушки по сгенерированному числу
        int currentSum = 0;
        for (Toy toy : toys) {
            currentSum += toy.getChance();
            if (randomValue <= currentSum) {
                toy.decreaseQty(); // Уменьшение количества игрушек
                return toy;
            }
        }

        // Если не удалось выбрать игрушку (возможно, из-за некорректных весовых характеристик)
        return null;
    }
}