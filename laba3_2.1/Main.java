import enums.Places;
import source.Shorty;
import source.Sleepwalkers;
import source.Telecast;
import source.Viewers;

public class Main {
    public static void main(String[] args) {
        Telecast telecast = new Telecast("передача");
        Viewers policemen = new Viewers("полицейские");
        policemen.watch(telecast);

        Sleepwalkers lunatiki = new Sleepwalkers("лунатики");
        Places.listOfPlaces();
        lunatiki.planted(Places.NEELOVKA);
        lunatiki.planted(Places.GOLOPYATKINO);
        lunatiki.planted(Places.BESHLEBOVO);
        lunatiki.planted(Places.GOLODAEVKA);
        lunatiki.planted(Places.NEPROLAZNOE);

        Shorty znaika = new Shorty("Знайка");
        znaika.suplie(lunatiki, "семена растений");
    }
}