package co.edu.cesde.ga.model;

public class GroupSubject {

    private String groupSubjectId;
    private String groupId;
    private String subjectId;
    private String teacherId;

    public GroupSubject() {
    }

    public GroupSubject(String groupSubjectId, String groupId, String subjectId, String teacherId) {
        this.groupSubjectId = groupSubjectId;
        this.groupId = groupId;
        this.subjectId = subjectId;
        this.teacherId = teacherId;
    }

    public String getGroupSubjectId() {
        return groupSubjectId;
    }

    public void setGroupSubjectId(String groupSubjectId) {
        this.groupSubjectId = groupSubjectId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "GroupSubject{" +
                "groupSubjectId='" + groupSubjectId + '\'' +
                ", groupId='" + groupId + '\'' +
                ", subjectId='" + subjectId + '\'' +
                ", teacherId='" + teacherId + '\'' +
                '}';
    }
}
