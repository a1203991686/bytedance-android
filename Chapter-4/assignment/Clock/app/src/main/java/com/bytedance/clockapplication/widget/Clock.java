package com.bytedance.clockapplication.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.RelativeSizeSpan;
import android.util.AttributeSet;
import android.view.View;

import java.util.Calendar;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

public class Clock extends View {

    private final static String TAG = Clock.class.getSimpleName();

    private static final int FULL_ANGLE = 360;

    private static final int CUSTOM_ALPHA = 140;
    private static final int FULL_ALPHA = 255;

    private static final int DEFAULT_PRIMARY_COLOR = Color.WHITE;
    private static final int DEFAULT_SECONDARY_COLOR = Color.LTGRAY;

    private static final float DEFAULT_DEGREE_STROKE_WIDTH = 0.010f;

    public final static int AM = 0;

    private static final int RIGHT_ANGLE = 90;

    private int mWidth, mCenterX, mCenterY, mRadius;

    /**
     * properties
     */
    private int centerInnerColor;
    private int centerOuterColor;

    private int secondsNeedleColor;
    private int hoursNeedleColor;
    private int minutesNeedleColor;

    private int degreesColor;

    private int hoursValuesColor;

    private int numbersColor;

    private boolean mShowAnalog = true;

    public Clock(Context context) {
        super(context);
        init(context, null);
    }

    public Clock(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public Clock(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);


    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        int size;
        int width = getMeasuredWidth();
        int height = getMeasuredHeight();
        int widthWithoutPadding = width - getPaddingLeft() - getPaddingRight();
        int heightWithoutPadding = height - getPaddingTop() - getPaddingBottom();

        if (widthWithoutPadding > heightWithoutPadding) {
            size = heightWithoutPadding;
        } else {
            size = widthWithoutPadding;
        }

        setMeasuredDimension(size + getPaddingLeft() + getPaddingRight(), size + getPaddingTop() + getPaddingBottom());
    }

