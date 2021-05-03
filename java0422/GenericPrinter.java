package java0422;

public class GenericPrinter<T> {

	private T material; // 재료

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return material.toString();
	}
}



