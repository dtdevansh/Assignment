package com.Assignment.Dashboard.Assignment.Dashboard.Controller;

import com.Assignment.Dashboard.Assignment.Dashboard.Entity.ResearchPaper;
import com.Assignment.Dashboard.Assignment.Dashboard.Service.QueryFilterService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/filterjava")
public class FilterQueryController {

    private final QueryFilterService queryFilterService;

    @GetMapping("/swotfilter")
    public ResponseEntity<?> getSwotFilter(){
        return new ResponseEntity<List<ResearchPaper>>(queryFilterService.getSwotFilterSorted(), HttpStatus.OK);
    }

}
