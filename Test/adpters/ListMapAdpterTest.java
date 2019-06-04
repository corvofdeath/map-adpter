package adpters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class ListMapAdpterTest {
	
	ListMapAdpter<String> listAdpter;;

	@Before
    public void setUp(){
		this.listAdpter = new ListMapAdpter<>(new ArrayList<>());
	     listAdpter.put("Key", "Filipe");
	     listAdpter.put("Key", "Teste");
	     listAdpter.put("Key", "Thiago");
	}
	
	@Test
	public void sizeTest() {
		assertEquals(this.listAdpter.size(), 3);
	}
	
	@Test
	public void isEmptyTest() {
		assertFalse(this.listAdpter.isEmpty());
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void containsKeyTest() {
		this.listAdpter.containsKey(new Object());
	}
	
	@Test
	public void containsValueTest() {
		assertFalse(this.listAdpter.containsValue(new Object()));
	}
	
	@Test
	public void getTest() {
		assertEquals(this.listAdpter.get("Thiago"), "Thiago");
	}
	
	@Test
	public void putTest() {
		listAdpter.put("Key", "Thiago");
		assertEquals(this.listAdpter.size(), 4);
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void keySetTest() {
		this.listAdpter.keySet();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void valuesTest() {
		this.listAdpter.values();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void entrySetTest() {
		this.listAdpter.entrySet();
	}
	
}
