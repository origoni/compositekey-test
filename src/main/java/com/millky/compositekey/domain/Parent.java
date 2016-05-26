package com.millky.compositekey.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Parent {
	@Id
	@Column(name = "PARENT_ID")
	private String id;

	private String name;
}