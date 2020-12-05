package banque.exception;

/************************************************************
 * Cette exception est levée par la Classe AgenceBancaire lorsque un compte existe dans l'angence.<BR>
 * 
 * @author André Péninou.
 * @version 3.0
 *****************************/

public class ABCompteDejaExistantException  extends Exception  {

	/**
	 * Constructeur par défaut.<BR>
	 */
	public ABCompteDejaExistantException() {
		this("Erreur sur un objet de la classe AgenceBancaire");
	}

	/**
	 * Constructeur paramétré.<BR>
	 * 
	 * @param message
	 *            information qui sera affichée si l'exception est affichée à
	 *            l'écran
	 */
	public ABCompteDejaExistantException(String message) {
		super(message);
	}

}
