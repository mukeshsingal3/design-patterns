package Creational.AbstractFactoryPattern.products;


public class DominosFoodMenu extends FoodMenu {
    public DominosFoodMenu(String menuStyle) {
        super(menuStyle);
    }

    @Override
    public void render() {
        System.out.println("Dominos Style Food Menu");
    }
}
