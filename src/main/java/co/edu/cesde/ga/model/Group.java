package co.edu.cesde.ga.model;

public class Group {

    private String groupId;
    private String code;
    private String programId;
    private String periodId;
    private String shift;

    public Group() {
    }

    public Group(String groupId, String code, String programId, String periodId, String shift) {
        this.groupId = groupId;
        this.code = code;
        this.programId = programId;
        this.periodId = periodId;
        this.shift = shift;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getProgramId() {
        return programId;
    }

    public void setProgramId(String programId) {
        this.programId = programId;
    }

    public String getPeriodId() {
        return periodId;
    }

    public void setPeriodId(String periodId) {
        this.periodId = periodId;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupId='" + groupId + '\'' +
                ", code='" + code + '\'' +
                ", programId='" + programId + '\'' +
                ", periodId='" + periodId + '\'' +
                ", shift='" + shift + '\'' +
                '}';
    }
}
