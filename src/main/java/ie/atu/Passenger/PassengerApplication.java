package ie.atu.Passenger;
import ie.atu.Passenger.Passenger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
@RequestMapping(path = "api/passenger")
public class PassengerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PassengerApplication.class, args);
	}


	@GetMapping
	public List<Passenger> getPassengers(){
		List<Passenger> myPassengers = List.of(
				new Passenger("Mr", "aidan", "1263", 619L, 24),
				new Passenger("Mr", "AIDAN", "1543d3",  629L, 21),
				new Passenger("Mr", "Aidan", "16433", 618L, 22));
		return myPassengers;

	}


	@GetMapping("/{passengerID}")
	public Passenger getPassenger(@PathVariable String passengerID){
		Passenger myPassenger = new Passenger("Mr", "Daniel", "123", 619L, 24);
		return myPassenger;

	}
}
