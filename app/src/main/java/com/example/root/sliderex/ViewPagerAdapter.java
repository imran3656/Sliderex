package com.example.root.sliderex;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

public class ViewPagerAdapter extends PagerAdapter {
    private Context context;
    private LayoutInflater layoutInflater;
    private Integer []images={R.drawable.bidve,R.drawable.golai,R.drawable.grand,
            R.drawable.pvr,R.drawable.shivajimaharaj};

    public ViewPagerAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        layoutInflater =(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view=layoutInflater.inflate(R.layout.custom_layout,null);
        ImageView imageView=(ImageView)view.findViewById(R.id.ImageView1);
        imageView.setImageResource(images[position]);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(position==0)
                {
                    Toast.makeText(context,"Bidve College",Toast.LENGTH_LONG).show();
                }
                else if(position==1)
                {
                    Toast.makeText(context,"Glory of Latur, Golai",Toast.LENGTH_LONG).show();
                }
                else if(position==2)
                {
                    Toast.makeText(context,"Grand 5 Star Hotel",Toast.LENGTH_LONG).show();
                }
                else if(position==3)
                {
                    Toast.makeText(context,"Multiplex Theater",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(context,"Statue of Shivaji Maharaj Center In The City",Toast.LENGTH_LONG).show();
                }
            }
        });

        ViewPager vp=(ViewPager)container;
        vp.addView(view,0);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ViewPager vp=(ViewPager)container;
        View view = (View)object;
        vp.removeView(view);
    }
}