    private void init(Context context, AttributeSet attrs) {

        this.centerInnerColor = Color.LTGRAY;
        this.centerOuterColor = DEFAULT_PRIMARY_COLOR;

        this.secondsNeedleColor = DEFAULT_SECONDARY_COLOR;
        this.hoursNeedleColor = DEFAULT_PRIMARY_COLOR;
        this.minutesNeedleColor = DEFAULT_PRIMARY_COLOR;

        this.degreesColor = DEFAULT_PRIMARY_COLOR;

        this.hoursValuesColor = DEFAULT_PRIMARY_COLOR;

        numbersColor = Color.WHITE;

        // 启动每间隔一秒刷新一次界面
        Timer timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                postInvalidate();
            }
        },0,1000);
    }

    @Override
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);

        mWidth = getHeight() > getWidth() ? getWidth() : getHeight();

        int halfWidth = mWidth / 2;
        mCenterX = halfWidth;
        mCenterY = halfWidth;
        mRadius = halfWidth;

        if (mShowAnalog) {
            drawDegrees(canvas);
            drawHoursValues(canvas);
            drawNeedles(canvas);
            drawCenter(canvas);
        } else {
            drawNumbers(canvas);
        }

    }

    private void drawDegrees(Canvas canvas) {

        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(mWidth * DEFAULT_DEGREE_STROKE_WIDTH);
        paint.setColor(degreesColor);

        int rPadded = mCenterX - (int) (mWidth * 0.01f);
        int rEnd = mCenterX - (int) (mWidth * 0.05f);

        for (int i = 0; i < FULL_ANGLE; i += 6 /* Step */) {

            if ((i % RIGHT_ANGLE) != 0 && (i % 15) != 0) {
                paint.setAlpha(CUSTOM_ALPHA);
            } else {
                paint.setAlpha(FULL_ALPHA);
            }

            int startX = (int) (mCenterX + rPadded * Math.cos(Math.toRadians(i)));
            int startY = (int) (mCenterX - rPadded * Math.sin(Math.toRadians(i)));

            int stopX = (int) (mCenterX + rEnd * Math.cos(Math.toRadians(i)));
            int stopY = (int) (mCenterX - rEnd * Math.sin(Math.toRadians(i)));

            canvas.drawLine(startX, startY, stopX, stopY, paint);
        }
    }

    /**
     * @param canvas
     */
    private void drawNumbers(Canvas canvas) {

        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(mWidth * 0.2f);
        textPaint.setColor(numbersColor);
        textPaint.setColor(numbersColor);
        textPaint.setAntiAlias(true);

        Calendar calendar = Calendar.getInstance();

        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        int amPm = calendar.get(Calendar.AM_PM);

        String time = String.format("%s:%s:%s%s",
                String.format(Locale.getDefault(), "%02d", hour),
                String.format(Locale.getDefault(), "%02d", minute),
                String.format(Locale.getDefault(), "%02d", second),
                amPm == AM ? "AM" : "PM");

        SpannableStringBuilder spannableString = new SpannableStringBuilder(time);
        spannableString.setSpan(new RelativeSizeSpan(0.3f), spannableString.toString().length() - 2, spannableString.toString().length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE); // se superscript percent

        StaticLayout layout = new StaticLayout(spannableString, textPaint, canvas.getWidth(), Layout.Alignment.ALIGN_CENTER, 1, 1, true);
        canvas.translate(mCenterX - layout.getWidth() / 2f, mCenterY - layout.getHeight() / 2f);
        layout.draw(canvas);
    }

    /**
     * Draw Hour Text Values, such as 1 2 3 ...
     *
     * @param canvas
     */
    private void drawHoursValues(Canvas canvas) {
        // Default Color:
        // - hoursValuesColor

        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(hoursValuesColor);
        paint.setTextSize(70);
        paint.setTextAlign(Paint.Align.CENTER);


        int rPadded = mCenterX - (int) (mWidth * 0.1f);

        for (int i = 0; i < FULL_ANGLE; i += 30 /* Step */) {

            if ((i % RIGHT_ANGLE) != 0 && (i % 15) != 0) {
                paint.setAlpha(CUSTOM_ALPHA);
            } else {
                paint.setAlpha(FULL_ALPHA);
            }

            int startX = (int) (mCenterX + rPadded * Math.sin(Math.toRadians(i)));
            int startY = (int) (mCenterX - rPadded * Math.cos(Math.toRadians(i)));

            String str = "";
            if (i >= 300) {
                str = i / 30 + "";
            } else {
                str = "0" + i / 30;
            }
            canvas.drawText(str, 0, str.length(), startX, startY, paint);
        }
    }

    /**
     * Draw hours, minutes needles
     * Draw progress that indicates hours needle disposition.
     *
     * @param canvas
     */
    private void drawNeedles(final Canvas canvas) {
        // Default Color:
        // - secondsNeedleColor
        // - hoursNeedleColor
        // - minutesNeedleColor

        Calendar mCalendar = Calendar.getInstance();
        int hour = mCalendar.get(Calendar.HOUR);
        int minute = mCalendar.get(Calendar.MINUTE);
        int second = mCalendar.get(Calendar.SECOND);

        int mHourPointerWidth = 8;
        int mHourPointerLength = 200;
        int mMinutePointerWidth = 6;
        int mMinutePointerLength = 250;
        int mSecondPointerWidth = 4;
        int mSecondPointerLength = 300;

        Paint mPaint = new Paint();
        mPaint.setStrokeWidth(mHourPointerWidth);
        mPaint.setColor(hoursNeedleColor);
        // 当前时间的总秒数
        float s = hour * 60 * 60 + minute * 60 + second;
        // 百分比
        float percentage = s / (12 * 60 * 60);
        // 通过角度计算弧度值，因为时钟的角度起线是y轴负方向，而View角度的起线是x轴正方向，所以要加270度
        float angle = 270 + 360 * percentage;
        float x = (float) (mCenterX + mHourPointerLength * Math.cos(Math.PI * 2 / 360 * angle));
        float y = (float) (mCenterY + mHourPointerLength * Math.sin(Math.PI * 2 / 360 * angle));
        canvas.drawLine(mCenterX, mCenterY, x, y, mPaint);

        mPaint.setStrokeWidth(mMinutePointerWidth);
        mPaint.setColor(minutesNeedleColor);
        s = minute * 60 + second;
        percentage = s / (60 * 60);
        angle = 270 + 360 * percentage;
        x = (float) (mCenterX + mMinutePointerLength * Math.cos(Math.PI * 2 / 360 * angle));
        y = (float) (mCenterY + mMinutePointerLength * Math.sin(Math.PI * 2 / 360 * angle));
        canvas.drawLine(mCenterX, mCenterY, x, y, mPaint);

        mPaint.setStrokeWidth(mSecondPointerWidth);
        mPaint.setColor(secondsNeedleColor);
        s = second;
        percentage = s / 60;
        angle = 270 + 360 * percentage;
        x = (float) (mCenterX + mSecondPointerLength * Math.cos(Math.PI * 2 / 360 * angle));
        y = (float) (mCenterY + mSecondPointerLength * Math.sin(Math.PI * 2 / 360 * angle));
        canvas.drawLine(mCenterX, mCenterY, x, y, mPaint);
    }

    /**
     * Draw Center Dot
     *
     * @param canvas
     */
    private void drawCenter(Canvas canvas) {
        // Default Color:
        // - centerInnerColor
        // - centerOuterColor

        Paint paint = new Paint();
        paint.setStrokeWidth(10);

        paint.setColor(centerOuterColor);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(mCenterX, mCenterY, 15, paint);

        paint.setColor(centerInnerColor);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(mCenterX, mCenterY, 15, paint);
    }

    public void setShowAnalog(boolean showAnalog) {
        mShowAnalog = showAnalog;
        invalidate();
    }

    public boolean isShowAnalog() {
        return mShowAnalog;
    }

}