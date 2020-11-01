package pp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FuncDemo {

	public static void main(String[] args) {

		
//		  Optional obj = Optional.of("  ");   
//		  obj= obj.empty();
//		  System.out.println(obj.isEmpty());
//		 

		// String a = " ";
		// System.out.println(a.isBlank());
		
		
//
//		String b = "This   \n" + "is  a  good  \n" + "book";
//		
//		b.lines().forEach(System.out :: println);
//		
//		List<String> les = b.lines().collect(Collectors.toList());
//		
//		System.out.println(les);
		
		
//		String     s1  =    "This is Good Tea";
//        System.out.println(s1.repeat(10));
//        
//        
        
        var   ls  =    new ArrayList<String>();
        var    st  =	ls.stream();

        var  newList =  List.of("AA","BB","CC","DD","EE");
        newList.forEach(System.out::println);
		
		

	}

}
