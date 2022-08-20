package com.clinic.doctormanagement.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicineService {

    @Autowired
    MedicineRepository medicineRepository;
    public List<MedicineModel> getMedicines() {
        return medicineRepository.findAll();
    }

    public void saveMedicine(MedicineModel medicineModel) {
        medicineRepository.save(medicineModel);
    }
}
