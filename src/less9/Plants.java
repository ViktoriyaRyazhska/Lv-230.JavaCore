package less9;

public class Plants {
	private int size;
	private Color color;
	private Type type;

	public Plants(int size, String color, String type) throws TypeException, ColorException {
		Color c = colorStrToEnum(color);
		Type t = typeStrToEnum(type);
		this.size = size;
		this.color = c;
		this.type = t;
	}

	public Color colorStrToEnum(String str) throws ColorException {
		switch (str.toLowerCase()) {
		case "red": {
			return Color.RED;
		}
		case "blue": {
			return Color.BLUE;
		}
		case "white": {
			return Color.WHITE;
		}

		default:
			throw new ColorException("Enter only (red, blue, white): ");
		}

	}

	public Type typeStrToEnum(String str) throws TypeException {
		switch (str.toLowerCase()) {
		case "rose": {
			return Type.ROSE;
		}
		case "tulip": {
			return Type.TULIP;
		}
		case "chamomile": {
			return Type.CHAMOMILE;
		}
		default:
			throw new TypeException("Enter only (rose, chamomile, tulip)");
		}
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Plants [size=" + size + ", color=" + color + ", type=" + type + "]";
	}

}
