package _06_payroll;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PayrollTest {

    Payroll payroll = new Payroll();

    @Test
    void itShouldCalculatePaycheck() {
        //given
    	double hourlyWage = 16.0;
    	int numHours = 12;
    	double expected = 192.0;

        //when
    	double actual = payroll.calculatePaycheck(hourlyWage, numHours);

        //then
    	assertEquals(expected, actual);
    }

    @Test
    void itShouldCalculateMileageReimbursement() {
        //given
    	int milesTraveled = 1000;
    	double expected = 575.0;

        //when
    	double actual = payroll.calculateMileageReimbursement(milesTraveled);

        //then
    	assertEquals(expected, actual);
    }

    @Test
    void itShouldCreateOfferLetter() {
        //given
    	String employeeName = "John";
    	double hourlyWage = 16.0;
    	String expected = "Hello " + employeeName + ", We are pleased to offer you an hourly wage of " + hourlyWage;

        //when
    	String actual = payroll.createOfferLetter(employeeName, hourlyWage);

        //then
    	assertEquals(expected, actual);
    }

}