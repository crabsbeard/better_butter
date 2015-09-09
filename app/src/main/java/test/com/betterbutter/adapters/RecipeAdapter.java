package test.com.betterbutter.adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import test.com.betterbutter.R;
import test.com.betterbutter.views.RecipeView;

/**
 * Created by Aditya Narayan on 9/8/2015.
 */
public class RecipeAdapter extends RecyclerView.Adapter<RecipeView> {

    private LayoutInflater layoutInflater;
    Bitmap coverImage;
    Bitmap userImage;
    Bitmap likeIcon;
    ArrayList<Integer> recipeList;


    public RecipeAdapter(Context context) {
        layoutInflater = LayoutInflater.from(context);
        coverImage = BitmapFactory.decodeResource(context.getResources(), R.drawable.img_main);
        userImage = BitmapFactory.decodeResource(context.getResources(), R.drawable.user_image);
        likeIcon = BitmapFactory.decodeResource(context.getResources(), R.drawable.icon_like);
    }

    public void setExploreCardsList(ArrayList<Integer> recipeList) {
        this.recipeList = recipeList;
        notifyItemRangeChanged(0, recipeList.size());
    }

    @Override
    public RecipeView onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.recipe_item, parent, false);
        RecipeView recipeView = new RecipeView(view);
        return recipeView;
    }

    @Override
    public void onBindViewHolder(RecipeView holder, int position) {



        holder.getIv_userImage().setImageBitmap(userImage);
        holder.getUserName().setText("Anushka");
        holder.getRecipeSubmitTime().setText("Updated 13 hours ago");
        holder.getRecipeDescription().setText("Indulge your sweet tooth...");
        holder.getIv_coverImage().setImageBitmap(coverImage);
        holder.getLikeCountTop().setText("35");
        holder.getRecipeName().setText("Eggless Chocolate Cake");
        holder.getLikeCount().setText("24");
        holder.getShareCount().setText("05");
        holder.getAddPeopleCount().setText("24");
        holder.getUserLikeStatus().setImageBitmap(likeIcon);
    }

    @Override
    public int getItemCount() {
        return 8;
    }
}
