public class Toy {
    private int id;
    private String title;
    private int qty;
    private int chance;

    public Toy(int id, String title, int qty, int chance) {
        this.id = id;
        this.title = title;
        this.qty = qty;
        this.chance = chance;
    }

    // Метод для изменения весовых характеристик игрушки
    public void setChance(int newChance) {
        this.chance = newChance;
    }

    // Метод для добавления игрушек
    public void addQty(int quantity) {
        this.qty += quantity;
    }

    // Метод для уменьшения количества игрушек
    public void decreaseQty() {
        this.qty -= 1;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getQty() {
        return qty;
    }

    public int getChance() {
        return chance;
    }
}