class circle {
	private int radians;
	private int area;
	
	void setradians(int r) {
		this.radians = r;
	}
	
	void setarea(int a) {
		this.area = a;
	}
	
	void fixra() {
		System.out.println("this radians : ");
	}
	
	void fisar() {
		System.out.println("this area : ");
	}

	@Override	
	public String toString() {
		return this.radians + " this area : ";
	}
}
