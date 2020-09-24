package urchynapi.demo.domain.dto;

public class TaskDto {
    Long id;
    String title;
    String description;
    String creationDate;
    String severity;

    public TaskDto(Long id, String title, String description, String creationDate, String severity) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.creationDate = creationDate;
        this.severity = severity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", creationDate='" + creationDate + '\'' +
                ", severity='" + severity + '\'' +
                '}';
    }
}
