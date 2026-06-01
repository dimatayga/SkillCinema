package com.example.movie_catalog.animations

import android.annotation.SuppressLint
import android.graphics.drawable.AnimationDrawable
import android.graphics.drawable.Drawable
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.Target
import com.example.movie_catalog.R
import javax.inject.Inject

/*
Module for downloading images from the Internet using glide and animation processing load.
During the loading process, the image changes size and context.
Performs exception handling.
Before loading the image, the gradient animation is displayed.
 */
class LoadImageURLShow @Inject constructor() {
    
    @SuppressLint("ResourceAsColor")
    fun setAnimation(view: ImageView, imageURL: String?, roundedCorners: Int, centerCrop: Boolean = true) {
        val radius = view.resources.getDimensionPixelOffset(roundedCorners)
        val context = view.context
        var animationCard: AnimationDrawable? = null
        
        // Start of the image loading animation.
        if (view.background is AnimationDrawable) {
            animationCard = view.background as AnimationDrawable
            animationCard.apply {
                setEnterFadeDuration(1000)
                setExitFadeDuration(1000)
                start()
            }
        }
        
        //If there is no link to the image, then we substitute a stub and stop the animation.
        if (imageURL.isNullOrEmpty()) {
            view.setImageResource(R.drawable.ic_baseline_image_not_supported_24)
            animationCard?.stop()
            view.background?.alpha = 0
        } else {
            //Starting the image loading process.
            val option = if (!centerCrop) RequestOptions().transform(RoundedCorners(radius))
            else RequestOptions().transform(CenterCrop(), RoundedCorners(radius))
            
            Glide.with(view)
                .load(imageURL)
                .fallback(R.drawable.ic_baseline_image_not_supported_24)
                .apply(option)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .listener(object : RequestListener<Drawable> {
                    override fun onLoadFailed(
                        resource: GlideException?, model: Any?,
                        target: Target<Drawable>?, isFirstResource: Boolean
                    ): Boolean {
                        Toast.makeText(context, "Error load image", Toast.LENGTH_SHORT).show()
                        animationCard?.stop()
                        view.background?.alpha = 0
                        return false
                    }

                    override fun onResourceReady(
                        resource: Drawable?, model: Any?,
                        target: Target<Drawable>?, dataSource: com.bumptech.glide.load.DataSource?,
                        isFirstResource: Boolean
                    ): Boolean {
                        animationCard?.stop()
                        view.background?.alpha = 0
                        return false
                    }
                })
                .into(view)
        }
    }
}
