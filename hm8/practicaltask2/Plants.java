public class Plants {
   private Type type;
   private Color color;
   private int size;

   public Plants(String type, String color, int size) throws ColorException, TypeException{
      Color c = colorStrToEnum(color);
      Type t = typeStrToEnum(type);

      this.size = size;
      this.type = t;
      this.color = c;
   }

   private Color colorStrToEnum(String color) throws ColorException{
      switch(color.toLowerCase()){
         case "blue" : return Color.BLUE; 
         case "red" : return Color.RED; 
         case "white" : return Color.WHITE; 
         default : throw new ColorException("Input only color blue, red or white");
      }
   }
   
   private Type typeStrToEnum(String type) throws  TypeException{
	   switch(type.toLowerCase()){
	   case "roses" : return Type.ROSES;
	   case "chamomile" : return Type.CHAMOMILE;
	   case "marigold" : return Type.MARIGOLD;
	   default: throw new TypeException("Input only ROSES, CHAMOMILE, MARIGOLD");
	   }
   }
 
@Override
public String toString() {
	return "Plants {" +
            "size=" + size +
            ", color=" + color +
            ", type=" + type +
            '}';
}
}
