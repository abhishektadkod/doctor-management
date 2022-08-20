package com.clinic.doctormanagement.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MedicineController {
    @Autowired
    MedicineService medicineService;
    @RequestMapping(value = "/medicines", method = RequestMethod.GET)
    public List<MedicineModel> getMedicines(){
        return medicineService.getMedicines();
    }

    @RequestMapping(value = "/medicine", method = RequestMethod.POST)
    public void savePatient(@RequestBody MedicineModel medicineModel){
        medicineService.saveMedicine(medicineModel);
    }
}
