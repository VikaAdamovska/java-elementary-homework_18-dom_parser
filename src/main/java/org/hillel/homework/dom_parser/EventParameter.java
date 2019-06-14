package org.hillel.homework.dom_parser;

public class EventParameter {

    private int priority;

    private String logLevel;

    private String source;

    public EventParameter() {
    }

    public EventParameter(int priority, String logLevel, String source) {
        this.priority = priority;
        this.logLevel = logLevel;
        this.source = source;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "EventParameter{" +
                "priority=" + priority +
                ", logLevel='" + logLevel + '\'' +
                ", source='" + source + '\'' +
                '}';
    }
}
