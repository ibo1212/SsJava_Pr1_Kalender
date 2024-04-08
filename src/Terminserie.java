public class Terminserie {

    private String name;
    private Termin [] termine ;


    public void init(int  anzahl, java.time.LocalDateTime start,java.time.LocalDateTime ende, int interval){




    }


    public void setName(String name){
        this.name= name;
    }
    public String getName() {
        return name;
    }

    public Termin getTermin(int index){
        return termine[index];
    }

    public int getAnzahl(){
        return 0;
    }
}
