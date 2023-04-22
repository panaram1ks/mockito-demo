package com.in28minutes.mackito.mockitodemo.business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomeBusinessImplStubTest {

    @Test
    void findTheGreatestFromAllData_basicScenario(){
        DataServiceStub1 stub = new DataServiceStub1();
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(stub);
        int theGreatestFromAllData = someBusiness.findTheGreatestFromAllData();
        assertEquals(25, theGreatestFromAllData);
    }

    @Test
    void findTheGreatestFromAllData_withOneValue(){
        DataServiceStub2 stub = new DataServiceStub2();
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(stub);
        int theGreatestFromAllData = someBusiness.findTheGreatestFromAllData();
        assertEquals(35, theGreatestFromAllData);
    }
}

class DataServiceStub1 implements DataService{
    @Override
    public int[] retrieveAllData() {
        return new int[]{25, 15, 5};
    }
}

class DataServiceStub2 implements DataService{
    @Override
    public int[] retrieveAllData() {
        return new int[]{35};
    }
}
