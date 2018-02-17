// Some source code for the project

Photo photo = new Photo("dog.jpg", 12345);

activate_camera();
take_photo();

if (pictureSize >= 5000){
	System.out.println("Photo too large");
}
photo.process();



Gallery gallery = new Gallery();
gallery.fill();
gallery.add(photo);



// Code continues here