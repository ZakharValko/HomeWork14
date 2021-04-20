public class Box<T> {

    private Goods item;

    public <T extends Goods> void put(Goods item) {
        this.item = item;
    }

    public Goods get() {
        return this.item;
    }
}
