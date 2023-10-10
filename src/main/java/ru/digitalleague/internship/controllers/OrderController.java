package ru.digitalleague.internship.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import ru.digitalleague.internship.dto.OrderDto;

@Tag(name = "Api для работы с заказами")
@RestController
@RequestMapping("/order")
public class OrderController {

    @Operation(summary = "Получить заказ по ID")
    @GetMapping("/{id}")
    public OrderDto getOrderById(@PathVariable("id") Long id) {
        return new OrderDto()
                .setId(id)
                .setSumm(333.3);
    }

    @Operation(summary = "Обновить все данные заказа по ID")
    @PutMapping("/update")
    public String update(@RequestBody OrderDto orderDto) {
        return "Заказ изменен";
    }

    //http://localhost:8080/restaurant/order/1/303
    @Operation(summary = "Изменить сумму заказа")
    @PatchMapping("/{id}/{summ}")
    public String updateOrderPartially(@PathVariable("id") Long id,
                                       @PathVariable("summ") Double summ,
                                       OrderDto orderDto) {
        return "Цена заказа изменена";
    }

    //http://localhost:8080/restaurant/1?summ=303
    @Operation(summary = "Изменить сумму заказа")
    @PatchMapping("/{id}")
    public String updateOrderPartially2(@PathVariable(value = "id", required = true) Long id,
                                        @RequestParam("summ") Double summ) {
        return "Цена заказа изменена";
    }

    @Operation(summary = "Создать новый заказ")
    @PostMapping("/create")
    public String create(@RequestBody OrderDto orderDto) {
        return "Новый заказ создан";
    }

    @Operation(summary = "Удалить заказ по ID")
    @DeleteMapping("/delete/{id}")
    public String deleteOrderById(@PathVariable(value = "id", required = true) Long id) {
        return "Заказ с ID=" + id + "удален";
    }
}