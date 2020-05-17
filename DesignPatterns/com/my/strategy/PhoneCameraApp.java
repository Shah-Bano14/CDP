package com.my.strategy;

public class PhoneCameraApp {

	public String TakePhoto()
	{
		return "the photo has been taken";
	}
	public String editPhoto()
	{
		return "photo edited";
	}
	public String savePhoto()
	{
		return "photo saved";
	}
	public String sharePhoto(SharePhotothrough sharePhotoThrough)
	{
		return sharePhotoThrough.share();
	}
}
