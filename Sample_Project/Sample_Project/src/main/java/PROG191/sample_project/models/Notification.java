package PROG191.sample_project.models;

import java.io.Serializable;

public class Notification implements Serializable {
    private int _id;
    private String _title;
    private String _notification;

    public Notification() {
        setInfo(-1, "", "");
    }

    public Notification(int id, String code, int programId) {
        setInfo(id, "","");
    }

    public Notification(int id, String title, String notification) {
        setInfo(id, title, notification);
    }

    private void setInfo(int id, String title, String notification) {
        _id = id;
        _title = title;
        _notification = notification;
    }

    public void update(String title, String notification) {
        setInfo(_id, title, notification);
    }

    public void setId(int id) {
        _id = id;
    }

    public int getId() {
        return _id;
    }

    public void setCode(String title) {
        _title = title;
    }

    public String getCode() {
        return _title;
    }

    public void setName(String notification) {
        _notification = notification;
    }

    public String getName() {
        return _notification;
    }

}