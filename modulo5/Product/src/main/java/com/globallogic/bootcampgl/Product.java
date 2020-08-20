package com.globallogic.bootcampgl;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Component
public class Product {

	private String id;
	private String name;
}
