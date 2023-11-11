import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
   // private String result = "result.txt";
    public static void main(String[] args) {
        Toy toy1 = new Toy(1, "Кукла", 10, 30);
        Toy toy2 = new Toy(2, "Машинка", 5, 20);
        Toy toy3 = new Toy(3, "Мишка Тедди", 8, 50);

        ToyBasket toyBasket = new ToyBasket();
        toyBasket.addToy(toy1);
        toyBasket.addToy(toy2);
        toyBasket.addToy(toy3);
        System.out.println("Начало розыгрыша");

        Toy randomToy = toyBasket.getRandomToy();
        if (randomToy != null) {                
            System.out.println("Тебе досталась игрушка '" + randomToy.getTitle() + "'!");           
           
            try {
                // Запись выигранной игрушки в файл "result.txt"
                FileWriter writer = new FileWriter("result.txt", true);
                writer.write(randomToy.getTitle() + "\n");
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
                  
            
            System.out.println("Игрушек '" + randomToy.getTitle() + "' осталось: " + randomToy.getQty());
        } else {
            System.out.println("Не удалось получить случайную игрушку.");
        }
    }
}
