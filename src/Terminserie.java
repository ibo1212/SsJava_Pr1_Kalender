public class Terminserie {

    private String name;
    private Termin [] termine ;


    public void getName(String name){
        this.name= name;
    }
    public String getName() {
        return name;
    }

    public Termin getTermin(int index){
        return termine[index];
    }



}
