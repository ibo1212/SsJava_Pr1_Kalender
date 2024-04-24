public class Kalender {

    private String name;
    private Termin[] termine;
    private Terminserie[] serien;

    public void init() {
        termine = new Termin[100];
        serien = new Terminserie[100];



    }

    public void setName() {
        if (name == null) {
            this.name = "leer";
        } else


            this.name = name;
    }


    public void addTermin(Termin termin){
        for ( int i = 0 ;i<= termine.length;i++){
            if(termine[i]==null){
                termine[i]=termin;
                break;
            }

        }


    }


    public void addSerie(Terminserie serie) {
        for ( int i = 0 ;i< serien.length;i++){
            if ( serien[i]==null){
                serien[i]=serie ;
                return;//

            }

        }
    }

    public void ausgeben() {
        for( int i = 0 ;i<=serien.length;i++){
            for(int j = 0;j<=serien[i].getAnzahl();j++ ){

                System.out.println(serien[i].getTermin(j)+"\n \t \t");
            }


        }

       // System.out.printf("alle Termine  %s",this);
        System.out.printf(" Der Name des Kalenders ist %s",this.name);


    }



}
