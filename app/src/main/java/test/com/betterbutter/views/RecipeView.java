package test.com.betterbutter.views;

import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import test.com.betterbutter.R;

/**
 *
 * Created by Aditya Narayan on 9/8/2015.
 *
 */
public class RecipeView extends RecyclerView.ViewHolder {

    private ImageView iv_userImage;
    private TextView userName;
    private TextView recipeSubmitTime;
    private TextView recipeDescription;
    private TextView recipeName;
    private ImageView iv_coverImage;
    private ImageView userLikeStatus;
    private TextView likeCount;
    private TextView likeCountTop;
    private TextView shareCount;
    private TextView addPeopleCount;

    private Typeface myriad_regular;
    private Typeface myriad_bold;


    public RecipeView(View itemView) {
        super(itemView);
        iv_userImage = (ImageView)itemView.findViewById(R.id.iv_profile_image);
        iv_coverImage = (ImageView)itemView.findViewById(R.id.iv_coverImage);
        userName = (TextView)itemView.findViewById(R.id.tv_user_name);
        recipeSubmitTime = (TextView)itemView.findViewById(R.id.tv_time);
        recipeDescription = (TextView)itemView.findViewById(R.id.tv_recipeDesc);
        userLikeStatus = (ImageView)itemView.findViewById(R.id.iv_likeStatus);
        recipeName = (TextView)itemView.findViewById(R.id.tv_recipeName);
        likeCountTop = (TextView)itemView.findViewById(R.id.tv_likeCountTop);
        likeCount = (TextView)itemView.findViewById(R.id.tv_likeCount);
        shareCount = (TextView)itemView.findViewById(R.id.tv_shareCount);
        addPeopleCount = (TextView)itemView.findViewById(R.id.tv_peopleCount);

        setUpTypeFaces(itemView);
        setUpTextTypeFaces();

    }

    private void setUpTextTypeFaces() {

        userName.setTypeface(myriad_bold);
        recipeSubmitTime.setTypeface(myriad_regular);
        recipeDescription.setTypeface(myriad_bold);
        likeCountTop.setTypeface(myriad_bold);
        likeCount.setTypeface(myriad_regular);
        shareCount.setTypeface(myriad_regular);
        addPeopleCount.setTypeface(myriad_regular);
        recipeName.setTypeface(myriad_bold);
    }

    private void setUpTypeFaces(View itemView) {
        myriad_regular = (Typeface.createFromAsset(itemView.getContext().getAssets(),"myriad_reg.otf"));
        myriad_bold = (Typeface.createFromAsset(itemView.getContext().getAssets(),"myriad_bold.otf"));
    }

    public ImageView getIv_userImage() {
        return iv_userImage;
    }

    public TextView getUserName() {
        return userName;
    }

    public TextView getRecipeSubmitTime() {
        return recipeSubmitTime;
    }

    public TextView getRecipeDescription() {
        return recipeDescription;
    }

    public TextView getRecipeName() {
        return recipeName;
    }

    public ImageView getIv_coverImage() {
        return iv_coverImage;
    }

    public ImageView getUserLikeStatus() {
        return userLikeStatus;
    }

    public TextView getLikeCount() {
        return likeCount;
    }

    public TextView getLikeCountTop() {
        return likeCountTop;
    }

    public TextView getShareCount() {
        return shareCount;
    }

    public TextView getAddPeopleCount() {
        return addPeopleCount;
    }
}
