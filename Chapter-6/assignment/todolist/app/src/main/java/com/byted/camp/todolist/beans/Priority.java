package com.byted.camp.todolist.beans;

import android.graphics.Color;

import com.byted.camp.todolist.R;

/**
 * @description
 * @author: Tian Weikang
 * @email: tianweikang.corgi@bytedance.com
 * @date: 2020-02-05 16-48
 */
public enum Priority {
    /**
     *
     */
    High(2, Color.argb(255, 208, 2, 27)),
    Low(2, Color.argb(255, 184, 233, 134)),
    Medium(1, Color.argb(255, 80, 227, 194));

    public final int color;

    public final int intValue;

    Priority(int paramInt1, int paramInt2) {
        this.intValue = paramInt1;
        this.color = paramInt2;
    }

    public static Priority from(int paramInt) {
        for (Priority priority : values()) {
            if (priority.intValue == paramInt) {
                return priority;
            }
        }
        return Low;
    }
}

