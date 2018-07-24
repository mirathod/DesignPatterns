package behavioral.chainofresponsibility;

public class Manager extends Employee {
	
	private static final int MAX_DAYS_LEAVE_APPROVE=20;

	@Override
	public void applyLeave(String employeeName, int noOfdays) {
		if(noOfdays<MAX_DAYS_LEAVE_APPROVE){
			approved(employeeName, noOfdays);
		}
		else{
			supervisor.applyLeave(employeeName, noOfdays);
		}

	}
	private void approved(String employeeName, int noOfdays){
		System.out.println(noOfdays+" days leave approved for employee "+employeeName+" by manager");
	}

}
