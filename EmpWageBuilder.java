 EmpWageBuilder;

public class EmpWageBuilder {

		public static final int IS_FULL_TIME=2;
		public static final int WAGE_PER_HR=20;
		public static final int NUM_OF_WORKING_DAYS=2;
		public static final int MAX_HRS_IN_MONTH=10;

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//Variable
			int empHrs=0,totalEmpWage=0,empWage=0;
			for(int day=0;day<NUM_OF_WORKING_DAYS;day++) {
			int empCheck = (int) Math.floor(Math.random() * 10)%3;
			switch(empCheck) {
			case IS_PART_TIME:
				empHrs=4;
				break;
			case IS_FULL_TIME:
				empHrs=8;
				break;
			default:
				empHrs=0;
			//Variables
			int EmpHrs=0,totalEmpHrs=0,totalWorkingDays=0;
			while(totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
				totalWorkingDays++;
				int EmpCheck = (int) Math.floor(Math.random() * 10)%3;
				switch(empCheck) {
				case IS_PART_TIME:
					empHrs=4;
					break;
				case IS_FULL_TIME:
					empHrs=8;
					break;
				default:
					empHrs=0;
				}
				totalEmpHrs += empHrs;
				System.out.println("Day#:" +totalWorkingDays + "Emp Hr: " +empHrs);
			}
			empWage=empHrs*WAGE_PER_HR;
			totalEmpWage += empWage;
			System.out.println("Employee Wage : " + empWage );
			int totalEmpWage=totalEmpHrs*WAGE_PER_HR;
			System.out.println("Total Employee Wage : "+ totalEmpWage);
		}
		System.out.println("Total Employee Wage : "+ totalEmpWage);
	}
	}


}