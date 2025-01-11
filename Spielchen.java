import java.util.Random;
import java.util.Scanner;

public class Spielchen {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Willkommen zum Spielchen!");
        System.out.println();
        System.out.println("Was willst du tun? Bitte wähle aus, indem du eine Nummer eingibst.");
        System.out.println("1. Das Spiel beginnen");
        System.out.println("2. Spielanleitung");
        System.out.println("3. Beenden");

        int auswahl = sc.nextInt();
        
        sc.nextLine();
        
        if (auswahl==1) {
            starteSpiel(sc);
        } else if (auswahl==2) {
            Spielanleitung(sc);
         }else if (auswahl==3) {
            System.out.println("Bis Bald!");
            System.exit(0);
         } else {
            System.out.println("Ungültige Einagbe. Bitte nochmal versuchen.");
         }
}


public static void Spielanleitung(Scanner sc) {
    
    System.out.println("Es handelt sich hier um ein Textbasiertes Adventurespiel.");
    System.out.println("Du als Spieler kannst mit deinen Einagben über den Spielverlauf entscheiden.");
    System.out.println("Bei der Eingabe handelt es sich um Zahlen welche deinen Optionen darstellen.");
    System.out.println();
    System.out.println("Bist du bereit ?");
    System.out.println("Bitte wähle Ja oder Nein");
    
    String bistdubereit = sc.nextLine();
    
    if (bistdubereit.equalsIgnoreCase("Ja")) {
        starteSpiel(sc);
    } else if (bistdubereit.equalsIgnoreCase("Nein")) {
        System.exit(0);
    } else {
        System.out.println("Ungültige Einagbe. Bitte nochmal versuchen.");
     }
    }
     
public static void starteSpiel(Scanner sc) {
    System.out.println("Du wachst in einem düsteren, verlassenen Schloss auf.");
    System.out.println("Der Duft von Staub und altem Holz liegt in der Luft. Du hast keine Erinnerung daran, wie du hierhergekommen bist.");
    System.out.println("Vor dir liegt ein verwinkelter Gang, der in den Tiefen des Schlosses verschwindet.");
    System.out.println("Du hörst seltsame Geräusche aus der Dunkelheit. Dein Ziel ist klar: Du musst herausfinden, was passiert ist und wie du diesem Ort entkommen kannst.");
    System.out.println();
    System.out.println("Was willst du tun?");
    System.out.println("1. Den Gang untersuchen");
    System.out.println("2. Nach einem Ausweg suchen");
    System.out.println("3. Die Tür hinter dir verschließen und hoffen, dass alles nur ein Albtraum ist");
    
    int ersteoption = sc.nextInt();
    sc.nextLine();
    
    if (ersteoption == 1) {
        ersteOptionWürfel(sc);
    }
}

    
     
    public static void ersteOptionWürfel(Scanner sc) {
        System.out.println("Du gehst den Gang entlang und siehst einen seltsamen Würfel. Was willst du machen?");
        System.out.println("1. Den Würfel nehmen.");
        System.out.println("2. Den Gang weiter gehen.");
        int auswahl = sc.nextInt();
        sc.nextLine();
        if (auswahl==1) {
            System.out.println("Du nimmst den Würfel und würfelst ihn den Gang hinunter...");
            würfelWerfen(sc);
        } else if (auswahl==2) {
            System.out.println("Während du den Gang weiter gehst ergreift dich ein Werwolf hinterlistig aus einer Ecke.");
            System.out.println("Du hast verloren.");
            System.exit(0);
    }
}
    
    public static void würfelWerfen(Scanner sc) {
        Random rand = new Random();
        int würfelergebnis = rand.nextInt(6) + 1;
        System.out.println("Du hast den Würfel geworfen und das Ergebnis ist: " + würfelergebnis);

        if (würfelergebnis > 3) {
            System.out.println("Der Würfel hat dir Glück gebracht! Du findest einen geheimen Raum und entkommst dem Schloss!");
            System.exit(0);
        } else {
            System.out.println("Leider war das Würfeln nicht zu deinen Gunsten. Ein Schatten erscheint und du bist verloren!");
            System.exit(0);
    }
}



}