package com.kayo.mutiimageview;

import android.support.annotation.IntDef;
import android.support.annotation.RestrictTo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import static android.support.annotation.RestrictTo.Scope.GROUP_ID;
import static com.kayo.mutiimageview.MutiImageView.STYLE_CIRCLE;
import static com.kayo.mutiimageview.MutiImageView.STYLE_RECTANGLE;

/**
 * Created by shilei on 17/2/17.
 * <pre>
 *      限定样式类型
 * </pre>
 */
@RestrictTo(GROUP_ID)
@IntDef({STYLE_CIRCLE,STYLE_RECTANGLE})
@Retention(RetentionPolicy.SOURCE)
public @interface Style {
}
