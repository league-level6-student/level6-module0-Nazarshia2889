package _08_mocking.models;

import _07_intro_to_mocking.models.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class DeliveryDriverTest {

    DeliveryDriver deliveryDriver;
    
    String name;
    
    @Mock
    Car car;
    
    @Mock
    CellPhone cellPhone;
    

    @BeforeEach
    void setUp() {
    	MockitoAnnotations.openMocks(this);
    	
    	deliveryDriver = new DeliveryDriver(name, car, cellPhone);
    }

    @Test
    void itShouldWasteTime() {
        //given
    	boolean expectedWasteTime = true;
    	
    	when(deliveryDriver.wasteTime()).thenReturn(true);

        //when
    	
    	boolean actualWasteTime = deliveryDriver.wasteTime();

        //then
    	
    	assertEquals(expectedWasteTime, actualWasteTime);
    }

    @Test
    void itShouldRefuel() {
    	//given
    	boolean expectedRefuel = true;
    	int octaneGrade = 80;
    	
    	when(deliveryDriver.refuel(octaneGrade)).thenReturn(true);

        //when
    	
    	boolean actualRefuel = deliveryDriver.refuel(octaneGrade);

        //then
    	
    	assertEquals(expectedRefuel, actualRefuel);
    }

    @Test
    void itShouldContactCustomer() {
    	//given
        boolean expectedContactCustomer = true;
        String phoneNumber = "121-121-1212";
        //The following line stubs the gasTank.getFuelLevel() method, so that it will return a value when it is invoked
        when(deliveryDriver.contactCustomer(phoneNumber)).thenReturn(true);

        //when
        boolean actualContactCustomer = deliveryDriver.contactCustomer(phoneNumber);

        //then
        assertEquals(expectedContactCustomer, actualContactCustomer);
    }

}