package application.action;

import banque.AgenceBancaire;
import banque.Compte;

import java.util.Scanner;

/**
 * @Author : Julian TRANI 2B
 */
public class ActionVoirCompteNumero implements Action<AgenceBancaire>{
    private String message ;
    private String code ;

    /**
     * Constructeur
     * @param code
     */
    public ActionVoirCompteNumero(String code) {
        this.message = "Voir un compte par son numéro";
        this.code = code;
    }

    @Override
    public String actionMessage() {
        return message;
    }

    @Override
    public String actionCode() {
        return code;
    }

    @Override
    public void execute(AgenceBancaire ag) throws Exception {
        // Saisie
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le numéro du compte --> ");
        String numCompte = scanner.nextLine();

        Compte c = ag.getCompte(numCompte) ;
        if (c==null) {
            System.out.println("\nCompte inexistant ...\n");
        } else {
            c.afficher();
        }

        System.out.println("\n");
    }
}
