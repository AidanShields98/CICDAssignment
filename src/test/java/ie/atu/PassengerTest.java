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
        Passenger.setId("1234567890");
        assertEquals("1234567890", Passenger.getId());
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
        assertThrows(IllegalArgumentException.class, ()-> {myPassenger.setTitle("who");});
    }

    @Test
    void testNameFails(){
        assertThrows(IllegalArgumentException.class, ()-> {myPassenger.setName("s");});
    }

    @Test
    void testIdFails(){
        assertThrows(IllegalArgumentException.class, ()-> {myPassenger.setId("g0123");});
    }

    @Test
    void testPhoneFails(){
        assertThrows(IllegalArgumentException.class, ()-> {myPassenger.setPhone("187125441");});
    }

    @Test
    void testAgeFails(){
        assertThrows(IllegalArgumentException.class, ()-> {myPassenger.setAge(12);});
    }

    @AfterEach
    void tearDown() {

    }
}
