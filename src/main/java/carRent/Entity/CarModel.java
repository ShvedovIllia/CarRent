package carRent.Entity;

import javax.persistence.*;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name="car_model")

public class CarModel extends BaseEntity{
	@Column(name="model_title", length=50)
	private String modelTitle;
	
	@ManyToOne
	@JoinColumn(name="car_color_id")
	private CarColor carColor;
	
	@ManyToOne
	@JoinColumn(name="engine_capasity_id")
	private CarEngineCapacity carEngineCapacity;
	
	@ManyToOne
	@JoinColumn(name="car_fuel_type_id")
	private CarFuelType carFuelType;
	
	@ManyToOne
	@JoinColumn(name="car_make_id")
	private CarMake carMake;

}
