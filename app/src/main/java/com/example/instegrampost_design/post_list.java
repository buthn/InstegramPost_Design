package com.example.instegrampost_design;

public class post_list {

    int profile_img;
    String name;
    int post_img;
    String post_desc;

    public post_list(int profile_img, String name, int post_img, String post_desc) {
        this.profile_img = profile_img;
        this.name = name;
        this.post_img = post_img;
        this.post_desc = post_desc;
    }

    public int getProfile_img() {
        return profile_img;
    }

    public void setProfile_img(int profile_img) {
        this.profile_img = profile_img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPost_img() {
        return post_img;
    }

    public void setPost_img(int post_img) {
        this.post_img = post_img;
    }

    public String getPost_desc() {
        return post_desc;
    }

    public void setPost_desc(String post_desc) {
        this.post_desc = post_desc;
    }
}
