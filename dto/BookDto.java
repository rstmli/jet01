package com.nacademy.demmmmmmmm.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class BookDto {
    private String bookName;
    private double bookPrice;
    private Long authId;
}
