package com.next.addtocart;


import android.view.animation.Interpolator;

/**
 * Created by NeXT on 15-6-17.
 */
public class CustomInterpolator implements Interpolator {

    private final float mTension;

    public CustomInterpolator() {
        mTension = 2.0f;
    }

    public CustomInterpolator(float tension) {
        mTension = tension;
    }

    @Override
    public float getInterpolation(float t) {
        // a(t) = t * t * ((tension + 1) * t - tension)
        if (t < 1) {
            t += 0.113;
        }
        return t * t * (((mTension + 1) * t) - mTension);
    }

}
