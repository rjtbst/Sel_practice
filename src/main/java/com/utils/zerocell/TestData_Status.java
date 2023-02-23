package com.utils.zerocell;

import com.creditdatamw.zerocell.annotation.Column;

public class TestData_Status {
    //pojo
@Column(name="status",index = 0)
    private String status;
@Column(name="expectedStatus", index = 1)
    private String expectedStatus;

    @Override
    public String toString() {
        return "TestData_Status{" +
                "status='" + status + '\'' +
                ", expectedStatus='" + expectedStatus + '\'' +
                '}';

    }

    public String getStatus() {
        return status;
    }

    public String getExpectedStatus() {
        return expectedStatus;
    }
}
