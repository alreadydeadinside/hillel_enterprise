package com.example.demo.model;

import java.util.Objects;

public class Ticket {

    private String name;
    private String description;
    private String assignee;
    private String reporter;
    private String status;
    private String priority;
    private long timeSpent;
    private long timeEstim;
    private String dateCreated;
    private String type;

    public Ticket() {
    }

    public Ticket(String name, String description, String assignee, String reporter, String status, String priority,
                  long timeSpent, long timeEstim, String dateCreated, String type) {
        this.name = name;
        this.description = description;
        this.assignee = assignee;
        this.reporter = reporter;
        this.status = status;
        this.priority = priority;
        this.timeSpent = timeSpent;
        this.timeEstim = timeEstim;
        this.dateCreated = dateCreated;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public long getTimeSpent() {
        return timeSpent;
    }

    public void setTimeSpent(long timeSpent) {
        this.timeSpent = timeSpent;
    }

    public long getTimeEstim() {
        return timeEstim;
    }

    public void setTimeEstim(long timeEstim) {
        this.timeEstim = timeEstim;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return timeSpent == ticket.timeSpent && timeEstim == ticket.timeEstim && Objects.equals(name, ticket.name) && Objects.equals(description, ticket.description) && Objects.equals(assignee, ticket.assignee) && Objects.equals(reporter, ticket.reporter) && Objects.equals(status, ticket.status) && Objects.equals(priority, ticket.priority) && Objects.equals(dateCreated, ticket.dateCreated) && Objects.equals(type, ticket.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, assignee, reporter, status, priority, timeSpent, timeEstim, dateCreated, type);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", assignee='" + assignee + '\'' +
                ", reporter='" + reporter + '\'' +
                ", status='" + status + '\'' +
                ", priority='" + priority + '\'' +
                ", timeSpent=" + timeSpent +
                ", timeEstim=" + timeEstim +
                ", dateCreated='" + dateCreated + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}