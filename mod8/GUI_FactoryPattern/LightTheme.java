package mod8.GUI_FactoryPattern;

public class LightTheme {

    public static class LightButton implements Button {
        @Override
        public void render() {
            System.out.println("Rendering a Light Button");
        }
    }

    public static class LightTextField implements TextField {
        @Override
        public void render() {
            System.out.println("Rendering a Light TextField");
        }
    }
}
