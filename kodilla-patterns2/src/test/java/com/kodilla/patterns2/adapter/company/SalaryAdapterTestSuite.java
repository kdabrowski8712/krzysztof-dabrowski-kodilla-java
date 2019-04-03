package com.kodilla.patterns2.adapter.company;

import com.kodilla.patterns2.adapter.company.oldhrsystem.Workers;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.context.TestExecutionListeners;

public class SalaryAdapterTestSuite {

    @Test
    public void testTotalSalary() {
        //Given
        Workers workers = new Workers();
        SalaryAdapter salaryAdapter = new SalaryAdapter();
        //When
        double totalSalary = salaryAdapter.TotalSalary(workers.getWorkers(),workers.getSalaries());
        //Then
        Assert.assertEquals(24000.0,totalSalary,0.000);
    }
}
