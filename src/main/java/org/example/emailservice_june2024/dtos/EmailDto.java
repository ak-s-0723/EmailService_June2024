package org.example.emailservice_june2024.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmailDto {
    private String to;

    private String from;

    private String subject;

    private String body;
}
