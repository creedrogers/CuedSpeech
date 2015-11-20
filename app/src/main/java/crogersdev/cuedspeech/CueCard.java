package crogersdev.cuedspeech;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by chris on 10/24/15.
 */
public class CueCard extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.consonants_tab_view, container, false);

        Bundle args = getArguments();
        //((TextView)rootView.findViewById(R.id.text)).setText("Page " + args.getInt("page_position"));
        ((TextView)rootView.findViewById(R.id.cuecard_label)).setText(args.getString("label"));
        ((TextView)rootView.findViewById(R.id.cuecard_phonemes)).setText(args.getString("phonemes"));
        ((TextView)rootView.findViewById(R.id.cuecard_mnemonic)).setText(args.getString("mnemonic"));
        Log.d("crogersdev", "cue_image is: " + args.getInt("cue_image"));
        switch (args.getInt("cue_image")) {
            case 1:
                rootView.findViewById(R.id.cue_image).setBackgroundResource(R.drawable.handshape_1_icon);
                break;
            case 2:
                rootView.findViewById(R.id.cue_image).setBackgroundResource(R.drawable.handshape_2_icon);
                break;
            case 3:
                rootView.findViewById(R.id.cue_image).setBackgroundResource(R.drawable.handshape_3_icon);
                break;
            case 4:
                rootView.findViewById(R.id.cue_image).setBackgroundResource(R.drawable.handshape_4_icon);
                break;
            case 5:
                rootView.findViewById(R.id.cue_image).setBackgroundResource(R.drawable.handshape_5_icon);
                break;
            case 6:
                rootView.findViewById(R.id.cue_image).setBackgroundResource(R.drawable.handshape_6_icon);
                break;
            case 7:
                rootView.findViewById(R.id.cue_image).setBackgroundResource(R.drawable.handshape_7_icon);
                break;
            case 8:
                rootView.findViewById(R.id.cue_image).setBackgroundResource(R.drawable.handshape_8_icon);
                break;
        }

        return rootView;
    }

    public class AspectRatioImageView extends ImageView {
        public AspectRatioImageView(Context cxt) {
            super(cxt);
        }
        public AspectRatioImageView(Context cxt, AttributeSet attrs) {
            super(cxt, attrs);
        }
        public AspectRatioImageView(Context cxt, AttributeSet attrs, int defStyle) {
            super(cxt, attrs, defStyle);
        }

        @Override
        protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
            int width = MeasureSpec.getSize(widthMeasureSpec);
            int height = width * getDrawable().getIntrinsicHeight() / getDrawable().getIntrinsicWidth();
            setMeasuredDimension(width, height);
        }

    }
}