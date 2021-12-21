/*
    Dans Python Tutor, tracer l'exécution de ce programme avec le bouton "Next >"
    en portant attention aux éléments suivants :

    1. Quand le tableau de type String est créé, quelle valeur initiale est assignée
    par défaut à chaque String?

    2. C'est quoi la longueur du tableau de String? C'est quoi la valeur du dernier 
    indexe pour ce tableau?

    3. Pourquoi le programme explose quand on essaie d'afficher l'élément 
    'noms[ noms.length ]' ? Sans supprimer ce qui est déjà là ni cacher de code avec 
    un commentaire, modifie la ligne de code afin qu'il affiche le dernier élément 
    sans exploser. (indice : regarde tes réponses au numéro 2.)

    4. Avec la boucle "for avec les indices", la boucle modifie directement les 
    éléments du tableau. Comment est-ce qu'on le voit durant le tracage?

    5. Avec la boucle "for each", la boucle modifie une COPIE des éléments 
    du tableau. Comment est-ce qu'on le voit durant le tracage? Où est-ce que la 
    copie est stockée? Est-ce que les copies restent après chaque itération de la 
    boucle? ...après la fin de la boucle? Est-ce que le valeur dans le tableau 
    change quand on change la copie?
*/

public class TracerTableau {
    public static void main( String[] args ) {
        String[] noms = new String[3];

        noms[ 0 ] = "Adèle";
        noms[ 1 ] = "Bruno";
        noms[ 2 ] = "Chloé";

        System.out.println( "Longeur de 'noms' : " + noms.length );
        String msg = "Item à l'indexe 'noms.length' : ";
        System.out.println( msg + noms[ noms.length ] ); // boom!

        System.out.print( "Noms avec 'for' et indexes :\n\t" );

        for (int i = 0; i < noms.length; i++ ) {
            noms[ i ] += "*";
            System.out.print( noms[ i ] + " " );
        }

        System.out.print( "\nNoms avec 'for each' :\n\t" );
        for ( String n : noms ) {
            n += "*";
            System.out.print( n + " " );
        }
    }
}