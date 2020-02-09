package com.littlecorgi.minidouyin.bean;

/**
 * @author Tian Weikang tianweikang.corgi@bytedance.com
 * @date 2020-02-09 22:40
 */
public class PostVideoResponse {
    /**
     * status : 0
     * data : {"uri":"708c3f48-cb6c-448d-8909-253665ab17b0.png","url":"ftp://www.zhangshuo.fun/708c3f48-cb6c-448d-8909-253665ab17b0.png"}
     */

    private int status;
    private DataBean data;
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * uri : 708c3f48-cb6c-448d-8909-253665ab17b0.png
         * url : ftp://www.zhangshuo.fun/708c3f48-cb6c-448d-8909-253665ab17b0.png
         */

        private String uri;
        private String url;

        public String getUri() {
            return uri;
        }

        public void setUri(String uri) {
            this.uri = uri;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
