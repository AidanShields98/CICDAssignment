package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PassengerTest {
    Passenger myPassenger;

    @BeforeEach
    void setUP() {
        myPassenger = new Passenger(null,null,null,null,0);
    }

    @Test
    void testTitleSuccessMr() {
        myPassenger = new Passenger("Mr","Aidan","G0037058710","1234567890",22);
        assertEquals("Mr",Passenger.getTitle());
    }

    @Test
    void testTitleSuccessMrs() {
        myPassenger = new Passenger("Mrs","Aidan","G0037058710","1234567890",22);
        assertEquals("Mrs",Passenger.getTitle());
    }

    @Test
    void testTitleSuccessMs() {
        myPassenger = new Passenger("Ms","Aidan","G0037058710","1234567890",22);
        assertEquals("Ms",Passenger.getTitle());
    }

    @Test
    void testNameSuccess() {
        myPassenger = new Passenger("Ms","Aidan","G0037058710","1234567890",22);
        assertEquals("Aidan",Passenger.getName());
    }

    @Test
    void testIdSuccess() {
        myPassenger = new Passenger("Ms","Aidan","G0037058710","1234567890",22);
        assertEquals("G0037058710",Passenger.getId());
    }

    @Test
    void testPhoneSuccess() {
        myPassenger = new Passenger("Ms","Aidan","G0037058710","1234567890",22);
        assertEquals("1234567890",Passenger.getPhone());
    }

    @Test
    void testAgeSuccess() {
        myPassenger = new Passenger("Ms","Aidan","G0037058710","1234567890",22);
        assertEquals(22,myPassenger.getAge());
    }



    @Test
    void testTitleFails(){
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, ()-> {myPassenger.Passenger("Yes","Aidan","G0037058710","1234567890",20);});
        assertEquals(ex.getMessage(),"Title must be either Mr, Ms or Mrs");
    }

    @Test
    void testNameFails(){
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, ()-> {myPassenger.Passenger("Mr","A","G0037058710","1234567890",20);});
        assertEquals(ex.getMessage(),"Name must be greater than 3 characters");
    }

    @Test
    void testIdFails(){
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, ()-> {myPassenger.Passenger("Mr","Aidan","G00","1234567890",20);});
        assertEquals(ex.getMessage(),"Id must be greater than 10 characters");
    }

    @Test
    void testPhoneFails(){
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, ()-> {myPassenger.Passenger("Ms","Aidan","G0037058710","12345",20);});
        assertEquals(ex.getMessage(),"Phone must be greater than 7 characters");
    }

    @Test
    void testAgeFails(){
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, ()-> {myPassenger.Passenger("Mrs","Aidan","G0037058710","1234567890",14);});
        assertEquals(ex.getMessage(),"Age must be greater than 16");
    }


    @AfterEach
    void tearDown() {

    }
}
