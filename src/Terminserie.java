import java.util.Arrays;

public class Terminserie {

    private String name = "";//  so String name ; ist bedeutet  null Instanz . man darf nicht auf Null-Instanz zugreifen
    private Termin[] termine;


    public void init(int anzahl, java.time.LocalDateTime start, java.time.LocalDateTime ende, int interval) {
        this.termine = new Termin[anzahl];

        for (int i = 0; i < anzahl; i++) {

            termine[i] = new Termin();
            termine[i].init(name, start.plusDays(interval * i), ende.plusDays(interval * i));



        }


    }



    public String getName() {

        return name;
    }


    public void setName(String name) {
        this.name = name;
        for (int i = 0; i < termine.length; i++) {// Itertsion ist boolescher Vergleich

            termine[i].setName(name);

        }

    }

    public Termin getTermin(int index) {
        if (index < 0 || index >= termine.length) {
            System.out.println(" Index ist ungültig");
            return null;// Referenz ist ungültig
        }

        return termine[index];
    }

    public int getAnzahl()  // da array private ist .
    {

        return termine.length;

    }
}
