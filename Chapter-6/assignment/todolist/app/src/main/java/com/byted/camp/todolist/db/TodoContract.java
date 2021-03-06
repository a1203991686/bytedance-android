package com.byted.camp.todolist.db;

import android.provider.BaseColumns;

/**
 * Created on 2019/1/22.
 *
 * @author xuyingyi@bytedance.com (Yingyi Xu)
 */
public final class TodoContract {

    public static final String SQL_ADD_PRIORITY_COLUMN = "ALTER TABLE note ADD priority INTEGER";

    public static final String SQL_CREATE_NOTES = "CREATE TABLE note(_id INTEGER PRIMARY KEY AUTOINCREMENT, date INTEGER, state INTEGER, content TEXT, priority INTEGER)";

    public static class TodoNote implements BaseColumns {
        public static final String COLUMN_CONTENT = "content";

        public static final String COLUMN_DATE = "date";

        public static final String COLUMN_PRIORITY = "priority";

        public static final String COLUMN_STATE = "state";

        public static final String TABLE_NAME = "note";
    }

}
