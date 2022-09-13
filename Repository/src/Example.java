import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Example {

	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(1, 2, 3, 4, 5);
		Iterator<Integer> itr = l.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
