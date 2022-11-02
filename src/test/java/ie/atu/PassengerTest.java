package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PassengerTest {
    Passenger myPassenger;

    @BeforeEach
    void setUP() {
        myPassenger = new Passenger("Mr","Jerry", "g890475", "123212321", 17);
    }

    @Test
    void testTitlePassesMr(){
        Passenger.setTitle("Mr");
        assertEquals("Mr", Passenger.getTitle());
    }

    @Test
    void testTitlePassesMs(){
        Passenger.setTitle("Ms");
        assertEquals("Ms", Passenger.getTitle());
    }

    @Test
    void testTitlePassesMrs(){
        Passenger.setTitle("Mrs");
        assertEquals("Mrs", Passenger.getTitle());
    }

    @Test
    void testNamePasses(){
        Passenger.setName("Jason");
        assertEquals("Jason", Passenger.getName());
    }

    @Test
    void testIdPasses(){
        Passenger.setId("G00370587");
        assertEquals("G00370587", Passenger.getId());
    }

    @Test
    void testPhonePasses(){
        Passenger.setPhone("0871230088");
        assertEquals("0871230088", Passenger.getPhone());
    }

        @Test
    void testAgePasses(){
        Passenger.setAge(17);
        assertEquals(17,Passenger.getAge());
    }

    @Test
    void testTitleFails(){
        Passenger.setTitle("Yas");
        assertEquals("Title must be either Mr, Ms or Mrs", Passenger.getTitle());
    }

    @Test
    void testNameFails(){
        Passenger.setName("b");
        assertEquals("Name must be greater than 3 characters", Passenger.getName());
    }

    @Test
    void testIdFails(){
        Passenger.setId("12");
        assertEquals("Id must be greater than 10 characters", Passenger.getId());
    }

    @Test
    void testPhoneFails(){
        Passenger.setPhone("12345");
        assertEquals("Phone must be greater than 7 characters", Passenger.getPhone());
    }

    @Test
    void testAgeFails(){
        Passenger.setAge(12);
        assertEquals("Age must be greater than 16",Passenger.getAge());
    }

    @AfterEach
    void tearDown() {

    }
}
