public class Owner{
  private String name;
  private int age;
  private boolean drivingLicence;

  public Owner(String name, int age, boolean drivingLicence){
    this.name = name;
    this.age = age;
    this.drivingLicence = drivingLicence;
  }
  public String getOwner(){
    return this.name;
  }

  public int getAge(){
    return this.age;
  }
  public boolean getDrivingLicence(){
    return this.drivingLicence;
  }

  public String canDrive(){
   if (this.drivingLicence = true)
   {
   return "he can drive";
   }
   else 
   {
   return "he cannot drive";
   }
  }

}
