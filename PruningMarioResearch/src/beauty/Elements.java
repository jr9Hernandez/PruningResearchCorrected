package beauty;

public class Elements {

	private int idElem;
	private int typeElem;
	private int width;
	private int heigth;
	private int bigType; //corresponds if the element is a gap, a terrain or a floating object. 0,1,2 in this order.
	
	public Elements()
	{
		
	}
	public Elements cloneElements(Elements objReceived, int newId)
	{
		Elements objNewElement=new Elements();
		objNewElement.idElem=newId;
		objNewElement.typeElem=objReceived.typeElem;
		objNewElement.width=objReceived.width;
		objNewElement.heigth=objReceived.heigth;
		objNewElement.bigType=objReceived.bigType;
		return objNewElement;
	}

	public int getIdElem() {
		return idElem;
	}

	public void setIdElem(int idElem) {
		this.idElem = idElem;
	}

	public int getTypeElem() {
		return typeElem;
	}

	public void setTypeElem(int typeElem) {
		this.typeElem = typeElem;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeigth() {
		return heigth;
	}

	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}
	
	public int getBigType() {
		return bigType;
	}

	public void setBigType(int bigType) {
		this.bigType = bigType;
	}
	
	
}
