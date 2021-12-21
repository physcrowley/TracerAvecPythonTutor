/*
    Dans Python Tutor, tracer le programme suivant en utilisant le bouton "Next >"
  
    1. Pourquoi pensez-vous que la boucle "for" est utilisée quand on connaît le nombre
    exact de fois qu'on doit répéter une action (au lieu d'une boucle "while") ?
 
 */
public class TracerFor {
    public static void main(String[] args) {
        int i = 0;

        System.out.print("While :\n\t");
        while ( i < 3 ) {
            System.out.print( i + " " );
            i++;
        }
        System.out.println("après : " + i );
        
        System.out.print("For :\n\t");
        for ( int j = 0; j < 3; j++ ){
            System.out.print(j + " ");
        }
        // System.out.println( "après : " + j ); // ne fonctionne pas -> j est seulement défini dans le bloc for{}
    }
}
