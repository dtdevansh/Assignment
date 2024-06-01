package com.Assignment.Dashboard.Assignment.Dashboard.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResearchPaper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long end_year;
    private Double citylng;
    private Double citylat;
    private Long intensity;
    private String sector;
    private String topic;
    private String insight;
    private String swot;
    private String url;
    private String region;
    private Long start_year;
    private Long impact;
    private Date added;
    private Date published;
    private String city;
    private String country;
    private Long relevance;
    private String pestle;
    private String source;
    private String title;
    private Long likelihood;
}
