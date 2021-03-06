import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MachineGunBullet extends Bullet {
    public MachineGunBullet()
    {
        dame = 15;
        range = 40;
        speed = 600;
        image = new Image("AssetsKit_1/shapes/180.png");
        imageView = new ImageView(image);
        imageView.setFitHeight(12);
        imageView.setFitWidth(12);
    }
    public double getHeight() {
        return imageView.getFitHeight();
    }

    @Override
    public double getWidth() {
        return imageView.getFitWidth();
    }
}
