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

    public void setValueToZero(){
        repo.save(new TestEntity(1,0));
    }

    @Transactional
    public void modifyValue() throws InterruptedException {
        // SELECT
        TestEntity entity = repo.findById(1).get();

        // 10초 동안 대기. 이 때 외부에서 값 변경
        Thread.sleep(10000);

        // 업데이트
        entity.setValue(20);
    }

}
