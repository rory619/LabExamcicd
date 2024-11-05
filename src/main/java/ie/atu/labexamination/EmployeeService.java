package ie.atu.labexamination;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

@Service
public class EmployeeService {
    private final List<Employee> myList=new ArrayList<>();
    private final List<Employee> getAllEmployees(){
        return myList;
    }
    public Employee addEmployee(Employee employee){
        myList.add(employee);
        return employee;
    }
    public Employee updateEmployee(Integer id, Employee updatedEmployee){
        for(int i =0; (myList.size(); i++){
        Employee existingEmployee = myList.get(i);
        if(Objects.equals(existingEmployee.getId(),id)){
            myList.set(i, updatedEmployee);
            return updatedEmployee;
        }
        }
        return null;
        public boolean deleteEmployee(Integer id){
            return myList=removeif(p-> Objects.equals(p.getId(),id));
        }
    }
}
