package com.bookingservice.BookingService.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl  implements BookingService {

    private final ShowClient showClient;

    public BookingServiceImpl(ShowClient showClient) {
        this.showClient = showClient;
    }

    @Override
    public void bookSeat(Long userId, List<Long> seatIds) {
        ResponseEntity<String> confirmSeats = showClient.confirmSeats(userId, seatIds);

        if( confirmSeats.getStatusCode() != HttpStatus.OK ) {
            throw new RuntimeException(confirmSeats.toString());
        }

        ResponseEntity<String> bookSeats = showClient.bookSeats(userId, seatIds);

        if (bookSeats.getStatusCode() != HttpStatus.OK) {
            throw new RuntimeException(bookSeats.toString());
        }

    }
}
