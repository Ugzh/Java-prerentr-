import java.util.*;

public class Contacts {
    public static void main(String[] args) {
        byte choice;
        byte select;
        ArrayList<ManageContact> contactManipulation = new ArrayList<>();
        Scanner keyboardListener = new Scanner(System.in);
        System.out.println("*****************************");
        System.out.println("*****************************");
        System.out.println("**                         **");
        System.out.println("**     APPLI CONTACTS      **");
        System.out.println("**                         **");
        System.out.println("*****************************");
        System.out.println("*****************************");
        do {
            Menu menu = new Menu();
            choice = keyboardListener.nextByte();
            switch (choice){
                case 1 :
                    System.out.println();
                    System.out.println("Ajouter un nouveau contact");
                    System.out.println();
                    contactManipulation.add(new ManageContact());
                    do {
                        menu.getMenuByCategory("add");
                        select = keyboardListener.nextByte();
                        System.out.println();
                        if(select == 1) contactManipulation.add(new ManageContact());
                    } while (select != 2);
                    break;
                case 2 :
                    System.out.println();
                    System.out.println("Rechercher un contact");
                    do {
                        System.out.println();
                        System.out.print("Entrez le nom ou le prénom du contact à rechercher : ");
                        String username = keyboardListener.next();
                        System.out.println();
                        if(contactManipulation.stream().anyMatch(c -> c.getLastname().contains(username) || c.getFirstname().contains(username))){
                            contactManipulation.stream()
                                    .filter(c -> c.getLastname().contains(username) || c.getFirstname().contains(username))
                                    .forEach(ManageContact::showInformations);
                        } else {
                            System.out.println("Aucune correspondance n'a été trouvée ! (sur " + (contactManipulation.size() ) + " contact(s))");
                        }
                        menu.getMenuByCategory("search");
                        select = keyboardListener.nextByte();
                    } while (select != 2);
                    break;
                case 3 :
                    if(!contactManipulation.isEmpty()) {
                        System.out.println();
                        System.out.println("Liste de contacts");
                        System.out.println();
                        menu.getMenuByCategory("order");
                        select = keyboardListener.nextByte();
                        System.out.println();
                        if (select == 1) {
                            contactManipulation.stream()
                                    .sorted(Comparator.comparing(ManageContact::getLastname))
                                    .forEach(ManageContact::showInformations);
                        } else {
                            contactManipulation.stream()
                                    .sorted(Comparator.comparing(ManageContact::getLastname)
                                    .reversed())
                                    .forEach(ManageContact::showInformations);
                        }
                        do {
                            menu.getMenuByCategory("show");
                            select = keyboardListener.nextByte();
                            if(select == 3){
                                menu.getMenuByCategory("order");
                                select = keyboardListener.nextByte();
                                System.out.println();
                                if (select == 1) {
                                    contactManipulation.stream()
                                            .sorted(Comparator.comparing(ManageContact::getLastname))
                                            .forEach(ManageContact::showInformations);
                                } else {
                                    contactManipulation.stream()
                                            .sorted(Comparator.comparing(ManageContact::getLastname)
                                                    .reversed())
                                            .forEach(ManageContact::showInformations);
                                }
                            }
                        } while (select != 4);
                    } else {
                        System.out.println();
                        System.out.println("Il n'y a aucun contact à afficher !");
                    }
                    break;
                default:
                    break;
            }
        } while (choice != 4);
        System.out.println();
        System.out.println("A bientôt ");
        System.exit(0);
    }
}
