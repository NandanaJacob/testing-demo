package mod8.GUI_FactoryPattern;

public class LightThemeFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new LightTheme.LightButton();  // Creates a Light Button
    }

    @Override
    public TextField createTextField() {
        return new LightTheme.LightTextField();  // Creates a Light TextField
    }
}