package com.sboot.technical.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sboot.technical.model.Technical;

@RepositoryRestResource
public interface TechnicalRepository extends JpaRepository<Technical, Long> {
	
	@Query("from Technical where tName  = :name")
	List<Technical> findByName(@Param(value = "name") String tName);

}
