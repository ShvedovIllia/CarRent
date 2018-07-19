package carRent.Entity;

import java.math.BigDecimal;

import javax.persistence.*;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name="car")

public class Car extends BaseEntity{
	@Column(name="sell_price", columnDefinition="decimal(8,2)")
	private BigDecimal sellPrice;
	
	@ManyToOne
	@JoinColumn(name="car_model_id")
	private CarModel carModel;
	
	@ManyToOne
	@JoinColumn(name="seller_id")
	private CarSeller carSeller;
}
