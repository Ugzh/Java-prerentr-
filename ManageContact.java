import java.util.Scanner;

public class ManageContact {
    private String firstname;
    private String lastname;
    private String phoneNumber;

    Scanner listenKeyboard = new Scanner(System.in);
    public ManageContact(){
        System.out.print("Entrez son nom : ");
        lastname = listenKeyboard.next();
        System.out.print("Entrez son prénom : ");
        firstname = listenKeyboard.next();
        System.out.print("Entrez son numéro de téléphone : ");
        phoneNumber = listenKeyboard.next();
    }

    public String getFirstname(){
        return firstname;
    }

    public String getLastname(){
        return lastname;
    }


    public void showInformations(){
        firstname = firstname.replace(firstname.charAt(0), Character.toUpperCase(firstname.charAt(0)));
        System.out.println( firstname + " " +lastname.toUpperCase() + " : " + phoneNumber );
    }
}
