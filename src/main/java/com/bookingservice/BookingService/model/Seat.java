package com.bookingservice.BookingService.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Seat {
    private Long seatId;
    private String seatName;
}
