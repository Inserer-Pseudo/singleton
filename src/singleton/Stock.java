package singleton;

import java.util.ArrayList;

public class Stock {
	private static final Stock _instance = new Stock;
	private Stock() {}
	private Stock getInstance(){
		return _instance;
	}
	private ArrayList<String> m_list = new ArrayList<String>();
	public void addString(String _word) {
		m_list.add(_word);
	}

	public void display() {
		System.out.println("---- Contenu Stock -------");
		for (String s : m_list) {
			System.out.println(s);
		}
	}
}
