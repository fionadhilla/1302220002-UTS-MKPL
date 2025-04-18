package lib;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;

public class Employee {

	private String employeeId;
	private PersonalInfo personalInfo;
	
	private LocalDate yearJoined;
	private LocalDate monthJoined;
	private LocalDate dayJoined;
	private int monthWorkingInYear;
	
	
	
	public Employee(String employeeId, PersonalInfo personalInfo, LocalDate yearJoined, LocalDate monthJoined, LocalDate dayJoined) {
		this.employeeId = employeeId;
		this.personalInfo = personalInfo;
		this.yearJoined = yearJoined;
		this.monthJoined = monthJoined;
		this.dayJoined = dayJoined;
	}
	
	
	public int getAnnualIncomeTax() {
		
		//Menghitung berapa lama pegawai bekerja dalam setahun ini, jika pegawai sudah bekerja dari tahun sebelumnya maka otomatis dianggap 12 bulan.
		LocalDate date = LocalDate.now();
		
		if (date.getYear() == yearJoined) {
			monthWorkingInYear = date.getMonthValue() - monthJoined;
		}else {
			monthWorkingInYear = 12;
		}
		
		return TaxFunction.calculateTax(monthlySalary, otherMonthlyIncome, monthWorkingInYear, annualDeductible, spouseIdNumber.equals(""), childIdNumbers.size());
	}
}
