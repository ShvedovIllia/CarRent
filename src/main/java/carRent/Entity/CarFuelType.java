package carRent.Entity;

import javax.persistence.*;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name="car_fuel_type")

public class CarFuelType extends BaseEntity{
	private String fuelType;
	

}
