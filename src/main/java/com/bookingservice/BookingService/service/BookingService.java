package com.bookingservice.BookingService.service;

import java.util.List;

public interface BookingService {
    public void bookSeat(Long userId, Long showId, List<Long> seatIds);
}
