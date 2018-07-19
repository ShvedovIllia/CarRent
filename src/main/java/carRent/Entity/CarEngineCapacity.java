package carRent.Entity;

import java.math.BigDecimal;

import javax.persistence.*;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name="car_engine_capacity")

public class CarEngineCapacity extends BaseEntity{
	private BigDecimal engineCapacity;
}
