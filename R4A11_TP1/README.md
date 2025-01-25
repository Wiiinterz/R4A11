
QUESTION 1: Où se trouve le fichier ? Donnez son nom et son emplacement
 Le fichier activity_main.xml se trouve dans /app/scr/main/res/layout

QUESTION 2: Qu'avez vous modifié ?
On modifie le android:text dans le TextView du fichier activity_main.xml

QUESTION 3:Qu'avez vous modifié pour changer l'icone ?
 Pour modifier l'icone on change dans AndroidManifest.xml l'android:icon"@minimap/ic_launcher"
 et l'android:roundIcon="@minimap/ic_launcher_round"

QUESTION 4: Est-ce nécessaire de cliquer sur le bouton valider pour afficher le texte saisi sur la seconde activité ? Pourquoi ?
Non car on donne à l'Intent l'EditText

QUESTION 5: Le comportement de la question 4 vous semble t'il normal ?
Non

QUESTION 6: Comment faire pour ne pas afficher le nouveau texte sur la deuxième activité tant que le bouton n'a pas été cliqué ?
On doit donner à l'Intent le TexteView et non l'EditText


