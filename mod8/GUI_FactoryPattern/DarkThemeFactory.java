package mod8.GUI_FactoryPattern;

public class DarkThemeFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new DarkTheme.DarkButton();  // Creates a Dark Button
    }

    @Override
    public TextField createTextField() {
        return new DarkTheme.DarkTextField();  // Creates a Dark TextField
    }
}
