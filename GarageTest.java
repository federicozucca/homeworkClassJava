import static org.junit.Assert.assertEquals;
import org.junit.*;

public class GarageTest{
  Garage garage;
  Car car;
  Owner owner;

  @Before 
  public void before() {
    garage = new Garage("Federico's");
    car = new Car("Ferrari");
    owner = new Owner("Jeff", 23, true);
  }

  @Test
  public void hasName(){
    assertEquals("Federico's", garage.getName()); 
  }

  @Test
  public void garageStartsEmpty(){
    assertEquals(0, garage.parkCount());
  }

  @Test 
  public void canPark(){
    garage.canPark(car);
    assertEquals(1,garage.parkCount());
  }

  // @Test
  // public void shouldEmptySpaceAfterLeaving(){
  //   garage.canPark(car);
  //  Parkable park = car.leave();
  //  assertNotNull(food);
  // }

  @Test
  public void hasModel(){
    assertEquals("Ferrari", car.getModel()); 
  }

  @Test
  public void hasOwner(){
    assertEquals("Jeff", owner.getOwner()); 
  }

  @Test
  public void OwnerAge(){
    assertEquals(23, owner.getAge()); 
  }

  @Test
  public void OwnerDrivingLicence(){
    assertEquals(true, owner.getDrivingLicence()); 
  }

  @Test
  public void OwnerCanDrive(){
    assertEquals("he can drive", owner.canDrive()); 
  }


}

