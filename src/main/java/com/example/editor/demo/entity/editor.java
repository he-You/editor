package com.example.editor.demo.entity;

/**
 * Created by heyou on 2019/3/15 0015
 */
public class editor {
    private Integer id;

    private String content;

    private String textContent="";

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTextContent() {
        return textContent;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    @Override
    public String toString() {
        return "editor{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", textContent='" + textContent + '\'' +
                '}';
    }
}
