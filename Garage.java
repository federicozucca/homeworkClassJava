import java.util.*;

public class Garage{

  private String name;

  private ArrayList<Parkable>park;
  private Owner[] owner;


  public Garage(String name){
    this.name = name;
    this.park = new ArrayList<Parkable>();
  }
  public String getName(){
    return this.name;
  }

  public int parkCount(){
    return park.size();
  }

  public void canPark(Car car)
    {
    park.add(car);
  }

  // public void leave(){
  //   if (parkCount()>0){
  //     return park.remove(0); 
  //   }
  //   return null;
  // }


}