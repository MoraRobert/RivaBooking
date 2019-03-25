package com.robertmora.bookingriva;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<ApartmentBooking, Long> {
    List<ApartmentBooking> findByPriceLessThan(double price);
}
