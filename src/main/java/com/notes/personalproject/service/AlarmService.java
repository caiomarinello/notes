package com.notes.personalproject.service;

import java.util.List;

import com.notes.personalproject.model.Alarm;

public interface AlarmService {
    Alarm createAlarm(Alarm alarm);
    Alarm getAlarmById(Long id);
    List<Alarm> getAllAlarms();
    // Other methods for updating and deleting alarms
}
