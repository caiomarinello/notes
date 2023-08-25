package com.notes.personalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.notes.personalproject.model.Alarm;
import com.notes.personalproject.service.AlarmServiceImp;

@RestController
@RequestMapping("/alarms")
public class AlarmController {
    @Autowired
    private AlarmServiceImp alarmServiceImp;

    @PostMapping
    public Alarm createAlarm(@RequestBody Alarm alarm) {
        return alarmServiceImp.createAlarm(alarm);
    }

    @GetMapping("/{id}")
    public Alarm getAlarmById(@PathVariable Long id) {
        return alarmServiceImp.getAlarmById(id);
    }

    @GetMapping
    public List<Alarm> getAllAlarms() {
        return alarmServiceImp.getAllAlarms();
    }
}
