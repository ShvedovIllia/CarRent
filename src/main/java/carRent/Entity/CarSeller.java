package carRent.Entity;

import javax.persistence.*;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name="car_seller")

public class CarSeller extends BaseEntity{
	@Column(name="first_name", length=50, nullable=false)
	private String firstName;
	@Column(name="last_name", length=50, nullable=false)
	private String lastName;
	@Column(name="age", length=50, nullable=false)
	private int age;
	@Column(name="phone_number", length=15, nullable=false, unique=true)
	private int phoneNumber;
	
}
