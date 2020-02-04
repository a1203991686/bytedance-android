package com.bytedance.android.lesson.restapi.solution.bean;

import java.io.File;
import java.util.List;

/**
 * @author Xavier.S
 * @date 2019.01.20 14:17
 */
public class FeedResponse {

    // TODO-C2 (2) Implement your FeedResponse Bean here according to the response json



    private String student_id;
    private String user_name;
    private File cover_image;
    private File video;

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public File getCover_image() {
        return cover_image;
    }

    public void setCover_image(File cover_image) {
        this.cover_image = cover_image;
    }

    public File getVideo() {
        return video;
    }

    public void setVideo(File video) {
        this.video = video;
    }
}
