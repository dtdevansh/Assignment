package com.Assignment.Dashboard.Assignment.Dashboard.Service;

import com.Assignment.Dashboard.Assignment.Dashboard.Entity.ResearchPaper;
import com.Assignment.Dashboard.Assignment.Dashboard.Repository.ResearchPaperRepository;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;


import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Slf4j
@Service
@RequiredArgsConstructor
public class LoadDataService {

    private final ResearchPaperRepository researchPaperRepository;
    private final JdbcTemplate jdbcTemplate;


    private final String filename="Data.csv";

    @PostConstruct
    public void saveCSV() throws IOException, CsvException {
        jdbcTemplate.execute("ALTER TABLE research_paper MODIFY insight LONGTEXT;");
        jdbcTemplate.execute("ALTER TABLE research_paper MODIFY title LONGTEXT;");
        try (CSVReader reader = new CSVReaderBuilder( new FileReader(new ClassPathResource(filename).getFile())) .withSkipLines(1).build()) {
            String[] line;
            while ((line = reader.readNext()) != null) {
                ResearchPaper entity = new ResearchPaper();
                entity.setEnd_year(Long.parseLong(line[0]));
                if(!Objects.equals(line[1], ""))entity.setCitylng(Double.valueOf(line[1]));
                if(!Objects.equals(line[2], ""))entity.setCitylat(Double.valueOf(line[2]));
                if(!Objects.equals(line[3], ""))entity.setIntensity(Long.valueOf(line[3]));
                entity.setSector(line[4]);
                entity.setTopic(line[5]);
                entity.setInsight(line[6]);
                entity.setSwot(line[7]);
                entity.setUrl(line[8]);
                entity.setRegion(line[9]);
                if(!Objects.equals(line[10], ""))entity.setStart_year(Long.valueOf(line[10]));
                if(!Objects.equals(line[11], ""))entity.setImpact(Long.valueOf(line[11]));
                entity.setAdded(new Date(line[12]));
                entity.setPublished(new Date(line[13]));
                entity.setCity(line[14]);
                entity.setCountry(line[15]);
                if(!Objects.equals(line[16], ""))entity.setRelevance(Long.valueOf(line[16]));
                entity.setPestle(line[17]);
                entity.setSource(line[18]);
                entity.setTitle(line[19]);
                if(!Objects.equals(line[20], ""))entity.setLikelihood(Long.valueOf(line[20]));
                researchPaperRepository.save(entity);
            }
        }

   }
}
