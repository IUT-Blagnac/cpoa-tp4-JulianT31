package application.actionList;

import application.action.ActionDepotCompte;
import application.action.ActionListeDesComptes;
import banque.AgenceBancaire;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

/**
 * @author Julian TRANI
 */
public class GenericActionListTest {
    GenericActionList<AgenceBancaire> genericActionList = new GenericActionList("Message" ,"0" , "Title") ;

    @Test
    void actionMessageTest() {
        assertEquals("Message",genericActionList.actionMessage()) ;
    }

    @Test
    void actionCodeTest() {
        assertEquals("0",genericActionList.actionCode()) ;
    }

    @Test
    void listTitleTest() {
        assertEquals("Title",genericActionList.listTitle()) ;
    }

    @Test
    void ArraylistInit() {
        assertEquals(0,genericActionList.size());
    }

    @Test
    void addNoExistingAction() {
        assertEquals(true,genericActionList.addAction(new ActionDepotCompte("1")));
    }

//    @Test
//    void addExistingAction() {
//        genericActionList.addAction(new ActionDepotCompte("1")) ;
//        genericActionList.addAction(new ActionListeDesComptes("2")) ;
//        assertEquals(false,genericActionList.addAction(new ActionDepotCompte("1")));
//    }
}