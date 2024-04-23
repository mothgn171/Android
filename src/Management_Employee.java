import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Management_Employee {
    public static void main(String[] args) {
        // Tạo danh sách nhân viên
      
        List<Employee> employees = new ArrayList<>();

        // Thêm nhân viên vào danh sách
        employees.add(new Employee(1, "John", 30, "IT", "E001", 2500));
        employees.add(new Employee(2, "Sarah", 35, "HR", "E002", 3000));
        employees.add(new Employee(3, "Michael", 28, "Finance", "E003", 2000));

        // In thông tin của tất cả nhân viên
        System.out.println("Danh sách nhân viên:");
        for (Employee employee : employees) {
            System.out.println("ID: " + employee.getId());
            System.out.println("Tên: " + employee.getName());
            System.out.println("Tuổi: " + employee.getAge());
            System.out.println("Phòng ban: " + employee.getDepartment());
            System.out.println("Mã nhân viên: " + employee.getCode());
            System.out.println("Mức lương: " + employee.getSalaryRate());
            System.out.println("-------------------------");
        }

        // Cập nhật thông tin của một nhân viên
        Employee employeeToUpdate = employees.get(0);
        employeeToUpdate.setSalaryRate(2800);

        // In thông tin của nhân viên đã cập nhật
        System.out.println("Thông tin nhân viên sau cập nhật:");
        System.out.println("ID: " + employeeToUpdate.getId());
        System.out.println("Tên: " + employeeToUpdate.getName());
        System.out.println("Tuổi: " + employeeToUpdate.getAge());
        System.out.println("Phòng ban: " + employeeToUpdate.getDepartment());
        System.out.println("Mã nhân viên: " + employeeToUpdate.getCode());
        System.out.println("Mức lương: " + employeeToUpdate.getSalaryRate());
    }
}