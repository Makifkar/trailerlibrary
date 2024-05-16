package com.mentor.trailerlibrary.dataAccess;

import com.mentor.trailerlibrary.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher,Integer> {
}
