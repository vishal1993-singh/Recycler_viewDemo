package com.example.recycler_viewdemo.Model;

public class MyModel {

    public MyModel(String mainTitle)
    {
        //this.mainTitle=mainTitle;
            setMainTitle(mainTitle);
    }

    public String getMainTitle() {
        return mainTitle;
    }

    public void setMainTitle(String mainTitle) {
        this.mainTitle = mainTitle;
    }

    private String mainTitle;

}
