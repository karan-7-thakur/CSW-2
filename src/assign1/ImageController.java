package assign1;

class ImageLibrary {
    Image[] images;
    int size;
    int capacity;

    public ImageLibrary(int capacity) {
        this.capacity = capacity;
        images = new Image[capacity];
        size = 0;
    }

    public void insertImage(Image img) {
        if (size < capacity) {
            images[size++] = img;
        }
    }

    public Image findImage(String color) {
        for (Image image : images) {
            if (image.imageColor.equals(color)) {
                return image;
            }
        }

        return null;
    }

}

public class ImageController {
    public static void main(String[] args) {
        ImageLibrary library = new ImageLibrary(5);

        // Create some Image objects
        Image img1 = new Image(100, 200, "RED");
        Image img2 = new Image(150, 250, "BLUE");
        Image img3 = new Image(200, 300, "GREEN");

        // Insert images into the library
        library.insertImage(img1);
        library.insertImage(img2);
        library.insertImage(img3);

        // Find an image by color
        Image foundImage = library.findImage("BLUE");
        if (foundImage != null) {
            System.out.println("Found Image: " + foundImage);
        } else {
            System.out.println("Image not found.");
        }

        // Try to find an image with a color that doesn't exist
        Image notFoundImage = library.findImage("YELLOW");
        if (notFoundImage != null) {
            System.out.println("Found Image: " + notFoundImage);
        } else {
            System.out.println("Image not found.");
        }

    }
}
