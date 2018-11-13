import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Jiexuan Li
 * @since 11-12-2018
 */
public class Document {

	private String name;
	private int ISBN;
	private ArrayList<String> authors;
	private Style style;	//not using for this implementation
	private Format format;	//not using for this implementation
	private String filePath;
	private double price;
	
	public Document(String n, int I, ArrayList<String> a, String path, Double p)
	{
		setName(n);
		ISBN=I;
		authors=(ArrayList<String>) a.clone();
		setFilePath(path);
		price=p;
		//In this implementation style and format are not used.
	}
	
	public boolean removeAuthor(int index)
	{
		if(index<0||index>authors.size()) //so no exception is thrown.
			return false;		
		authors.remove(index);		
		return true;		
	}
	
	public boolean addAuthor(int index, String name)
	{
		if(authors.size()<index||index<0) //so no exception is thrown
			return false;
		authors.add(index, name);
		return true;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the iSBN
	 */
	public int getISBN() {
		return ISBN;
	}


	public boolean equals(Document first, Document second)
	{
		if(first.ISBN==second.ISBN)
			return true;
		else
			return false;
	}

	/**
	 * @return the filePath
	 */
	public String getFilePath() {
		return filePath;
	}

	/**
	 * @param filePath the filePath to set
	 */
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public Double getPrice(){
	    return price;
	}
	public void setPrice(double p){
	    price=p;
	}
	
}
