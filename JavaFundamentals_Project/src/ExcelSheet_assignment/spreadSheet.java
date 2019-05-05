package ExcelSheet_assignment;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class spreadSheet {
	
	private final HashMap<Integer,HashMap<Integer,String>> data = new HashMap<>();
	
	public void setValue(int row, int column, String value){				
		HashMap<Integer, String> columnValue = data.get(row);		
		if( columnValue == null ){
			columnValue = new HashMap<>();
			data.put( row, columnValue );
		}		
		columnValue.put(column, value);
	}
	
	public String getValue(int row, int column){				
		HashMap<Integer, String> columnValue = data.get(row);		
		if( columnValue != null ){
			return columnValue.get(column);
		}		
		return null;
	}
	
	public void deleteRow(int row){
		data.remove(row);
		Set<Integer> keys = new HashSet<Integer>(data.keySet());
		for(int i : keys){
			if(i>row){
				data.put(i-1, data.get(i));
				data.remove(i);
			}
		}		
	}
	
	public void deleteColumn(int column){
		Set<Integer> keys = new HashSet<Integer>(data.keySet());
		for(int i : keys){
			HashMap<Integer,String> columnValue = data.get(i);
			columnValue.remove(column);
			Set<Integer> columnKeys = new HashSet<Integer>(columnValue.keySet());
			for(int j : columnKeys){
				if(j>column){
					columnValue.put(j-1, columnValue.get(j));
					columnValue.remove(j);
				}
			}	
		}		
	}
	
	public static void main(String a[])
    {
		spreadSheet newSheet = new spreadSheet();
		newSheet.setValue(1, 1, "Mohit");
		newSheet.setValue(1, 2, "khanna");
		
		newSheet.setValue(1, 4, "Weds");
		
		newSheet.setValue(1, 6, "Sakshi");
		newSheet.setValue(1, 7, "Nagpal");
		
		
		System.out.println(newSheet.getValue(1, 1)+ " " + newSheet.getValue(1, 2));
		System.out.println(newSheet.getValue(1, 4));
		System.out.println(newSheet.getValue(1, 6)+ " " + newSheet.getValue(1, 7));
		newSheet.deleteColumn(3);
		newSheet.deleteColumn(4);
		System.out.println(newSheet.getValue(1, 1)+ " " + newSheet.getValue(1, 2));
		System.out.println(newSheet.getValue(1, 3));
		System.out.println(newSheet.getValue(1, 4)+ " " + newSheet.getValue(1, 5));
		/*System.out.println(newSheet.getValue(1, 1)+ " " + newSheet.getValue(1, 2));
		System.out.println(newSheet.getValue(2, 1));
		System.out.println(newSheet.getValue(3, 1));
		System.out.println(newSheet.getValue(4, 1)+ " " + newSheet.getValue(4, 2));
		System.out.println(newSheet.getValue(5, 1)+ " " + newSheet.getValue(5, 2));*/
		
		/*System.out.println(newSheet.getValue(1, 1)+ " " + newSheet.getValue(1, 2));*/
        /*LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
        lhm.put(1, "practice.geeksforgeeks.org");
        lhm.put(2, "code.geeksforgeeks.org");
        lhm.put(3, "quiz.geeksforgeeks.org");
 
        // It prints the elements in same order as they were inserted    
        System.out.println(lhm);
 
        System.out.println("Getting value for key 'one': " + lhm.get(1));
        System.out.println("Size of the map: " + lhm.size());
        System.out.println("Is map empty? " + lhm.isEmpty());
        System.out.println("Contains key 'two'? "+ lhm.containsKey(2));
        System.out.println("Contains value 'practice.geeksforgeeks.org'? "
                           + lhm.containsValue("practice.geeksforgeeks.org"));
        System.out.println("delete element 'one': " + lhm.remove(1));
        System.out.println("Getting value for key 'one': " + lhm.get(1));*/
        
    }
}
