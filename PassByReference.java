package justForPractice;

import java.util.ArrayList;

public class PassByReference {
    public void ref(ArrayList<Integer> list){
    	ArrayList<Integer> list1=new ArrayList<Integer>();
    	list1.addAll(list);
    	list1.add(5);
    	list1.add(6);
    	
    	for(Integer e:list1) {
    		System.out.println(e);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		PassByReference passByReference =new PassByReference();
		passByReference.ref(list);
		System.out.println("Main");
		for(Integer e:list) {
    		System.out.println(e);
    	}
		
	}

}
