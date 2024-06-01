package com.Assignment.Dashboard.Assignment.Dashboard.Service;

import com.Assignment.Dashboard.Assignment.Dashboard.Entity.ResearchPaper;
import com.Assignment.Dashboard.Assignment.Dashboard.Repository.ResearchPaperRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QueryFilterService {

    private final ResearchPaperRepository researchPaperRepository;


    public List<ResearchPaper> getSwotFilterSorted() {
        return  researchPaperRepository.findAll();
    }
}
