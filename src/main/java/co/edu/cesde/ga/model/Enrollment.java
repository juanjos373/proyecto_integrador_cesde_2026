package co.edu.cesde.ga.model;

public class Enrollment {

    private String enrollmentId;
    private String studentId;
    private String groupId;
    private String periodId;
    private String status;
    private String enrolledAt;

    public Enrollment() {
    }

    public Enrollment(String enrollmentId, String studentId, String groupId, String periodId, String status, String enrolledAt) {
        this.enrollmentId = enrollmentId;
        this.studentId = studentId;
        this.groupId = groupId;
        this.periodId = periodId;
        this.status = status;
        this.enrolledAt = enrolledAt;
    }

    public String getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(String enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getPeriodId() {
        return periodId;
    }

    public void setPeriodId(String periodId) {
        this.periodId = periodId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEnrolledAt() {
        return enrolledAt;
    }

    public void setEnrolledAt(String enrolledAt) {
        this.enrolledAt = enrolledAt;
    }

    @Override
    public String toString() {
        return "Enrollment{" +
                "enrollmentId='" + enrollmentId + '\'' +
                ", studentId='" + studentId + '\'' +
                ", groupId='" + groupId + '\'' +
                ", periodId='" + periodId + '\'' +
                ", status='" + status + '\'' +
                ", enrolledAt='" + enrolledAt + '\'' +
                '}';
    }
}
