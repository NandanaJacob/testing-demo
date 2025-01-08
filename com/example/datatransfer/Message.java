// Data model that will be transferred
package com.example.datatransfer;

import java.io.Serializable;

public class Message implements Serializable {
    private static final long serialVersionUID = 1L;
    private String content;
    private long timestamp;
    private String sender;

    public Message(String content, String sender) {
        this.content = content;
        this.sender = sender;
        this.timestamp = System.currentTimeMillis();
    }

    // Getters and setters
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }
    public long getTimestamp() { return timestamp; }
    public String getSender() { return sender; }
    public void setSender(String sender) { this.sender = sender; }
}
