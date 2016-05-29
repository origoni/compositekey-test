package com.millky.compositekey.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Data
@Entity
@IdClass(ChildId.class)
public class Child {
	@Id
	@ManyToOne
	@JoinColumn(name = "PARENT_ID")
    @JsonBackReference
	private Parent parent;

	@Id
	@Column(name = "CHILD_ID")
	private String childId;

	private String name;
	
	@OneToMany(mappedBy = "child", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<GrandChild> grandChilds;
}