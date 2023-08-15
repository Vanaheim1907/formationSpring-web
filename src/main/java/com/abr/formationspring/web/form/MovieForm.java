package com.abr.formationspring.web.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.List;

public class MovieForm {

    @NotBlank(message = "Insert the title")
    @Size(max = 20)
    private String title;
    @NotBlank(message = "Insert a description")
    @Size(max = 255)
    private String description;
    @NotBlank(message = "Insert the Type")
    private String type;
    private String mainActor;
    private List<String> distribution;

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
