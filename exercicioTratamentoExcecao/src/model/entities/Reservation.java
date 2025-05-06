package model.entities;

import model.exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat simpleFormatter = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException{
        if (!checkOut.after(checkIn)) {
            throw new DomainException("Error in reservation: Check-out date must be after check-in date");
        }
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Reservation() {
    }

    public Long duration(){
        Long diff = checkOut.getTime() - checkIn.getTime();

        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void updateDate(Date dateCheckIn, Date dateCheckOut) throws DomainException{
        Date now = new Date();
        if (dateCheckIn.before(now) || dateCheckOut.before(now)){
            throw new DomainException("Error in reservation: Reservation dates for update must be future dates") ;
        }
        if (!dateCheckOut.after(dateCheckIn)) {
            throw new DomainException("Error in reservation: Check-out date must be after check-in date");
        }
        this.checkOut = dateCheckOut;
        this.checkIn = dateCheckIn;
    }

    @Override
    public String toString() {
        return "Romm "
                + roomNumber
                + ", check-in: "
                + simpleFormatter.format(checkIn)
                + ", check-out: "
                + simpleFormatter.format(checkOut)
                + ", "
                + duration()
                +" nights";
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

}
