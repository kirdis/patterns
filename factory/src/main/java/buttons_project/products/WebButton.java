package buttons_project.products;

public class WebButton implements Button {
    @Override
    public void render() {
        System.out.println("Render web button");
    }

    @Override
    public void click() {
        System.out.println("Click on web button");
    }
}
