

import static org.junit.Assert.*;


import  org.junit.Test;


public class Test_sortTest {


	  
	@Test
    public void test()
    {
		int arr1[]={4,5,0,1,2,7,9,3,8,6};
        int arr2[]={0,1,2,3,4,5,6,7,8,9};
        
        //assertEquals
        assertArrayEquals(arr2, Test_sort.shakesort(arr1) );
    }

       
    public static void main(String[] args)
    {
    	Test_sortTest tst = new Test_sortTest();
    	
    	tst.test();
   }
}

