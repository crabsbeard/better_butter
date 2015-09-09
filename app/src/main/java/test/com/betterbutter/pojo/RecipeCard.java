package test.com.betterbutter.pojo;

/**
 *
 * Created by Aditya Narayan on 9/8/2015.
 *
 */
public class RecipeCard {

    private String id;
    private String userImage_url;
    private String userName;
    private String recipeSubmitTime;
    private String recipeDescription;
    private String recipeName;
    private String coverImage_url;
    private Boolean userLikeStatus;
    private String likeCount;
    private String shareCount;
    private String addPeopleCount;

    public void setId(String id) {
        this.id = id;
    }

    public void setUserImage_url(String userImage_url) {
        this.userImage_url = userImage_url;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setRecipeSubmitTime(String recipeSubmitTime) {
        this.recipeSubmitTime = recipeSubmitTime;
    }

    public void setRecipeDescription(String recipeDescription) {
        this.recipeDescription = recipeDescription;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public void setCoverImage_url(String coverImage_url) {
        this.coverImage_url = coverImage_url;
    }

    public void setUserLikeStatus(Boolean userLikeStatus) {
        this.userLikeStatus = userLikeStatus;
    }

    public void setLikeCount(String likeCount) {
        this.likeCount = likeCount;
    }

    public void setShareCount(String shareCount) {
        this.shareCount = shareCount;
    }

    public void setAddPeopleCount(String addPeopleCount) {
        this.addPeopleCount = addPeopleCount;
    }

    public String getId() {
        return id;
    }

    public String getUserImage_url() {
        return userImage_url;
    }

    public String getUserName() {
        return userName;
    }

    public String getRecipeSubmitTime() {
        return recipeSubmitTime;
    }

    public String getRecipeDescription() {
        return recipeDescription;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public String getCoverImage_url() {
        return coverImage_url;
    }

    public Boolean getUserLikeStatus() {
        return userLikeStatus;
    }

    public String getLikeCount() {
        return likeCount;
    }

    public String getShareCount() {
        return shareCount;
    }

    public String getAddPeopleCount() {
        return addPeopleCount;
    }
}
