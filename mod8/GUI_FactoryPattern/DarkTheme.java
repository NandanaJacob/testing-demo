package mod8.GUI_FactoryPattern;

public class DarkTheme {

    public static class DarkButton implements Button {
        @Override
        public void render() {
            System.out.println("Rendering a Dark Button");
        }
    }

    public static class DarkTextField implements TextField {
        @Override
        public void render() {
            System.out.println("Rendering a Dark TextField");
        }
    }
}

