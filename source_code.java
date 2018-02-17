// Some source code for the project

Photo photo = new Photo("dog.jpg", 12345);

activate_camera();
take_photo();

if (pictureSize >= 1000){
	System.out.println("Photo too large");
	askForNewPhoto();
}
else{
	photo.process();
}



