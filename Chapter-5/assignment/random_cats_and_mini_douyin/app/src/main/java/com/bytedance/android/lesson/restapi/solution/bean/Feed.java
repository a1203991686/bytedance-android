package com.bytedance.android.lesson.restapi.solution.bean;

import java.io.File;
import java.util.List;

/**
 * @author Xavier.S
 * @date 2019.01.20 14:18
 */
public class Feed {

    // TODO-C2 (1) Implement your Feed Bean here according to the response json
    /**
     * feeds : [{"student_id":"2220186666","user_name":"doudou","image_url":"https://sf6-hscdn-tos.pstatp.com/obj/developer-baas/baas/tt7217xbo2wz3cem41/9c6bbc2aa5355504_1560563154279.jpg","_id":"5d044dd222e26f0024157401","video_url":"https://lf1-hscdn-tos.pstatp.com/obj/developer-baas/baas/tt7217xbo2wz3cem41/a8efa55c5c22de69_1560563154288.mp4","createdAt":"2019-06-15T01:45:54.368Z","updatedAt":"2019-06-15T01:45:54.368Z"}]
     * success : true
     */

    private boolean success;
    private List<FeedsBean> feeds;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<FeedsBean> getFeeds() {
        return feeds;
    }

    public void setFeeds(List<FeedsBean> feeds) {
        this.feeds = feeds;
    }

    public static class FeedsBean {
        /**
         * student_id : 2220186666
         * user_name : doudou
         * image_url : https://sf6-hscdn-tos.pstatp.com/obj/developer-baas/baas/tt7217xbo2wz3cem41/9c6bbc2aa5355504_1560563154279.jpg
         * _id : 5d044dd222e26f0024157401
         * video_url : https://lf1-hscdn-tos.pstatp.com/obj/developer-baas/baas/tt7217xbo2wz3cem41/a8efa55c5c22de69_1560563154288.mp4
         * createdAt : 2019-06-15T01:45:54.368Z
         * updatedAt : 2019-06-15T01:45:54.368Z
         */

        private String student_id;
        private String user_name;
        private String image_url;
        private String _id;
        private String video_url;
        private String createdAt;
        private String updatedAt;

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

        public String getImage_url() {
            return image_url;
        }

        public void setImage_url(String image_url) {
            this.image_url = image_url;
        }

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getVideo_url() {
            return video_url;
        }

        public void setVideo_url(String video_url) {
            this.video_url = video_url;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }
    }
}
