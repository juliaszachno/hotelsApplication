package pl.julia.hotelsapplication.remote.rest.dto.response;

import pl.julia.hotelsapplication.domain.model.ReservationStatusType;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class ReservationStatusDto {

    private ReservationStatusType status;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createdAt;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date expectedAt;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date updatedAt;

    public ReservationStatusDto() {
    }

    public ReservationStatusDto(ReservationStatusType status, Date createdAt, Date expectedAt, Date updatedAt) {
        this.status = status;
        this.createdAt = createdAt;
        this.expectedAt = expectedAt;
        this.updatedAt = updatedAt;
    }

    public ReservationStatusType getStatus() {
        return status;
    }

    public void setStatus(ReservationStatusType status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getExpectedAt() {
        return expectedAt;
    }

    public void setExpectedAt(Date expectedAt) {
        this.expectedAt = expectedAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}