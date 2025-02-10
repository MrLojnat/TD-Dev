package objects;

public interface Document {
    int numero();

    // return null si pas emprunté ou pas réservé
    Abonne emprunteur() ; // Abonné qui a emprunté ce document
    Abonne reserveur() ; // Abonné qui a réservé ce document

    // Précondition : ni réservé ni emprunté
    void reservationPour(Abonne ab) throws EmpruntException;

    // precondition : libre ou réservé par l’abonné qui vient emprunter
    void empruntPar(Abonne ab) throws EmpruntException;

    // retour d’un document ou annulation d'une réservation
    void retour();
}
