package org.ford.Assignment7;

public class ExamEligibility {

    protected static final double MIN_PERCENTAGE = 75.0;

    public void checkEligibility(String studName, double attendancePercentage) throws LowAttendanceException{

        if (attendancePercentage < MIN_PERCENTAGE){
            throw new LowAttendanceException("Attendance below 75%. Not Eligible");
        }

    }
}
