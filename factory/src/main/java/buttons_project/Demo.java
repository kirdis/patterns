package buttons_project;

import buttons_project.factories.WindowsButtonFactory;
import buttons_project.products.Button;

public class Demo {
    public static void main(String[] args) {
        Button winButton = new WindowsButtonFactory().createButton();
        winButton.click();
        winButton.render();
    }
}
