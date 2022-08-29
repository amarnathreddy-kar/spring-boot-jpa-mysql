package com.amar.springbooth2dbeg.model;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name="tutorials")
public class Tutorial {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

    @Column(name="title")
    @NotBlank(message = "Title cannot be blank")
    @Size(min=4, message = "A minimun of four and maxmimum of 15 characters are allowed", max=15)
    private String title;

    @Column(name="description")
    @NotEmpty(message = "Description cannot be empty")
    @Size(max = 200, message = "A maximum of 200 characters is allowed for description")
    @Pattern(regexp = "^[a-zA-Z0-9.\\-\\/+=@_ ]*$", message = "Description Cannot contain special characters")
    private String description;

    @Column(name="published")
    private boolean published;

    public Tutorial(){

    }
    public Tutorial(String title, String description, boolean published) {
        this.title = title;
        this.description = description;
        this.published = published;
    }

    public long getId() {
        return Id;
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

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    @Override
    public String toString() {
        return "Tutorial {" +
                "Id=" + Id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", published=" + published +
                '}';
    }

}
