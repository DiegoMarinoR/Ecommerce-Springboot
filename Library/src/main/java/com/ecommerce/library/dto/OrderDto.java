package com.ecommerce.library.dto;

import java.util.Date;
import java.util.List;

import com.ecommerce.library.model.Customer;
import com.ecommerce.library.model.OrderDetail;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {
	private Long id;
	private Date orderDate;
	private Date deliveryDate;
	private double totalPrice;
	private double shippingFee;
	private String orderStatus;
	private String notes;
	private Customer customer;
	private List<OrderDetail> orderDetailList;

}
