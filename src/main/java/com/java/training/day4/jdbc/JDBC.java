package com.java.training.day4.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JDBC {
    private static final String mysqlJDBCUrl = "jdbc:mysql://localhost:3306/movie?serverTimezone=EST";

    public static void main(String[] args) {
        JDBC jdbc = new JDBC();
        List<Movie> moviesByYear = jdbc.getMoviesByYear(2000);
        moviesByYear.forEach(movie -> System.out.println(movie));

        jdbc.insertMovie();
    }

    private Connection getConnection() {
        try {
            Connection connection = DriverManager.getConnection(mysqlJDBCUrl, "root", "password");
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new IllegalStateException("Could not get database connection!!!");
        }
    }

    private List<Movie> getMoviesByYear(int year) {
        String query = "select * from movie_info where year > ?";
        List<Movie> movies = new ArrayList<>();

        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {

            ps.setInt(1, year);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                Movie movie = new Movie();
                //movie.setId(resultSet.getString("movie_id"));
                movie.setId(resultSet.getString(1));
                movie.setName(resultSet.getString(2));
                movie.setYear(resultSet.getInt(3));
                movie.setRating(resultSet.getInt(4));
                movies.add(movie);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return movies;
    }
    
    private void insertMovie(){
        String statement = "insert into movie_info values ('0007', 'gameloft', 2019, 10)";
        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement(statement)) {
            int updatedRows = ps.executeUpdate();
            if(updatedRows == 0){
                throw new IllegalStateException("Unable to insert row");
            }
            System.out.println("Row inserted successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
