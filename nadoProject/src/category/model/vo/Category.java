package category.model.vo;

public class Category implements java.io.Serializable {
	private static final long serialVersionUID = 401L;
	
	private int cateNo;
	private String cateName;
	private String cateColor;
	
	public Category() {}

	public Category(int cateNo, String cateName, String cateColor) {
		super();
		this.cateNo = cateNo;
		this.cateName = cateName;
		this.cateColor = cateColor;
	}

	public int getCateNo() {
		return cateNo;
	}

	public void setCateNo(int cateNo) {
		this.cateNo = cateNo;
	}

	public String getCateName() {
		return cateName;
	}

	public void setCateName(String cateName) {
		this.cateName = cateName;
	}

	public String getCateColor() {
		return cateColor;
	}

	public void setCateColor(String cateColor) {
		this.cateColor = cateColor;
	}

	@Override
	public String toString() {
		return "Category [cateNo=" + cateNo + ", cateName=" + cateName + ", cateColor=" + cateColor + "]";
	}
	
	
}
