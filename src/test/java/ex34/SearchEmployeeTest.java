package ex34;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SearchEmployeeTest {

    @Test
    void findEmployeeNonExist() {
        SearchEmployee myApp = new SearchEmployee();
        ArrayList<String> employees = new ArrayList<>();
        AddEmployees(employees);
        String actual = myApp.findEmployee(employees, "Max Livingstone");
        assertEquals("There is no employee named Max Livingstone", actual);
    }

    @Test
    void findEmployeeExists() {
        SearchEmployee myApp = new SearchEmployee();
        ArrayList<String> employees = new ArrayList<>();
        AddEmployees(employees);
        String actual = myApp.findEmployee(employees, "Chris Jones");
        assertEquals("", actual);
    }

    void AddEmployees(ArrayList<String> employees){
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");
    }
}