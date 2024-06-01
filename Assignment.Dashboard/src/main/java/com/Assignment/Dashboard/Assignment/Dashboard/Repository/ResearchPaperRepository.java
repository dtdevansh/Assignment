package com.Assignment.Dashboard.Assignment.Dashboard.Repository;

import com.Assignment.Dashboard.Assignment.Dashboard.Entity.ResearchPaper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResearchPaperRepository extends JpaRepository<ResearchPaper,Long> {



}
