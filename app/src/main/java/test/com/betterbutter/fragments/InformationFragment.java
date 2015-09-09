package test.com.betterbutter.fragments;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import test.com.betterbutter.R;

/**
 * Created by Aditya Narayan on 9/9/2015.
 */
public class InformationFragment extends Fragment {

    Typeface font_1;
    TextView made_by_text;
    View view;

    @Nullable

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_info, container, false);
        made_by_text = (TextView) view.findViewById(R.id.tv_editor);
        made_by_text.setTypeface(font_1);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        font_1 = (Typeface.createFromAsset(getActivity().getAssets(), "sans_light.ttf"));
    }
}
