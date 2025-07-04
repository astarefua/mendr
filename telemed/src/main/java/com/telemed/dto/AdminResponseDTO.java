package com.telemed.dto;

public class AdminResponseDTO {
    private Long id;
    private String name;
    private String email;

    public AdminResponseDTO(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
}
