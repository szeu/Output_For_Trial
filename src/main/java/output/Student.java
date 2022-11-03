package output;

public class Student implements Comparable<Student> {
	private String student_name;
	private String student_id;
	private String student_email;
	private int K1_energy;
	private int K2_energy;
	private boolean K3_tick1;
	private boolean K3_tick2;
	private boolean my_preference;
	private String concerns;
	
	public Student(String name, String id, String email, int K1, int K2, boolean K3_1, boolean K3_2, boolean pref, String concern) {
		this.student_name = name;
		this.student_id = id;
		this.student_email = email;
		this.K1_energy = K1;
		this.K2_energy = K2;
		this.K3_tick1 = K3_1;
		this.K3_tick2 = K3_2;
		this.my_preference = pref;
		this.concerns = concern;
	}
	
	@Override
	public int compareTo(Student o) {
		if(this.K1_energy < o.K1_energy)
			return 1;
		else if(this.K1_energy == o.K1_energy)
			return 0;
		else return -1;
	}

	public String getName() {
		return student_name;
	}
	
	public String getID() {
		return student_id;
	}
	
	public String getEmail() {
		return student_email;
	}
	
	public int getK1Energy() {
		return K1_energy;
	}
	
	public int getK2Energy() {
		return K2_energy;
	}
	
	public boolean getK3Tick1() {
		return K3_tick1;
	}
	
	public boolean getK3Tick2() {
		return K3_tick2;
	}
	
	public boolean getPreference() {
		return my_preference;
	}
	
	public String getConcerns() {
		return concerns;
	}
}
