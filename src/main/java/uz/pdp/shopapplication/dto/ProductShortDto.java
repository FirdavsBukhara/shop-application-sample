package uz.pdp.shopapplication.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductShortDto {
    private Long id;
    private String name;
}
