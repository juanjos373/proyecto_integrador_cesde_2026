package co.edu.cesde.ga.model;

public class Subject {

    private String subjectId;
    private String code;
    private String name;
    private Integer credits;
    private String programId;

    public Subject() {
    }

    public Subject(String subjectId, String code, String name, Integer credits, String programId) {
        this.subjectId = subjectId;
        this.code = code;
        this.name = name;
        this.credits = credits;
        this.programId = programId;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public String getProgramId() {
        return programId;
    }

    public void setProgramId(String programId) {
        this.programId = programId;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectId='" + subjectId + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", credits=" + credits +
                ", programId='" + programId + '\'' +
                '}';
    }
}
