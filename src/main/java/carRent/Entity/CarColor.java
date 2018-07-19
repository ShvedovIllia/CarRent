package carRent.Entity;

import javax.persistence.*;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "car_color")

public class CarColor extends BaseEntity {
	@Column(name = "color", length = 20, nullable = false)
	private String color;

}
