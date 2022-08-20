package com.clinic.doctormanagement.patient;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "medicine")
public class MedicineModel {
    @Id @GeneratedValue
    int id;
    String name;
    int quantity;
}
