package com.spring.boot.learning.lombok.dto;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
//@Getter
//@Setter
public class MyIntroductionDTO {

	String name;
	String experiance;
	String skills;

}
