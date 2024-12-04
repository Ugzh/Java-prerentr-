import java.util.*;

public class Contacts {
    public static void main(String[] args) {
        byte choice;
        byte select;
        ArrayList<ManageContact> contactManipulation = new ArrayList<ManageContact>();
        Scanner keyboardListener = new Scanner(System.in);
        do {
            Menu menu = new Menu();
            choice = keyboardListener.nextByte();
            switch (choice){
                case 1 :
                    System.out.println("Ajouter un nouveau contact");
                    System.out.println("");
                    contactManipulation.add(new ManageContact());
                    do {
                        menu.getMenuByCategory("add");
                        select = keyboardListener.nextByte();
                        if(select == 1) contactManipulation.add(new ManageContact());
                    } while (select != 2);
                    break;
                case 2 :
                    System.out.println("Rechercher un contact");
                    System.out.print("Entrez le nom ou le prénom du contact à chercher : ");
                    String username = keyboardListener.next();
                    contactManipulation.stream().filter(c -> c.getLastname().contains(username))
                            .forEach(e -> e.showInformations());
                    break;
                case 3 :
                    System.out.println("choix 3");
                    break;
                default:
                    break;
            }
        } while (choice != 4);
    }
}
