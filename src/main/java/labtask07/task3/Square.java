package labtask07.task3;

public class Square extends Rectangle {

    @Override
    public void setDimensions(int w, int h) {

        if (w != h) {

            throw new IllegalArgumentException(
                "Width and height must be equal!"
            );
        }

        width = w;
        height = h;
    }
}