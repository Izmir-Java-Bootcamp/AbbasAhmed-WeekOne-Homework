package com.company.WeeklyHomeWork.OOPHomeWork;

import java.time.LocalDate;

public class PersonelData {

    private LocalDate birthDate;
    private String address;
    private Long ssn;

    public PersonelData(LocalDate birthDate, Long ssn) {
        this.birthDate = birthDate;
        this.ssn = ssn;
    }

    public PersonelData(int year, int month , int day , long ssn) {
        this.birthDate = LocalDate.of(year,month,day);
        this.ssn = ssn;
    }

    public PersonelData(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Long getSsn() {
        return ssn;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
