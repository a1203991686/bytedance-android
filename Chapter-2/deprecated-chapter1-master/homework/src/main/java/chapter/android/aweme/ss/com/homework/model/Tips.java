package chapter.android.aweme.ss.com.homework.model;

/**
 * @description
 * @author: Tian Weikang
 * @email: tianweikang.corgi@bytedance.com
 * @date: 2020-02-03 17-57
 */
public class Tips {

    private String title;
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Tips(String title, String description) {
        this.title = title;
        this.description = description;
    }
}
