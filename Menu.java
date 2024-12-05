public class Menu {

    public Menu(){
        System.out.println();
        System.out.println("1 -> Ajouter un contact");
        System.out.println("2 -> Rechercher un contact");
        System.out.println("3 -> Afficher tous les contacts");
        System.out.println("4 -> Quitter");
        System.out.println();
    }

    public void getMenuByCategory(String title){
        switch (title){
            case "add":
                System.out.println();
                System.out.println("1 -> Entrez un nouveau contact");
                System.out.println("2 -> Retour au menu principal");
                break;
            case "search":
                System.out.println();
                System.out.println("1 -> Rechercher un nouveau contact");
                System.out.println("2 -> Retour au menu principal");
                break;
            case "show":
                System.out.println();
                System.out.println("3 -> Lister les contacts à nouveau");
                System.out.println("4 -> Retour au menu principal");
                break;
            case "order":
                System.out.println();
                System.out.println("1 -> Par ordre croissant");
                System.out.println("2 -> Par ordre décroissant");
                break;
            default:
                System.out.println("Il n'y a pas de menu à afficher");
        }
    }
}
