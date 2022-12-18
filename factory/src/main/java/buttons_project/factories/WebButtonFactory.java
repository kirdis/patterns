package buttons_project.factories;

import buttons_project.products.Button;
import buttons_project.products.WebButton;

public class WebButtonFactory implements ButtonFactory {
    @Override
    public Button createButton() {
        return new WebButton();
    }
}
