import java.time.Duration;

public class Termin {
    private  String name ;
   private java.time.LocalDateTime start;
   private java.time.LocalDateTime ende;



    public void init(String name ,java.time.LocalDateTime start ,java.time.LocalDateTime end){
     this.name = name;
     this.start=start;
     this.ende=end;

    }


 public String getName(){

        return this.name;
 }
public void setName(String name){
        this.name=name;
}

    public long   getDauer(){

        Duration duration =  Duration.between(start,ende);
        return duration.toMinutes();

    }


}
