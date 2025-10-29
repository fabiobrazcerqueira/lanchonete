//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Obrigado pela preferência!");

        Item item1 = new Item("Passaporte de carne de boi", 12.99, 1);
        Item item2 = new Item("Passaporte de frango", 11.99, 3);
        Item item3 = new Item("Coca-cola", 5.99, 3);
        Item item4 = new Item("Guarana", 4.99, 4);

        Carrinho c = new Carrinho();

        c.adicionarItem(item2);
        c.adicionarItem(item1);
        c.adicionarItem(item3);
        c.adicionarItem(item4);

        c.removerItem (4);
        c.adicionarItem (item3);

        c.calcularPreco();
    }
}