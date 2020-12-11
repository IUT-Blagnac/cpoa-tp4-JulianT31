package banque;

import banque.exception.CompteException;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Julian TRANI
 */
public class CompteTest {

    @Test
    public void deposerNegativeValue() {
        Compte cpt = new Compte("00101", "TEST") ;
        try {
            cpt.deposer(-50);
        } catch (CompteException e) {
            assertTrue("Erreur",e.getMessage().contains("Erreur de somme "));
        }
    }

    @Test
    public void retirerNegativeValue() {
        Compte cpt = new Compte("00101", "TEST") ;
        try {
            cpt.retirer(-50);
        } catch (CompteException e) {
            assertTrue("Erreur",e.getMessage().contains("Erreur de somme "));
        }
    }

    @Test
    public void soldeCompte() {
        Compte cpt = new Compte("00101","TEST") ;
        try {
            cpt.deposer(500);
            cpt.deposer(50);
            cpt.deposer(100);
            cpt.retirer(600);
        } catch (CompteException e) {
            e.printStackTrace();
        }
        double solde = cpt.soldeCompte() ;
        assertEquals(50, solde,0);
    }

    @Test
    public void nomCompte() {
        Compte cpt =new Compte("00101","TEST");
        assertEquals("00101", cpt.getNumCompte());
    }

    @Test
    public void proprioCompte() {
        Compte cpt =new Compte("00101","TEST");
        assertEquals("TEST", cpt.getProprietaire());
    }
}