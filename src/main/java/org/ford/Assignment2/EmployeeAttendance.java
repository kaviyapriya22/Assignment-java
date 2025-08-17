package org.ford.Assignment2;

public class EmployeeAttendance {
    public static void main(String[] args) {

                char[][] attendance = {
                        {'P', 'P', 'A', 'P', 'L', 'P', 'P'},
                        {'P', 'A', 'A', 'P', 'P', 'P', 'L'},
                        {'P', 'P', 'P', 'P', 'P', 'P', 'P'}
                };


                for (int i = 0; i < attendance.length; i++) {


                    int presentCount = 0;
                    int absentCount = 0;
                    int leaveCount = 0;

                    for (int j = 0; j < attendance[i].length; j++) {
                        if (attendance[i][j] == 'A') {
                            absentCount++;
                        } else if (attendance[i][j] == 'P') {
                            presentCount++;
                        } else if (attendance[i][j] == 'L') {
                            leaveCount++;
                        }
                    }

                    System.out.println("Employee" + " " + (i + 1) + " " + "Present days: " + presentCount + " absent days : " + absentCount + " leave days : " + leaveCount);


                }
            }
        }
