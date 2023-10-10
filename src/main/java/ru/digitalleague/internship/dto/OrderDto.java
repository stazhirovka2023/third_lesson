package ru.digitalleague.internship.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.experimental.Accessors;

@Schema(description = "Дто заказа")
@Data
@Accessors(chain = true)
public class OrderDto {

    @Schema(description = "Ид заказа")
    private Long Id;

    @Schema(description = "Сумма заказа")
    private Double summ;
}
