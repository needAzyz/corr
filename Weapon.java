public class Weapon extends Item implements Utiliser {
    private int damage;

    public Weapon(String name, int quantity, int damage) {
        super(name, quantity);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    void showinfo() {
        System.out.println("the item name is " + getName());
        System.out.println("the item quantity is " + getQuantity());
        System.out.println("the item damage is " + damage);
    }

    @Override
    public void utiliser() {
        System.out.println("item currly use");
    }

}