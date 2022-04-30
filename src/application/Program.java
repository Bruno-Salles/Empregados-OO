package application;

import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do departamento: ");
		String departmentName = sc.nextLine();
		System.out.print("Dia do pagamento: ");
		int payDay = sc.nextInt();	
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Telefone: ");
		String phone = sc.next();	
		Department department = new Department(departmentName, payDay, new Address(email, phone));
		
		System.out.print("Quantos funcionários tem o departamento? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.printf("Dados do funcionário %d:%n", i);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salário: ");
			double salary = sc.nextDouble();
			department.addEmployee(new Employee(name, salary));
		}
		
		showReport(department);

		sc.close();
	}

	private static void showReport(Department department) {
		System.out.println();
		System.out.println("FOLHA DE PAGAMENTO:");
		System.out.printf("Departamento %s = R$ %.2f%n", department.getName(), department.payRoll());
		System.out.printf("Pagamento realizado no dia %d%n", department.getPayDay());
		System.out.println("Funcionários:");
		for (Employee employee : department.getEmployeeList()) {
			System.out.println(employee.getName());
		}
		System.out.printf("Para dúvidas favor entrar em contato: %s%n", department.getAddress().getEmail());
	}
}
