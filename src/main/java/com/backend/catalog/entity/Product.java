package com.backend.catalog.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name cannot be blank")
    private String name;

    @NotBlank(message = "Brand cannot be blank")
    private String brand;

    private String description;

    @NotNull(message = "Price cannot be null")
    private Integer price;

    @NotNull(message = "Quantity cannot be null")
    private Integer quantity;

    @NotBlank(message = "Category cannot be blank")
    private String category;

    @NotNull(message = "Date cannot be null")
    private LocalDate dateAdded;
}
