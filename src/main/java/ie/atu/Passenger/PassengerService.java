package ie.atu.Passenger;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class PassengerService {



        public List<Passenger> getPassengers(){
            List<Passenger> myPassengers = List.of(
                    new Passenger("Mr", "aidan", "1263", 619L, 24),
                    new Passenger("Mr", "AIDAN", "1543d3",  629L, 21),
                    new Passenger("Mr", "Aidan", "16433", 618L, 22));
            return myPassengers;

        }

        @GetMapping("/{passengerID}")
        public Passenger getPassenger(String passengerID){
            Passenger myPassenger = new Passenger("Mr", "Aidan", "123123", 619L, 24);
            return myPassenger;

        }


}
