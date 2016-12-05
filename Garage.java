public class Garage{
  private String name;

  private Car[] park;
  private Owner[] owner;


  public Garage(String name){
    this.name = name;
    this.park = new Car[10];
  }
  public String getName(){
    return this.name;
  }

  public int parkCount(){
    int count = 0;
    for(Car car : park){
      if ( car != null) {
        count ++ ;
      }
    }
    return count;
  }

  public boolean parkFull(){
    return parkCount() == park.length;
  }

  public void park(Car car){
    if (parkFull()){
      return;
    }
    int parkCount = parkCount();
    park[parkCount] = car;
  }

  public void leave(){
    for (int i = 0; i < park.length; i++){
      park[i] = null;
    }
  }


}