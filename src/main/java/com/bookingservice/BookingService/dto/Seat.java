package com.bookingservice.BookingService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Seat {
    private Long seatId;
    private String seatName;
}
