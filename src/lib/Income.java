package lib;

public class Income {
    private PersonalInfo personalInfo;  
    private int monthlySalary;
	private int otherMonthlyIncome;
	private int annualDeductible;

    public Income(int monthlySalary, int otherMonthlyIncome, int annualDeductible) {
        this.monthlySalary = monthlySalary;
        this.otherMonthlyIncome = otherMonthlyIncome;
        this.annualDeductible = annualDeductible;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(int grade) {
        if (grade == 1) {
			monthlySalary = 3000000;
			if (personalInfo.isForeigner()) {
				monthlySalary = (int) (3000000 * 1.5);
			}
		}else if (grade == 2) {
			monthlySalary = 5000000;
			if (personalInfo.isForeigner()) {
				monthlySalary = (int) (3000000 * 1.5);
			}
		}else if (grade == 3) {
			monthlySalary = 7000000;
			if (personalInfo.isForeigner()) {
				monthlySalary = (int) (3000000 * 1.5);
			}
		}
    }

    public int getOtherMonthlyIncome() {
        return otherMonthlyIncome;
    }

    public void setOtherMonthlyIncome(int otherMonthlyIncome) {
        this.otherMonthlyIncome = otherMonthlyIncome;
    }

    public int getAnnualDeductible() {
        return annualDeductible;
    }

    public void setAnnualDeductible(int annualDeductible) {
        this.annualDeductible = annualDeductible;
    }
}
