package buttons_project.factories;

import buttons_project.products.Button;
import buttons_project.products.WindowsButton;

public class WindowsButtonFactory implements ButtonFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
