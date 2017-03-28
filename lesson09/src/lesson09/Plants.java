package lesson09;

public class Plants {
	private int size;
	private Color color;
	private Type type;

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

	public Plants(int size, String color, String type) throws TypeException, ColorException {
		Color c = strToEnum(color);
		Type t = strToType(type);
		this.size = size;
		this.color = c;
		this.type = t;
	}
	
	private Color strToEnum(String color) throws ColorException{
		switch(color.toLowerCase()){
		case "red": 
			return Color.RED;
		case "green": 
			return Color.GREEN;
		case "yellow": 
			return Color.YELLOW;
		default: throw new ColorException("No such color"); 
		}
	}
	
	private Type strToType(String type)throws TypeException{
		switch (type.toLowerCase()) {
		case "rose": 
			return Type.ROSE;
		case "lytik":
			return Type.LUTIK;
		default:
			throw new TypeException("No such type");
		}
	}

}
