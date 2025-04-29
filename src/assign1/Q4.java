package assign1;

class Image {
    int imageWidth;
    int imageHeight;
    String imageColor;

    public Image(int imageWidth, int imageHeight, String imageColor) {
        this.imageWidth = imageWidth;
        this.imageHeight = imageHeight;
        this.imageColor = imageColor;
    }

    @Override
    public String toString() {
        return "Image [imageWidth=" + imageWidth + ", imageHeight=" + imageHeight + ", imageColor=" + imageColor + "]";
    }

}

public class Q4 {

    public static void main(String[] args) {
        Image img = new Image(10, 20, "RED");
        System.out.println(img);
    }

}
