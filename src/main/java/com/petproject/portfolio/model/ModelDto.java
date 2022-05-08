package com.petproject.portfolio.model;

import com.petproject.portfolio.user.UserDto;
import lombok.Data;

import java.io.Serializable;
import java.time.Instant;

@Data
public class ModelDto implements Serializable {
    private final Long id;
    private final String name;
    private final UserDto author;
    private final String imageUrl;
    private final Instant createdAt;

    public ModelDto(Model model) {
        this.id = model.getId();
        this.name = model.getName();
        this.author = new UserDto(model.getAuthor());
        this.imageUrl = model.getImageUrl();
        this.createdAt = model.getCreatedAt();
    }
}