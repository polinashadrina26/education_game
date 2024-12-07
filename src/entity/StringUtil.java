package entity;
import java.util.List;
public class StringUtil {

	public static String printList(List<?> listToPrint) {
		 StringBuilder stringBuilder = new StringBuilder();
		 
	     for (Object object : listToPrint) {
	         stringBuilder
	             .append(object.toString())
	             .append("\n");
	     }
	     return stringBuilder.toString();
	}
}
