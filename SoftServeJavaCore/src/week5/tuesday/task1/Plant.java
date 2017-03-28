package week5.tuesday.task1;

/**
 * Create a class Plant, which includes fields int size, Color color and Type type,
 * and constructor where these fields are initialized.
 * Color and type are Enum.
 * Override the method toString( ).
 */
public class Plant {
    private int size;
    private Color color;
    private Type type;

    public Plant(int size, String color, String type) throws ColorException, TypeException {
        this.size = size;
        this.color = convertStringToColor(color);
        this.type = convertStringToType(type);

    }

    public Color convertStringToColor(String stringColor) throws ColorException {
        Color color = null;
        try {
            color =  Color.valueOf(stringColor.toUpperCase());
        } catch (NullPointerException npe) {
            System.err.println(npe.getMessage());
        } catch (IllegalArgumentException iae) {
            throw new ColorException(iae.getMessage());
        }

        return color;
    }

    public Type convertStringToType(String stringType) throws TypeException {
        Type type = null;
        try {
            type =  Type.valueOf(stringType.toUpperCase());
        } catch (NullPointerException npe) {
            System.err.println(npe.getMessage());
        } catch (IllegalArgumentException iae) {
            throw new TypeException(iae.getMessage());
        }

        return type;
    }

    @Override
    public String toString() {
        return "Plant {" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }
}
