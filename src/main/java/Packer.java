import java.util.ArrayList;
import java.util.List;

public class Packer {

    public static void main(String[] args) {
        Packer packer = new Packer();
        Box<Food> foodBox = new Box<>();
        Box<Cake> cakeBox = new Box<>();
        Box<Pie> pieBox = new Box<>();

        packer.repackage(foodBox, cakeBox);
        packer.repackage(pieBox, foodBox);
    }

    public void repackage(Box<? extends Goods> from, Box<? super Bakery> to) {
        to.put(from.get());
    }
}
