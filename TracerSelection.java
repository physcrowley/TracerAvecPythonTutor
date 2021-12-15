/*
    Utiliser https://pythontutor.com/visualize.html#mode=edit en mode "Java 8", 
        copier et coller la `class` ci-dessous et cliquer sur le bouton "Next >"  
        pour tracer l'exécution étape-par-étape.
 
    La cascade originale inclut seulement des `if`
        + tracer l'exécution avec cette cascade originale en modifiant 
            la valeur de `num`. Tenter de prédire les parties du code qui
            seront sautées et celles qui seront exécutées.
        + changer la cascade pour inclure des `else if` et tracer l'exécution. 
            Qu'est-ce qui change?
        + remplacer le dernier bloc avec seulement un `else` (supprimer aussi 
            la condition) et tracer l'exécution. Qu'est-ce qui change?
        + entrer une valeur entière qui fera en sorte que le programme affiche 
            une phrase qui est incorrecte. Modifier le code pour corriger 
            l'erreur de logique.
*/

public class TracerSelection {
    public static void main(String[] args) {
        int num = 15;

        System.out.println( "Le nombre est " + num );

        if ( num < 10 ){
            System.out.println( "\tLe nombre est moins que 10.");
        } if ( num < 50 ) {
            System.out.println( "\tLe nombre est moins que 50.");
        } if ( num < 100 ) {
            System.out.println( "\tLe nombre est moins que 100.");
        }
    }
}
