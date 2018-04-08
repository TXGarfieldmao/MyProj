package com.mjh.screendpi;

import android.content.Context;

public class ViewUtils
{

	public static float DEVICE_DENSITY = 0;

	/**
	 * 根据手机的分辨率从 dp 的单位 转成为 px(像素)
	 */
	public static int dip2px(Context context, float dpValue)
	{
        if( context == null ){
            return (int) (dpValue * 2.75 + 0.5f);
        }

		final float scale = context.getResources().getDisplayMetrics().density;
		return (int) (dpValue * scale + 0.5f);
	}

	/**
	 * 根据手机的分辨率从 px(像素) 的单位 转成为 dp
	 */
	public static int px2dip(Context context, float pxValue)
	{
		final float scale = context.getResources().getDisplayMetrics().density;
		return (int) (pxValue / scale + 0.5f);
	}

	/**
	 * 根据某个密度从 px(像素) 的单位 转成为 dp
	 */
	public static int px2dip(float pxValue, float density) {
		return (int) (pxValue / density + 0.5f);
	}

}
