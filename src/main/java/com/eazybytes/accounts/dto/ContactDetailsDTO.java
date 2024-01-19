package com.eazybytes.accounts.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "accounts")
@Setter
@Getter
public class ContactDetailsDTO {

    private String name;

    private String email;
}
