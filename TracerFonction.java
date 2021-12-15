/*
    Dans Python Tutor, changer l'option "inline primitives, don't nest objects 
    [default]" à "render all objects on heap (Python/Java)" afin de mieux 
    voir les variables en mémoire.

    1. Tracer l'exécution du programme comme il est écrit en ce moment. Où va
        l'exécution quand la fonction `bonjour()` est appelé dans `main()`?
        Qu'est-ce qui apparaît en mémoire (sous la section "Frames")?
    2. Où va l'exécution quand `bonjour()` est terminé? Qu'est-ce qui se passe 
        en mémoire?
    3. Enlever le commentaire sur le 2e bonjour et tracer l'exécution du 
        programme encore.
    4. Enlever les commentaires sur les 2 autres appels de fonctions et tracer 
        l'exécution une autre fois.
    5. Modifier la fonction `bonjour()` en ajoutant un appel à `autre()` après
        le `System.out.println()`. Garder juste un appel à `bonjour()` dans
        `main()` et tracer l'exécution. Qu'est-ce qui se passe en mémoire?
*/

public class TracerFonction {
    public static void main( String[] args ) {
        bonjour();
        //bonjour();
        //autre();
        //bonjour();
    }
    
    private static void bonjour() {
        System.out.println( "Bonjour" );
    }

    private static void autre() {
        System.out.print( "Voici un nombre aléatoire : ");
        System.out.printf( "%.0f\n", 100 * Math.random() );
    }
}
