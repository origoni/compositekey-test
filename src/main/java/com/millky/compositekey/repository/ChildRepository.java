package com.millky.compositekey.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.millky.compositekey.domain.Child;
import com.millky.compositekey.domain.ChildId;

public interface ChildRepository extends JpaRepository<Child, ChildId> {

}
