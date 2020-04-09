class Student {
	String index;
	String firstName;
	String lastName;

	List<Integer> labPoints = new ArrayList<>();

	public Student(String index, String firstName, String lastName, List<Integer> labPoints) {
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.labPoints = labPoints;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getIndex() {
		return index;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLabPoints(List<Integer> labPoints) {
		this.labPoints = labPoints;
	}

	public List<Integer> getLabPoints() {
		return labPoints;
	}

	public double getAverage() {

		int sum = 0;
		for (Integer point: labPoints) {
			sum += point;
		}

		double avg = (double) sum/labPoints.size();
		return avg;
	}

	public boolean hasSignature() {
		return labPoints.size() > 8;
	}
}
