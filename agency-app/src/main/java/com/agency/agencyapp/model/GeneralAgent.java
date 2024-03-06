package com.agency.agencyapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GeneralAgent {
    private long agentId;
    private String agentName;
    private String businessType;
    private  String status;
}
