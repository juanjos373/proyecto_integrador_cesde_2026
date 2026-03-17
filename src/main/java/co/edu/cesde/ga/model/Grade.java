package co.edu.cesde.ga.model;

public class Grade {

    private String gradeId;
    private String groupSubjectId;
    private String studentId;
    private Double finalScore;
    private String observation;

    public Grade() {
    }

    public Grade(String gradeId, String groupSubjectId, String studentId, Double finalScore, String observation) {
        this.gradeId = gradeId;
        this.groupSubjectId = groupSubjectId;
        this.studentId = studentId;
        this.finalScore = finalScore;
        this.observation = observation;
    }

    public String getGradeId() {
        return gradeId;
    }

    public void setGradeId(String gradeId) {
        this.gradeId = gradeId;
    }

    public String getGroupSubjectId() {
        return groupSubjectId;
    }

    public void setGroupSubjectId(String groupSubjectId) {
        this.groupSubjectId = groupSubjectId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Double getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(Double finalScore) {
        this.finalScore = finalScore;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "gradeId='" + gradeId + '\'' +
                ", groupSubjectId='" + groupSubjectId + '\'' +
                ", studentId='" + studentId + '\'' +
                ", finalScore=" + finalScore +
                ", observation='" + observation + '\'' +
                '}';
    }
}
