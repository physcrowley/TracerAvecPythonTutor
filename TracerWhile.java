/*
    Instructions pour le traçage (utiliser Python Tutor.com):
    1. Suivre la valeur de `mode` et prédire quel chemin dans la cascade
        de conditions le programme va suivre (le `if`, le `else if` ou l'`else`).
    2. Dans chaque mode (choix et compte), il y a une "variable de boucle",
        soit la variable qui est utilisée dans la condition. Suivre sa valeur
        et prédire quand la boucle va prendre fin. À quelle ligne de code
        est-ce que la boucle retourne chaque fois avant de se répéter? Modifier
        la valeur de la variable `mode` pour tracer l'exécution dans chaque mode.
    3. Où saute le programme à la fin de chaque boucle? À la fin de chaque partie
        de la cascade de conditions?
    4. Qu'est-ce qui se passe à la variable de boucle lorsqu'on quitte le
        bloc de la cascade où il a été définie? Est-ce que la même chose se passe
        avec la variable `mode`? Pourquoi?
*/

public class TracerWhile {
    public static void main(String[] args) {
        String mode = "compte"; // "choix" ou "compte"

        if ( mode.equals( "choix" ) ) {
            System.out.println( "MODE CHOIX\n");
            int choix = 0;
            System.out.println( "La valeur est " + choix );
            System.out.print( "\tElle est maintenant ");
            while ( choix != 2 ) {
                choix = (int) ( 1 + 3 * Math.random() ); // 1 à 3
                System.out.print( choix + "... " );
            }
            System.out.println( "\nFin de la boucle 'choix'." );
        } 
        else if ( mode.equals( "compte" ) ) {
            System.out.println( "MODE COMPTE\n" );
            int i = 0;
            while ( i < 10 ) {
                System.out.print( i + "... " );
                i++;
            }
            System.out.println( "\nFin de la boucle 'compte'." );
        } 
        else {
            System.out.println( "Oops, mauvais mode : [choix] ou [compte]");
        }
        System.out.println( "Fin du programme" );
    }
}
