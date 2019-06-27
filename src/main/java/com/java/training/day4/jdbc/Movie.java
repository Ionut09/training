package com.java.training.day4.jdbc;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
public class Movie {

    @NonNull //sau final
    private String id;
    private String name;
    private int year;
    private int rating;
}
