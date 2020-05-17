package com.my.strategy;

public class CameraDriver {

	public static void main(String[] args) {
		PhoneCameraApp basicCameraApp=new BasicCameraApp();
		SharePhotothrough sharePhotothrough=new SharePhotoThroughEmail();
		System.out.println(basicCameraApp.TakePhoto());
		System.out.println(basicCameraApp.editPhoto());
		System.out.println(basicCameraApp.savePhoto());
		System.out.println(basicCameraApp.sharePhoto(sharePhotothrough));

	}

}
