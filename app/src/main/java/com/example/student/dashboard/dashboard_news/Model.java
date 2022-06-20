package com.example.student.dashboard.dashboard_news;

public class Model {
    private final int viewType;
    private final Object object;

    public Model(int viewType, Object object) {
        this.viewType = viewType;
        this.object = object;
    }

    public int getViewType() {
        return viewType;
    }

    public Object getObject() {
        return object;
    }
}
