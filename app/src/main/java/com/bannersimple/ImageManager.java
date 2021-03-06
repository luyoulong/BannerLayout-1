package com.bannersimple;

import android.widget.ImageView;

import com.bannerlayout.Interface.ImageLoaderManager;
import com.bannersimple.bean.BannerBean;
import com.squareup.picasso.Picasso;

/**
 * by y on 2016/12/2
 */

public class ImageManager implements ImageLoaderManager<BannerBean> {

    @Override
    public void display(ImageView imageView, BannerBean model) {
        Picasso.with(imageView.getContext())
                .load(model.getImageUrl())
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(imageView);
    }
}
