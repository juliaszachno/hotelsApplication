package pl.julia.hotelsapplication.remote.rest.dto.request;

public class PersonReservationDto {
    private String name;
    private String address;
    private String phone;
    private String floor;

    public PersonReservationDto() {
    }

    public PersonReservationDto(String name, String address, String phone, String floor) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.floor = floor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }
}