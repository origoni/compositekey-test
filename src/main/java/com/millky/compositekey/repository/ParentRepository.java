package com.millky.compositekey.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.millky.compositekey.domain.Parent;

public interface ParentRepository extends JpaRepository<Parent, String> {

}
