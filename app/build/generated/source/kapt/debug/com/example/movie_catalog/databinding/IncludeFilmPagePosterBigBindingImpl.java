package com.example.movie_catalog.databinding;
import com.example.movie_catalog.R;
import com.example.movie_catalog.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class IncludeFilmPagePosterBigBindingImpl extends IncludeFilmPagePosterBigBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.poster, 4);
        sViewsWithIds.put(R.id.logotype, 5);
        sViewsWithIds.put(R.id.iconList, 6);
        sViewsWithIds.put(R.id.iv_share, 7);
        sViewsWithIds.put(R.id.iv_other, 8);
        sViewsWithIds.put(R.id.nameRuOrig, 9);
        sViewsWithIds.put(R.id.ratingName, 10);
        sViewsWithIds.put(R.id.yearGenreOther, 11);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public IncludeFilmPagePosterBigBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private IncludeFilmPagePosterBigBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.TextView) bindings[9]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[11]
            );
        this.ivBookmark.setTag(null);
        this.ivFavorite.setTag(null);
        this.ivViewed.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewmodel == variableId) {
            setViewmodel((com.example.movie_catalog.ui.film_page.FilmPageViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable com.example.movie_catalog.ui.film_page.FilmPageViewModel Viewmodel) {
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelViewed((kotlinx.coroutines.flow.StateFlow<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewmodelBookmark((kotlinx.coroutines.flow.StateFlow<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewmodelFavorite((kotlinx.coroutines.flow.StateFlow<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelViewed(kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> ViewmodelViewed, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelBookmark(kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> ViewmodelBookmark, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelFavorite(kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> ViewmodelFavorite, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        boolean androidxDatabindingViewDataBindingSafeUnboxViewmodelFavoriteGetValue = false;
        android.graphics.drawable.Drawable viewmodelBookmarkIvBookmarkAndroidDrawableIconBookmarkSelectedIvBookmarkAndroidDrawableIconBookmark = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewmodelViewedGetValue = false;
        android.graphics.drawable.Drawable viewmodelViewedIvViewedAndroidDrawableIconViewedIvViewedAndroidDrawableIconUnviewed = null;
        kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> viewmodelViewed = null;
        java.lang.Boolean viewmodelFavoriteGetValue = null;
        java.lang.Boolean viewmodelViewedGetValue = null;
        kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> viewmodelBookmark = null;
        kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> viewmodelFavorite = null;
        java.lang.Boolean viewmodelBookmarkGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewmodelBookmarkGetValue = false;
        com.example.movie_catalog.ui.film_page.FilmPageViewModel viewmodel = mViewmodel;
        android.graphics.drawable.Drawable viewmodelFavoriteIvFavoriteAndroidDrawableIconFavoriteSelectedIvFavoriteAndroidDrawableIconFavorite = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.viewed
                        viewmodelViewed = viewmodel.getViewed();
                    }
                    androidx.databinding.ViewDataBindingKtx.updateStateFlowRegistration(this, 0, viewmodelViewed);


                    if (viewmodelViewed != null) {
                        // read viewmodel.viewed.getValue()
                        viewmodelViewedGetValue = viewmodelViewed.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.viewed.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewmodelViewedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelViewedGetValue);
                if((dirtyFlags & 0x19L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewmodelViewedGetValue) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.viewed.getValue()) ? @android:drawable/icon_viewed : @android:drawable/icon_unviewed
                    viewmodelViewedIvViewedAndroidDrawableIconViewedIvViewedAndroidDrawableIconUnviewed = ((androidxDatabindingViewDataBindingSafeUnboxViewmodelViewedGetValue) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(ivViewed.getContext(), R.drawable.icon_viewed)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(ivViewed.getContext(), R.drawable.icon_unviewed)));
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.bookmark
                        viewmodelBookmark = viewmodel.getBookmark();
                    }
                    androidx.databinding.ViewDataBindingKtx.updateStateFlowRegistration(this, 1, viewmodelBookmark);


                    if (viewmodelBookmark != null) {
                        // read viewmodel.bookmark.getValue()
                        viewmodelBookmarkGetValue = viewmodelBookmark.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.bookmark.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewmodelBookmarkGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelBookmarkGetValue);
                if((dirtyFlags & 0x1aL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewmodelBookmarkGetValue) {
                            dirtyFlags |= 0x40L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.bookmark.getValue()) ? @android:drawable/icon_bookmark_selected : @android:drawable/icon_bookmark
                    viewmodelBookmarkIvBookmarkAndroidDrawableIconBookmarkSelectedIvBookmarkAndroidDrawableIconBookmark = ((androidxDatabindingViewDataBindingSafeUnboxViewmodelBookmarkGetValue) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(ivBookmark.getContext(), R.drawable.icon_bookmark_selected)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(ivBookmark.getContext(), R.drawable.icon_bookmark)));
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.favorite
                        viewmodelFavorite = viewmodel.getFavorite();
                    }
                    androidx.databinding.ViewDataBindingKtx.updateStateFlowRegistration(this, 2, viewmodelFavorite);


                    if (viewmodelFavorite != null) {
                        // read viewmodel.favorite.getValue()
                        viewmodelFavoriteGetValue = viewmodelFavorite.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.favorite.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewmodelFavoriteGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelFavoriteGetValue);
                if((dirtyFlags & 0x1cL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewmodelFavoriteGetValue) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.favorite.getValue()) ? @android:drawable/icon_favorite_selected : @android:drawable/icon_favorite
                    viewmodelFavoriteIvFavoriteAndroidDrawableIconFavoriteSelectedIvFavoriteAndroidDrawableIconFavorite = ((androidxDatabindingViewDataBindingSafeUnboxViewmodelFavoriteGetValue) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(ivFavorite.getContext(), R.drawable.icon_favorite_selected)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(ivFavorite.getContext(), R.drawable.icon_favorite)));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.ivBookmark, viewmodelBookmarkIvBookmarkAndroidDrawableIconBookmarkSelectedIvBookmarkAndroidDrawableIconBookmark);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.ivFavorite, viewmodelFavoriteIvFavoriteAndroidDrawableIconFavoriteSelectedIvFavoriteAndroidDrawableIconFavorite);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.ivViewed, viewmodelViewedIvViewedAndroidDrawableIconViewedIvViewedAndroidDrawableIconUnviewed);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.viewed
        flag 1 (0x2L): viewmodel.bookmark
        flag 2 (0x3L): viewmodel.favorite
        flag 3 (0x4L): viewmodel
        flag 4 (0x5L): null
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.bookmark.getValue()) ? @android:drawable/icon_bookmark_selected : @android:drawable/icon_bookmark
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.bookmark.getValue()) ? @android:drawable/icon_bookmark_selected : @android:drawable/icon_bookmark
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.viewed.getValue()) ? @android:drawable/icon_viewed : @android:drawable/icon_unviewed
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.viewed.getValue()) ? @android:drawable/icon_viewed : @android:drawable/icon_unviewed
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.favorite.getValue()) ? @android:drawable/icon_favorite_selected : @android:drawable/icon_favorite
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.favorite.getValue()) ? @android:drawable/icon_favorite_selected : @android:drawable/icon_favorite
    flag mapping end*/
    //end
}