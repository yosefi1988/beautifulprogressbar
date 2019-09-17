package ir.sajjadyosefi.beautifulprogressbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;

public class ProgressbarContainer  extends RelativeLayout {

    private View mValue;
    private ImageView mImage;

    public ProgressbarContainer(Context context) {
        super(context);

    }

    public ProgressbarContainer(Context context, AttributeSet attrs, int defStyle){
        super(context, attrs, defStyle);
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public ProgressbarContainer(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray a = context.obtainStyledAttributes(attrs,R.styleable.beautifulprogressbarOptions, 0, 0);
        String titleText = a.getString(R.styleable.beautifulprogressbarOptions_titleText);

//		@SuppressWarnings("ResourceAsColor")
//		int valueColor = a.getColor(R.styleable.TestOptions_valueColor,android.R.color.holo_blue_light);
        a.recycle();

        setGravity(Gravity.CENTER);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.new_ui_progressbar_view, this, true);

        setBackground(ContextCompat.getDrawable(context , R.color.new_ui_progress_bar_back_color));

        RelativeLayout relativeLayout = (RelativeLayout) getChildAt(0);
        TextView title = (TextView)relativeLayout.getChildAt(0);
        title.setText(titleText);

//        DualProgressView loading_progressbar = (DualProgressView) this.findViewById(R.id.loading_progressbar);
//        loading_progressbar.

//		mValue = getChildAt(1);
//		mValue.setBackgroundColor(valueColor);
//
//		mImage = (ImageView) getChildAt(2);
    }





}
