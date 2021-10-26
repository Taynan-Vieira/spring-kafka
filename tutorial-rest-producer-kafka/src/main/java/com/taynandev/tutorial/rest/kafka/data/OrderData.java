package com.taynandev.tutorial.rest.kafka.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderData implements Serializable {

	private static final long serialVersionUID = 6036838470602243201L;

	private String code;
	private String nameProduct;
	private BigDecimal value;

}
