package com.millky.compositekey.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.millky.compositekey.domain.GrandChild;
import com.millky.compositekey.domain.GrandChildId;

public interface GrandChildRepository extends JpaRepository<GrandChild, GrandChildId> {

}
