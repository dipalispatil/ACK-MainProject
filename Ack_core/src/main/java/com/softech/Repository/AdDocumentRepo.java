package com.softech.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softech.Entity.AdDocuments;
@Repository
public interface AdDocumentRepo extends JpaRepository<AdDocuments, Long>{

	
	
}
