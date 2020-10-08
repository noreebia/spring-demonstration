package com.practice.demo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
public class TestService {

    private final TestEntityRepo repo;

    @Transactional
    public void testTransaction() throws InterruptedException {
        TestEntity entity = repo.findById(1).get();
        log.info("Retrieved entity. Entity's value: {}", entity.getValue());
        log.info("Sleeping for 10 secs...");
        Thread.sleep(10000);
        log.info("Waking back up...");
        int newValue = Integer.MIN_VALUE;
        entity.setValue(newValue);
        log.info("Changed value of entity's value column to {}", newValue);
        log.info("Saving entity");
    }

}
