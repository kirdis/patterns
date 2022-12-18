package buttons_project.products;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Render windows button");
    }

    @Override
    public void click() {
        System.out.println("Click on windows button");
    }
}
