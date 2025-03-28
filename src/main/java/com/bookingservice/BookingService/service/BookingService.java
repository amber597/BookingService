package com.bookingservice.BookingService.service;

import java.util.List;

public interface BookingService {
    public void bookSeat(Long userId, List<Long> seatIds);
}
