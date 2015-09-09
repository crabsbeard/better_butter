package test.com.betterbutter.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import test.com.betterbutter.R;
import test.com.betterbutter.adapters.RecipeAdapter;

/**
 * Created by Aditya Narayan on 9/9/2015.
 */
public class FeedFragment extends Fragment {
    private RecyclerView recipeList;
    private ArrayList<Integer> ids = new ArrayList<>();
    RecipeAdapter recipeAdapter;
    View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_feed, container, false);
        recipeList = (RecyclerView) view.findViewById(R.id.rv_recipeList);
        recipeList.setLayoutManager(new LinearLayoutManager(getActivity()));
        addContent();
        return view;

    }


    private void addContent() {
        for(int i = 0; i<8;i++){
            ids.add(i);
        }
        recipeAdapter = new RecipeAdapter(getActivity());
        recipeAdapter.setExploreCardsList(ids);
        recipeList.setAdapter(recipeAdapter);
    }
}
