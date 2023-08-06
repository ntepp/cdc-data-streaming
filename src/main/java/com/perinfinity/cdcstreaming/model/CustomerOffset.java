package com.perinfinity.cdcstreaming.model;

import java.time.LocalDateTime;

public class CustomerOffset {
    private LocalDateTime lastCreationDate;
    private LocalDateTime lastUpdateDate;

    public CustomerOffset(LocalDateTime lastCreationDate, LocalDateTime lastUpdateDate) {
        this.lastCreationDate = lastCreationDate;
        this.lastUpdateDate = lastUpdateDate;
    }

    public LocalDateTime getLastCreationDate() {
        return lastCreationDate;
    }

    public void setLastCreationDate(LocalDateTime lastCreationDate) {
        this.lastCreationDate = lastCreationDate;
    }

    public LocalDateTime getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(LocalDateTime lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    @Override
    public String toString() {
        return "CustomerOffset{" +
                "lastCreationDate=" + lastCreationDate +
                ", lastUpdateDate=" + lastUpdateDate +
                '}';
    }
}
