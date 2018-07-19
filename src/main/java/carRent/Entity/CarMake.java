package carRent.Entity;

import javax.persistence.*;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name="car_make")

public class CarMake extends BaseEntity{
	
	@Column(name="make_title", length=50, unique=true)
	private String makeTitle;
	@Column(name="manufacture_year", length=4)
	private int manufactureYear;
}
