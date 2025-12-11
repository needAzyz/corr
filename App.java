import java.util.Scanner;
public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("donner le taille de tab :");
        int n = scanner.nextInt();
        scanner.nextLine();
        Item[] items = new Item[n];
        for(int i = 0; i <n;i++){
            System.out.print("what is the type of item u wanna save (1.fruit / 2.weapon): ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) {
                System.out.print("donner le nom de fruit: ");
                String name = scanner.next();
                System.out.println("donner le quanity de fruit");
                int quantity = scanner.nextInt();
                scanner.nextLine();
                System.out.println("donner le taste de fruit");
                String taste = scanner.next();
                items[i] = new Fruit(name, quantity, taste);

            } else if (choice == 2) {
                System.out.println("donner le nom de weapon");
                String name = scanner.next();
                System.out.println("donner le quanity de weapon");
                int quantity = scanner.nextInt();
                scanner.nextLine();
                System.out.println("donner le damage de weapon");
                int damage = scanner.nextInt();
                scanner.nextLine();
                items[i] = new Weapon(name, quantity, damage);

            }  
        }
        for(Item item : items){
            item.showinfo();
            item.utiliser();
        }
        scanner.close();
    }
}
