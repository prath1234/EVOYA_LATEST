package com.persistent.searchservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.persistent.searchservice.model.MasterVariant;

public interface MasterVariantRepository extends JpaRepository<MasterVariant, String>{ 

}
