package com.library.entity;



import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity //database entity banayega ye annotation
@Table(name = "books") //mapping table name
@Data //getter setter banayega ye annotation 
@NoArgsConstructor //lombok ka annotation, no args constructor banayega
@AllArgsConstructor 
@Builder //builder pattern ka use karne ke liye ye annotation
public class Book {

    @Id // it marks the field as the primary key of the entity
    @GeneratedValue(strategy = GenerationType.IDENTITY) //it specifies that the primary key value will be generated automatically by the database
    private Long bookId;

    @NotBlank(message = "Book name is required") //it ensures that the book name must not be empty if it is then the msg will be displayed
    @Column(nullable = false) //it specifies that book name cannot be null in database
    private String bookName;

    @NotBlank(message = "Author name is required") //author name must not be empty
    @Column(nullable = false)
    private String author;

    @NotBlank(message = "Category is required")
    @Column(nullable = false)
    private String category;

    @Min(value = 1, message = "Price should be greater than 0") //the min value is 1 and value should be greater than 0 
    private Double price;

    @Min(value = 0, message = "Quantity cannot be negative")
    private Integer quantity;

    @Column(nullable = false)
    private String status;
}
