# Activités de traçage de programmes

Ce dossier contient du code pour se pratiquer avec le traçage des programmes.

Pour suivre la séquence naturelle du cours ICS3U, vous devriez faire les activités dans cet ordre :

* TracerSelection.java
* TracerWhile.java
* TracerFonction.java
* TracerFor.java
* TracerTableau.java
* TracerForEach.java

Vous devriez faire ces activités **en pairs**, soit avec un partenaire.

## Python Tutor

Le traçage dans ces activités peut se faire à la main, sur papier avec un crayon, mais je recommande de les faire avec [Python Tutor](https://pythontutor.com/visualize.html#mode=edit) utilisant la configuration suivante :

* "Write code in" -> **Java 8**
* changer l'option "inline primitives, don't nest objects [default]" à "render all objects on heap (Python/Java)"

>!!! Super important : cet outil ne prend pas en charge le `Scanner` ni la plupart des packages qui doivent être importés, alors tous les programmes sont écrits de façon statique (et non interactive).

#### Pour tracer les programmes étape-par-étape

1. Copier les exemples ici et les coller dans l'éditeur sur Python Tutor.
1. Cliquer sur le bouton "Visualize" et attendre la compilation et le chargement de la visualisation.
1. Cliquer sur le bouton "Next >" pour avancer pas-à-pas à travers le programme.
     * Noter ce qui s'affiche à la droite dans la zone de sortie, la zone "Frames" (la pile) et la zone "Heap" (le tas)
     * Noter les changements dans ces zones d'un pas à l'autre (ce qui apparaît, disparaît, change)
     * Noter la position des flèches : la rouge indique où le programme est rendu; la verte indique la dernière ligne exécutée.
1. Vous pouvez revenir à l'arrière pas-à-pas avec le bouton "< Previous" afin de revoir une section du programme.
1. Finalement, cliquer sur "Edit the code" pour modifier le programme afin de voir l'impact de la modification sur l'exécution en répétant les étapes de 2 jusqu'ici.
