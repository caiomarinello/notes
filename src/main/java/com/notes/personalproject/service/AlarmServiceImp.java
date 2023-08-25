package com.notes.personalproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notes.personalproject.model.Alarm;
import com.notes.personalproject.repository.AlarmRepository;

@Service
public class AlarmServiceImp implements AlarmService {

    @Autowired
    AlarmRepository alarmRepository;

    @Override
    public Alarm createAlarm(Alarm alarm) {
        return alarmRepository.save(alarm);
    }

    @Override
    public Alarm getAlarmById(Long id) {
        
        throw new UnsupportedOperationException("Unimplemented method 'getAlarmById'");
    }

    @Override
    public List<Alarm> getAllAlarms() {
        return alarmRepository.findAll();
    }
    
}
