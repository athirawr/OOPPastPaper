public class Desk {
    float width;
    float height;

    float price;

    public Desk(float width, float height){
        this.width = width;
        this.height = height;

    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void printInfo(){
        System.out.println("Height: " + getHeight());
        System.out.println("Width: " + getWidth());
        System.out.println("Price: " + getPrice());
    }
}
