import java.util.*;
public class HW20_3{
    public static void main(String[] args) {
        GeometricObject[] array = {new Circle(5), new Rectangle(4,5), new Circle(5.5), new Rectangle(2.4,5), new Circle(0.5), new Rectangle(4,65), new Circle(4.5), new Rectangle(4.4,1) ,
                new Circle(6.5), new Rectangle(4,5)}; 
        selectionSort(array, new GeometricObjectComparator());
        
        for(GeometricObject i : array) {
            System.out.println(i.getArea());
        }
        System.out.println();

        String[] list2 = {"red", "blue", "green", "yellow", "orange", "pink"};

        selectionSort(list2, new StringComparator()); 

        for(String i : list2) {
            System.out.println(i);
        }

        
    }


	public static <E> void selectionSort(E[] array,	Comparator<? super E> comparator) {
		for (int i = 0; i < array.length; i++) {
			E min = array[i];
			int minIndex = i;

			for (int j = i + 1; j < array.length; j++) {
				if (comparator.compare(min, array[j]) > 0) {
				min = array[j];
				minIndex = j;
			}
		}

	    array[minIndex] = array[i];
		array[i] = min;
		}
	}
}
 
class StringComparator implements Comparator<String>, java.io.Serializable {
   public int compare(String x, String y) {
        char c1 = x.charAt(x.length() - 1);
        char c2 = y.charAt(y.length() - 1); 
        
        if(c1 < c2) {
            return -1;
        }   
        else if(c1 == c2) {
            return 0;
        }
        else {
            return 0;
        }

   } 
}
