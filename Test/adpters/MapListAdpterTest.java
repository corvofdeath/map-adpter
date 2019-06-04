package adpters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

public class MapListAdpterTest {
	
	private MapListAdpter<String> mapAdpter;
	
	@Before
    public void setUp(){
		this.mapAdpter = new MapListAdpter<>(new HashMap<>());
		mapAdpter.add("Filipe");
        mapAdpter.add("Thiago");
        mapAdpter.add("Teste");
	}
	
	@Test
	public void sizeTest() {
		assertEquals(this.mapAdpter.size(), 3);
	}
	
	@Test
	public void isEmptyTest() {
		assertFalse(this.mapAdpter.isEmpty());
	}
	
	@Test
	public void containsTest() {
		assertFalse(this.mapAdpter.contains(new Object()));
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void iteratorTest() {
		this.mapAdpter.iterator();
	}
	
	@Test
	public void toArrayTest() {
		assertEquals(this.mapAdpter.toArray().length, 3);
	}
	
	@Test
	public void addTest() {
		assertTrue(this.mapAdpter.add("ok"));
		assertTrue(this.mapAdpter.remove("ok"));
	}
	
	@Test
	public void removeTest() {
		assertFalse(this.mapAdpter.remove(new Object()));
	}
	
	@Test
	public void containsAllTest() {
		assertFalse(this.mapAdpter.containsAll(new ArrayList<Object>()));
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void addAllTest() {
		this.mapAdpter.addAll(new ArrayList<String>());
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void removeAllTest() {
		this.mapAdpter.removeAll(new ArrayList<String>());
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void retainAllTest() {
		this.mapAdpter.retainAll(new ArrayList<String>());
	}

}
