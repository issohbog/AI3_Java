package Day07.Builder;


/**
 * 빌더 패턴 
 * : 복잡한 객체를 단계적으로 구성할 수 있도록 해주는 디자인 패턴
 * */
public class Pikachu {
	
	// 변수 
	private int energy; 
	private String type; 
	private int level; 
	
	
	// private 생성자 
	// builder가 생성해주면 그걸 그대로 가져와서 인스턴스 변수 초기화 
	private Pikachu(Builder builder) {
		this.energy = builder.energy;
		this.type = builder.type;
		this.level = builder.level; 
	}
	
	// Builder 클래스를 static 클래스로 정의 
	public static class Builder {
		
		private int energy; 
		private String type; 
		private int level; 
		
		
		// 기본 생성자
		public Builder() {
			this(100, "", 1); 
		}
		
		// 매개변수 생성자 
		public Builder(int energy, String type, int level) {
			this.energy = energy; 
			this.type = type; 
			this.level = level;
		}
		
		
		// 각 변수를 초기화하고, 인스턴스를 반환하는 메소드 정의 
		// setter 역할을 하되, setting된 인스턴스를 반환함  
		public Builder energy(int energy) {
			this.energy = energy;
			return this;  					// builder 인스턴스 자기자신 반환 
		}
		
		public Builder type(String type) {
			this.type = type;
			return this; 
		}
		
		public Builder level(int level) {
			this.level = level;
			return this; 
		}
		
		// 객체를 생성해주는 매소드 
		public Pikachu build() {
			return new Pikachu(this); 
		}
		
	}// - Builder 클래스 끝

	@Override
	public String toString() {
		return "Pikachu [energy=" + energy + ", type=" + type + ", level=" + level + "]";
	}
	
	
}
