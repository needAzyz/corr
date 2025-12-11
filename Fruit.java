public class Fruit extends Item implements Utiliser {
    private String taste;

    public Fruit(String name, int quantity, String taste) {
        super(name, quantity);
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    @Override

    void showinfo() {
        System.out.println("the item name is " + getName());
        System.out.println("the item quantity is " + getQuantity());
        System.out.println("the item taste is " + taste);
    }

    @Override
    public void utiliser() {
        System.out.println("item currly use");
    }
}
